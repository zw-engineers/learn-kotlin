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

    println()
    println("/*CASTING*/")
    println("==============")
    println("3.14 to Int: " + (3.14.toInt()))
    println("A to Int: " + ('A'.toInt()))
    println("65 to Char: "+ 65.toChar())

    println()
    println("/*STRINGS*/")
    println("==============")
    val myName = "Artemas Muzanenhamo"
    val longStr = """This is a
        |long string
    """.trimMargin()

    var fName: String = "Doug"
    val lName: String = "Smith"

    fName = "Sally"

    val fullName = "$fName $lName"

    println("Name: $fullName")
    println(longStr)
    println("1 + 2 = ${1 + 2}")
    println("String length: ${longStr.length}")

    val str1 = "A random string"
    val str2 = "a random string"
    val str3 = "Hello"
    val str4 = "Hello"

//    String Equality
    println("Strings Equal: ${str1.equals(str2)}")
    println("Strings Equal: ${str3 == str4}")
//    String Comparison
    println("Compare Strings: + ${"A".compareTo("B")}")
//    Get String index
    println("2nd Index: ${str2[2]}")
//    Get Strings in range
    println("Index 2 - 7: ${str1.subSequence(2, 8)}")
//    Check if String contains
    println("Contains the word random : ${str1.contains("Random")}")

    println()
    println("/*ARRAYS*/")
    println("==============")

    val myArray = arrayOf(1, 1.23, "Artemas")
    println(myArray)
    myArray[1] = 3.14
    println("Array length: ${myArray.size}")
    println("Doug in Array: ${myArray.contains("Doug")}")

    val partArray = myArray.copyOfRange(0, 1)
    println("First: ${myArray.first()}")
    println("Artemas index: ${myArray.indexOf("Artemas")}")

    println()
    println("/*COLLECTIONS*/")
    println("==============")

//    Sqaure Array
    val sqArray = Array(5) { x -> x * x}
    println(sqArray[2]) // Because 4 = 2 * 2

//    Typed Array
    val arr2: Array<Int> = arrayOf(1, 2, 3)
//    val arr2: Array<Int> = arrayOf(1, 2, 3, "Hello") <-- NOT VALID

//    Ranges
}