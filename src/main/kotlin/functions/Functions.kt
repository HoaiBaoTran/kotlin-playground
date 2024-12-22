import java.time.LocalDate

fun printName(name: String) {
    println("Name is $name")
}

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun addition_different(a: Int, b: Int): Int = a + b

fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
) {
    println("Name is $name and the email is $email and the dob is $dob")
}

fun main() {
//    val unit = printName("Luffy")
//    println("unit is $unit")
//    val result = addition(1, 2)
//    println("result is $result")
//    val result_different = addition(1, 2)
//    println("result is $result_different")
    printPersonDetails("Luffy", "luffyekko@gmail.com", LocalDate.parse("2001-01-01"))
    printPersonDetails("Luffy")
    printPersonDetails(name = "Luffy", email = "ekko@gmail.com", dob = LocalDate.parse("2002-04-11"))
}