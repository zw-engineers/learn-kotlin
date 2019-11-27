package learn.kotlin.functional

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

const val EVENTS_MANAGEMENT = "events management"

class StudentTest {

    private val university: University = University()
    private val artemas = Student("artemas", "muzanenhamo", Degree("computer science"), Tutor("thomas", "jenkins"))
    private val jane = Student("jane", "doe", Degree("pure mathematics"), Tutor("carmelo", "anthony"))
    private val mark = Student("mark", "thompson", Degree("law"), Tutor("kobe", "bryant"))
    private val sarah = Student("sarah", "smith", Degree(EVENTS_MANAGEMENT), Tutor("lebron", "james"))
    private val thomas = Student(null, "cook", Degree("computer science"), Tutor("thomas", "jenkins"))
    private val shawn = Student("shawn", "marion", Degree(null), Tutor("carmelo", "anthony"))
    private val tarah = Student("tarah", "smith", null, Tutor("carmelo", "anthony"))
    private val robert = Student("robert", null, Degree("law"), Tutor("kobe", "bryant"))
    private val jess = Student("jess", null, Degree(EVENTS_MANAGEMENT), Tutor(null, "james"))
    private val laura = Student("laura", "jackson", Degree(EVENTS_MANAGEMENT), Tutor(null, null))
    private val kendrick = Student("kendrick", "perkins", Degree(EVENTS_MANAGEMENT), null)

    @Test
    @DisplayName("Should return all computer science students sorted by the degree name")
    fun allComputerScienceStudentsSorted() {
        val students = listOf(artemas, jane, mark, sarah)

        val csStudentsSorted = university.getCompScienceStudentsSortedByDegree(students)

        assertThat(csStudentsSorted).isNotEmpty
        assertThat(csStudentsSorted).hasSize(4)
        assertThat(csStudentsSorted).containsExactly(artemas, sarah, mark, jane)
    }

    @Test
    @DisplayName("Should return all events management students sorted by the degree name")
    fun allEventsManagementStudentsByDegree() {
        val allStudents = listOf(artemas, jane, mark, sarah, thomas, shawn, tarah, robert, jess, laura, kendrick, null)

        val eventManagementStudents = university.getEventManagementStudentsSortedByDegreeTitle(allStudents)

        assertThat(eventManagementStudents).isNotEmpty
        assertThat(eventManagementStudents).hasSize(4)
        assertThat(eventManagementStudents).containsExactly(jess, kendrick, laura, sarah)
    }
}