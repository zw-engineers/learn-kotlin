fun main(args: Array<String>) {
    println("Hello World")

    /*VARIABLES*/

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

    /*TYPES*/

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