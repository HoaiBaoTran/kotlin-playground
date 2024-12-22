package collections

fun main() {

    val names = listOf("Luffy", "Ekko", "Jinx")
    println("Names: $names")

    val namesMutableList = mutableListOf("Luffy", "Ekko", "Jinx")
    println("namesMutableList: $namesMutableList")
    namesMutableList.add("Faker")
    println("namesMutableList: $namesMutableList")

    val set = setOf("Luffy", "Ekko", "Jinx")
    println("set: $set")

    val setMutableList = mutableSetOf("Luffy", "Ekko", "Jinx")
    println("setMutableList: $setMutableList")
    setMutableList.add("Faker")
    println("setMutableList: $setMutableList")

    val map = mapOf("Luffy" to 1, "Ekko" to 2, "Jinx" to 3)
    println("map: $map")
    val mapMultableList = mutableMapOf("Luffy" to 1, "Ekko" to 2, "Jinx" to 3)
    println("mapMultableList: $mapMultableList")
    mapMultableList["abc"] = 100
    println("mapMultableList: $mapMultableList")

}