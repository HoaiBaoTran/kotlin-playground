package collections

import dataset.Course
import dataset.CourseCategory
import dataset.courseList

fun main() {
    val namesListUsingSequence = listOf("alex", "bex", "chloe")
        .asSequence()
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList()

    println("namesListUsingSequence: $namesListUsingSequence")

    exploreFilterUsingSequence(
        courseList()
    ) { c: Course -> c.category == CourseCategory.DEVELOPEMENT }

    val range = 1..1000_000_000
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach { println("Value: $it") }
}

fun exploreFilterUsingSequence(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    val developmentCourses = courseList
        .asSequence()
        .filter(predicate)
        .forEach { println("devCourses: $it") }
}