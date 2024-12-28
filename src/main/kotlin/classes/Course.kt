@file:JvmName("CourseUtils")

package classes

import com.kotlinplayground.CourseJava

data class Course @JvmOverloads constructor(
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
) {

    @JvmField
    var noOfCourses = 10

    companion object {

        @JvmStatic
        fun printName2(name: String = "default") {
            println("Name: $name")
        }
    }
}

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

@JvmName("printName1")
@JvmOverloads
fun printName(name: String = "default") {
    println("Name: $name")
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
