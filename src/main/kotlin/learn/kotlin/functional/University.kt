package learn.kotlin.functional

class University {

    fun getCompScienceStudentsSortedByDegree(students: List<Student>): List<Student> {
        return students
                .sortedBy { student -> student.degree?.title }
    }

    fun getEventManagementStudentsSortedByDegreeTitle(students: List<Student?>?): List<Student?> {
        return students.orEmpty()
                .filter { student -> EVENTS_MANAGEMENT == student?.degree?.title }
                .sortedBy { student -> student?.degree?.title }
    }

    companion object {
        const val EVENTS_MANAGEMENT = "events management"
    }
}

data class Student(val firstName: String?, val surname: String?, val degree: Degree?, val tutor: Tutor?)

data class Degree(internal val title: String?)

data class Tutor(val firstName: String?, val surname: String?)
