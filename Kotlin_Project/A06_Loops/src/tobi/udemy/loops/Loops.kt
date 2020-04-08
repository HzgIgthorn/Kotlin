package tobi.udemy.loops

val MAX: Int = 37

fun main(args: Array<String>) {

    var range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)

    nL()

    val backRange = 5.downTo(1)
    println(5 in backRange)

    nL()

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    println(3 in stepThree)
    println(4 in stepThree)

    val reversedRange = stepThree.reversed()
    println(reversedRange)

    nL()

    for(i in range) print("$i, ")
    println()
    for(i in stepThree) print("$i, ")
    println()
    for(i in reversedRange) print("$i, ")
    println()
    for(i in 1..10) print("$i, ")
    println()

    nL()

    for(s in "Hello World") print("$s, ")
    println()
    for(i in 1..20 step 2) print("$i, ")
    println()
    for(i in 20 downTo 15) print("$i, ")
    println()
    for(i in 20 downTo 5 step 5) print("$i, ")
    println()

    nL()

    for(i in 1 until 10) print("$i, ")
    println()

    nL()

    val seasons = arrayOf("Frühling", "Sommer", "Herbst", "Winter")
    for(season in seasons) print("$season, ")
    val notASeason = "Karneval" !in seasons
    println(notASeason)
    val notInRange = 42 !in 1..10
    println(notInRange)

    val str = "Hello World"
    print("${'e' in str}, ")
    println('e' !in str)

    nL()

    for(index in seasons.indices)
        println("${seasons[index]} is season number $index")

    nL()

    seasons.forEach { print("$it, ") }
    println()
    seasons.forEachIndexed{i,v -> println("$v is season number $i")}

    nL()

    for(i in 1..3)
        jloop@ for(j in 1..4)
            for(k in 5..10){
                print("($i/$j/$k), ")
                if(k==7) break@jloop
            }
    println()


}

fun nL(){
    val builder: StringBuilder = StringBuilder("-")
    var i = 0
    while(MAX>i++)
        builder.append("-")
    println(builder.toString())
}