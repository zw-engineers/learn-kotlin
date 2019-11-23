package learn.kotlin.playground

fun main(args: Array<String>) {
    println("Hello World")

    println()
    println("/*VARIABLES*/")
    println("==============")

//    Val = Immutable/Read only variable
    val name = "Artemas"
//    name = "Takudzwa" << - Not valid as variable is immutable
    println(name + "Something")

//    var = Mutable variable
    var age = 29
    age = 28 // Valid to change as variable is mutable
    println(age)

//    Types are optional, but you can define types with your variables
    val bigInt: Int = Int.MAX_VALUE
    val smallInt: Int = Int.MIN_VALUE

    println("Biggest Int: " + bigInt)
    println("Smallest Int: $smallInt") // String interpolation
}