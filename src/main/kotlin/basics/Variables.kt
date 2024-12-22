package basics

import functions.courseName
import functions.topLevelFunction

fun main() {
    val name = "Luffy";
    println("Hello $name")

    var age = 20
    println(age)
    age = 10
    println(age)

    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("course : $course and the course length is ${course.length}")

    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLine1 = """
        ABC
        DEF
        GFH
    """.trimIndent()

    println(multiLine1)

    topLevelFunction()
    val num = topLevelFunction()
    println("num is $num")
    println("courseName is $courseName and the course length is ${courseName.length}")
}