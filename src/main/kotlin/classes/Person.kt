package classes

class Person(
    val name: String = "Ekko",
    val age: Int = 10
) {
    var email: String = ""
    var nameLength: Int = 0
    init {
        println("Inside Init Block")
        nameLength = name.length
    }
    constructor(
        _email: String,
        _name: String = "",
        _age: Int = 0) : this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person walks")
    }
}

fun main() {
    val person = Person("Luffy", 20)
    person.action()

    println("Name : ${person.name} and the age is ${person.age}")

    val person_different = Person()
    println("Name : ${person_different.name} and the age is ${person_different.age}")

    val person2 = Person(_email = "luffy@gmail.com", "Luffy", 99)
    println("Name : ${person2.name} and the age is ${person2.age} " +
            "and the email is ${person2.email} ${person2.nameLength}")

}