package main.kotlin.learn.kotlin.playground

import java.util.stream.Collectors
import java.util.stream.Collectors.mapping
import kotlin.streams.toList

fun main(args: Array<String>) {
    println(getNumbersLessThan10())
    println(getLetterUpperCasedAndOrdered())
    println(getStudentsStudyingEnglish())
    println(getStudentsStudyingMathsGroupByAgeDesc())
}

fun getNumbersLessThan10(): List<Int> {
    val numberStringList = listOf("1", "2", "3", "10", "20")
    return numberStringList
            .map { Integer.valueOf(it)}
            .filter { it < 10 }
}

fun getLetterUpperCasedAndOrdered(): List<String> {
    val letters = listOf("z", "c", "h", "a", "j", "f", "i", "b")
    return letters
            .stream()
            .map { it.toUpperCase() }
            .sorted()
            .sequential()
            .toList()
}

data class Student(
        val name: String,
        val surname: String,
        val age: Int,
        val subjects: List<String>
)

fun generatedStudents(): List<Student> {
    val artemas = Student("Artemas", "Muzanenhamo", 29, listOf("English", "Computer Science", "Mathematics"))
    val thomas = Student("Thomas", "Jenkins", 32, listOf("Geography", "English", "Law"))
    val kirsty = Student("Kirsty", "Smith", 30, listOf("Bio-Chemistry", "Mathematics", "Information Systems"))

    return listOf(artemas, kirsty, thomas)
}

fun getStudentsStudyingEnglish(): List<Student> {
    return generatedStudents()
            .stream()
            .filter { it.subjects.contains("English") }
            .sequential()
            .toList()
}

// TODO: Grouping by Age
fun getStudentsStudyingMathsGroupByAgeDesc(): Map<List<Int>, List<Student>> {

//    Collectors.groupingBy(
//            Function<Any, Any> { main.kotlin.learn.kotlin.playground.Student.getDepartment() },
//            Collectors.counting<Any>()
//    )

    return generatedStudents()
            .stream()
            .filter { it.subjects.contains("Mathematics") }
            .collect(Collectors.groupingBy {
                Student::subjects,
                // TODO:
                mapping(Student::age, Collectors.toList<>())
            })
}


// TODO: Grouping by Subject Name
// TODO: Grouping by First Name
// TODO: Grouping by Last Name