package collections

import dataset.Course
import dataset.CourseCategory
import dataset.KAFKA
import dataset.courseList

fun main() {
    val courseList = courseList()
    val devPredicate = { course: Course -> course.category == CourseCategory.DEVELOPEMENT }
    val designPredicate = { course: Course -> course.category == CourseCategory.DESIGN }

    val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
//    val map = list
//        .map { outerList -> outerList.map { it.toDouble() } }
//
//    println("mapResult: $map")
//
//    val flatMapResult = list
//        .flatMap { outerList -> outerList.map { it.toDouble() } }
//    println("flatMapResult: $flatMapResult")
//
//    exploreFilter(courseList, devPredicate)
//    exploreFilter(courseList, designPredicate)
//
//    exploreMap(courseList, designPredicate)
//    val courses = exploreFlatMap(courseList, KAFKA)
//    println("courses: $courses")

//    exploreHashMap()
    collections_nullability()
}

fun collections_nullability() {
    var list : MutableList<String>? = null
    list = mutableListOf()
    list.add("Luffy")
    list.forEach {
        println("Value is : $it")
    }

    val list1 : List<String?> = listOf("Adam", null, "Alex")
    list1.forEach {
        println("Value length : ${it?.length}")

    }
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Luffy" to 20, "Ekko" to 10)
    nameAgeMutableMap
        .forEach { (key, value) ->
            println("Key: $key Value: $value")
        }

    val luffyAge = nameAgeMutableMap.getOrElse("Luffy1") {"abc"}
//    val luffyAge = nameAgeMutableMap["Luffy"]
    println(luffyAge)

    val result = nameAgeMutableMap.containsKey("Luffy")
    println("result: $result")

    val filterMap = nameAgeMutableMap
        .filterKeys { it.length > 4 }
        .map { it.key.uppercase() }

    println("filterMap: $filterMap")

    val maxAge = nameAgeMutableMap.maxByOrNull { it.value }
    println("maxAge: $maxAge")
}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String): List<String> {
    val kafkaCourses = courseList
        .flatMap { course ->
            val courseName = course.name
            course.topicsCovered
                .filter { it == kafka }
                .map { courseName }
        }
    return kafkaCourses
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    val developmentCourses = courseList
        .filter(predicate)
        .forEach { println("devCourses: $it") }
}

fun exploreMap(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    val courseNameList = courseList
        .filter { predicate.invoke(it) }
        .map { "${it.name} - ${it.category}" }
        .forEach { println(it) }
    println(courseNameList)
}
