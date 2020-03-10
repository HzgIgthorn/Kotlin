package tobi.udemy.chalange1

fun main(args: Array<String>) {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 hat die gleiche Referenz wie hello2: ${hello1===hello2}")

    println("hello1 hat den gleichen Wert wie hello2: ${hello1==hello2}")

    var int1 = 2988
    val any: Any
    any = "Der Type Any ist das Object bei Kotlin"
    if(any is String)
        println(any.toUpperCase())

    println("     1\r\n    11\r\n   111\r\n  1111")

    println("""     1
        |    11
        |   111
        |  1111""".trimMargin())
    println("""1     1
        1    11
        1   111
        1  1111""".trimMargin("1"))
}