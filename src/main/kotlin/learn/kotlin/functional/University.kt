package learn.kotlin.functional

class University {
    fun getCompScienceStudentsSortedByDegree(students: List<Student>): List<Student> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

data class Student(val firstName: String, val surname: String, val degree: Degree, val tutor: Tutor)

data class Degree(val title: String)

data class Tutor(val firstName: String, val surname: String)
