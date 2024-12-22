package interfaces

import classes.Course

interface CourseRepository {
    val isCoursePersisted: Boolean
    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("Saving course: $course")
        return course.id
    }
}

interface Repository {
    fun getAll(): Any
}

class SqlCourseRepository: CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(
            id,
            "Reactive Programming in Modern Java using Project Reactor",
            "Luffy"
        )
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository: CourseRepository {
    override val isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course {
        return Course(
            id,
            "Reactive Programming in Modern Java using Project Reactor",
            "Luffy"
        )
    }

    override fun save(course: Course): Int {
        println("Saving course in NoSQL: $course")
        return course.id
    }
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("do something in AB")
    }

}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println(course)
    println(sqlCourseRepository.isCoursePersisted)
    sqlCourseRepository.save(course)
    println(sqlCourseRepository.isCoursePersisted)

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(1)
    println(course1)
    noSqlCourseRepository.save(course1)

    val ab = AB()
    ab.doSomething()
}