fun main(args: Array<String>) {

    val numberStringList = listOf("1", "2", "3", "10", "20")
    numberStringList
            .map { Integer.valueOf(it)}
            .forEach { print(it) }
}