fun main(args: Array<String>) {
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
}