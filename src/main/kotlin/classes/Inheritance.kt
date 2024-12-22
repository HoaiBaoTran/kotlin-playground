package classes

open class User(val name: String) {
    open val isLoggedIn: Boolean = false
    open fun login() {
        println("Inside user Login")
    }
    private fun secret() {
        println("Inside user Login")
    }
    protected open fun logout() {
        println("Inside user Login")
    }
}

class Student(name: String) : User(name) {
    override val isLoggedIn: Boolean = true

    companion object {
        const val noOfEnrolledCourses = 10
        fun country() = "USA"
    }

    override fun login() {
        println("Inside Student Login")
        super.login()
    }

    override fun logout() {
        super.logout()
        println("Inside Student Logout")
    }
}

class Instructor(name: String) : User(name) {

}

fun main() {

    val student = Student("Luffy")
    println("Student name is ${student.name}")
    student.login()
    println(student.isLoggedIn)
    val country = Student.country()
    println("country: $country")
    println("noOfEnrolledCourses: ${Student.noOfEnrolledCourses}")

    val instructor = Instructor("Ekko")
    println("Instructor name is ${instructor.name}")
    instructor.login()

    val user = User("Ekko")
}