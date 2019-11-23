package learn.kotlin.playground

fun main(args: Array<String>) {
    println()
    println("/*ARRAYS*/")
    println("==============")

    val myArray = arrayOf(1, 1.23, "Artemas")
    println(myArray)
    myArray[1] = 3.14
    println("Array length: ${myArray.size}")
    println("Doug in Array: ${myArray.contains<Any>("Doug")}")

    val partArray = myArray.copyOfRange(0, 1)
    println("First: ${myArray.first()}")
    println("Artemas index: ${myArray.indexOf<Any>("Artemas")}")
}