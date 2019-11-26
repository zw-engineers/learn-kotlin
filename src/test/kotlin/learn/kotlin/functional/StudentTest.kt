package learn.kotlin.functional

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class StudentTest {

    private val university: University = University()
    private val artemas = Student("artemas", "muzanenhamo", Degree("computer science"), Tutor("thomas", "jenkins"))
    private val jane = Student("jane", "doe", Degree("computer science"), Tutor("carmelo", "anthony"))
    private val mark = Student("mark", "thompson", Degree("computer science"), Tutor("kobe", "bryant"))
    private val sarah = Student("sarah", "smith", Degree("computer science"), Tutor("lebron", "james"))


    @Test
    @DisplayName("Should return all computer science students sorted by the degree name")
    fun allComputerScienceStudentsSorted() {
        val students = listOf(artemas, jane, mark, sarah)

        val csStudentsSorted = university.getCompScienceStudentsSortedByDegree(students)

        assertThat(csStudentsSorted).isNotEmpty
    }
}