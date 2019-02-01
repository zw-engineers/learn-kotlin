fun main(args: Array<String>) {
    println()
    println("/*COLLECTIONS*/")
    println("==============")

//    Sqaure Array
    val sqArray = Array(5) { x -> x * x }
    println(sqArray[2]) // Because 4 = 2 * 2

//    Typed Array
    val arr2: Array<Int> = arrayOf(1, 2, 3)
//    val arr2: Array<Int> = arrayOf(1, 2, 3, "Hello") <-- NOT VALID
}