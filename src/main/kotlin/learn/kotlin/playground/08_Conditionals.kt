package main.kotlin.learn.kotlin.playground

fun main(args: Array<String>) {
    println()
    println("/*CONDITIONALS*/")
    println("==============")

    val myAge = 8

    if (myAge < 5) {
        println("Go to Preschool")
    } else if (myAge == 5) {
        println("Go to Kindergarten")
    } else if ((myAge > 5) && (myAge <= 17)) {
        val grade = myAge - 5
        println("Go to Grade $grade")
    } else {
        println("Go to College")
    }

//    When
    when (myAge) {
        0, 1, 2, 3, 4 -> println("Go to Preschool")

        5 -> println("Go to Kindergarten")

        in 6..17 -> {
            val grade = myAge - 5
            println("Go to Grade $grade")
        }

        else -> println("Go to College")
    }
}