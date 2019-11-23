package main.kotlin.learn.kotlin.playground

fun main(args: Array<String>) {
    println()
    println("/*TYPES*/")
    println("==============")

//    Long
    val bigLong: Long = Long.MAX_VALUE
    val smallestLong: Long = Long.MIN_VALUE

    println("Biggest Long: $bigLong")
    println("Smallest Long: $smallestLong")

//    Double
    val bigDouble: Double = Double.MAX_VALUE
    val smallestDouble: Double = Double.MIN_VALUE
    println("Biggest Double: $bigDouble")
    println("Smallest Double: $smallestDouble")

//    Float
    val bigFloat: Float = Float.MAX_VALUE
    val smallestFloat: Float = Float.MIN_VALUE
    println("Biggest Float: $bigFloat")
    println("Smallest Float: $smallestFloat")

    /*
    * There is a loss of Precision when
    * working with floating numbers.
    * */

    val dubNum1: Double = 1.111111111111111
    val dubNum2: Double = 1.1111111111111111

    println("Sum: " + (dubNum1 + dubNum2))
//  prints ->   Sum: 2.2222222222222223 and it loses precision on the 16th digit.

//    Booleans - Can have a value of true or false
    if (true is Boolean) {
        println("true is boolean")
    }

//    Char
    val letterGrade: Char = 'A'
    println("A is a Char: ${letterGrade is Char}")
}