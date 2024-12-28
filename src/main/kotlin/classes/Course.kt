package classes

import com.kotlinplayground.CourseJava

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course = Course(
        1,
        "Reactive Programming in Modern Java using Project Reactor",
        "Luffy"
    )

    println(course)

    val course1 = Course(
        1,
        "Reactive Programming in Modern Java using Project Reactor",
        "Luffy"
    )

    val course3 = course1.copy(
        id = 2,
        author = "Ekko"
    )

    println(course3)

    println("Checking Object Equality : ${course == course1}")

    val marketingCourse = Course(
        1,
        "Facebook Marketing",
        "HoaiBao",
        CourseCategory.MARKETING
    )
    println(marketingCourse)

    val courseJava = CourseJava(
        1,
        "Facebook Marketing",
        "HoaiBao"
    )

    println("courseJava: $courseJava")
    courseJava.id = 3
    courseJava.name = "abc"
    println("courseJava: $courseJava")

}
