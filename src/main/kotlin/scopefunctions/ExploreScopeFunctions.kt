package scopefunctions

import classes.Course
import classes.CourseCategory

fun main() {
//    exploreApply()
//    exploreAlso()
//    exploreLet()
//    exploreWith()
    exploreRun()
}

fun exploreRun() {
    var numbers: MutableList<Int>? = null
    val result = numbers.run {
        numbers = mutableListOf(1, 2, 3)
        numbers?.sum()
    }
    println("Run result: $result")

    val length = run {
        val name = "Luffy"
        println(name)
        name.length
    }
    println("Run length: $length")

}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    val result = with(numbers) {
//        println("Size is ${numbers.size}")
//        val list = numbers.plus(6)
//        list.sum()
        println("Size is $size")
        val list = plus(6)
        list.sum()
    }

    println("With result is $result")
}

fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.map { it * 2 }.filter { it > 5 }.let {
        println(it)
        it.sum()
    }
    println("result: $result")

    var name: String? = null
    name = "Luffy"
    val result1 = name.let {
        println(it)
        it.uppercase()
    }
    println(result1)

}

fun exploreApply() {
    val course = Course(
        1,
        "Design Thinking in Kotlin",
        "Luffy"
    ).apply {
//        courseCategory = CourseCategory.DESIGN
        this.courseCategory = CourseCategory.DESIGN
    }

    println("course: $course")
}

fun exploreAlso() {
    val course = Course(
        1,
        "Design Thinking in Kotlin",
        "Luffy"
    ).also {
//        it.courseCategory = CourseCategory.DESIGN
//        this.courseCategory = CourseCategory.DESIGN
        println("Course $it")
    }
}

