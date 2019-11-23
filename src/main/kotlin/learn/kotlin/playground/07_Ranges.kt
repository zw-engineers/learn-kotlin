package learn.kotlin.playground

fun main(args: Array<String>) {
    println()
    println("/*RANGES*/")
    println("==============")

    val oneToTen = 1..10
    for (x in oneToTen) println("ONE TO TEN : $x")

    for (x in oneToTen.reversed()) println("REVERSED : $x")

    val alphabet = "A".."Z"
    println("R in Alpha : ${"R" in alphabet}")

    val tenToOne = 10.downTo(1)
    for (x in tenToOne) println("TEN TO ONE : $x")

    val twoTo20 = 2.rangeTo(20)
    for (x in twoTo20) println("TWO TO 20 : $x")

    val range3 = oneToTen.step(3)
    for (x in range3) println("RANGE 3 : $x")
}