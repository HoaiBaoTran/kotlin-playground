package classes

data class Employee(
    val id: Int,
    val name: String
)

fun main() {
    val employee = Employee(1, "Luffy")
    println(employee)
    val different_employee = Employee(1, "Luffy")
    println(different_employee == employee)
    val another_employee = employee.copy(
        2
    )
    println(another_employee)
}