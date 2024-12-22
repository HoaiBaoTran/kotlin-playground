package nulls

data class Movie(
    val id: Int?,
    val name: String
)

fun printName(name: String) {
    println("Name is : $name")
}

fun printName1(name: String?) {
    println("Name is : $name")
}

fun main() {
    var nameNullable: String? = null
//    printName(nameNullable!!)
    nameNullable?.run {
        printName(this)
    }
//    if (nameNullable != null) {
//        println("Value is ${nameNullable?.length}")
//    }
    println("Value is ${nameNullable?.length}")
//    nameNullable = "Luffy"
//    val length = nameNullable?.length?.toLong() ?: 0
//    println("length: $length")

    nameNullable = "Luffy"
    val length = nameNullable.length.toLong() ?: 0
    println("length: $length")

    println("Value is $nameNullable")

    var name: String = "Ekko"
    printName1(name)

    val movie = Movie(null, "Avengers")
    val newMovie = saveMovie(movie)
    println(newMovie.id!!)
    println(newMovie)

}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
//    return movie
}
