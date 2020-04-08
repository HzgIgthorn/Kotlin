package tobi.udemy.lists

val MAX: Int = 67

fun main(args: Array<String>) {

    val strings = listOf("Frühling", "Sommer", "Herbst", "Winter", "Sommer")
    val colors = listOf("schwarz", "weiß", "rot", "weiß")

    println(strings.last())

    println(strings.asReversed())

    println(strings.getOrNull(5))

    val ints = listOf(1,2,3,4,7,5)
    println("${ints.max()} max in ${ints.javaClass}")

    val pairs = colors.zip(strings)
    println("$pairs in ${pairs.javaClass}")
    println("${pairs[0].first} first in ${pairs[0].javaClass}")

    nL()

    val combined = colors + strings
    println("$combined in ${combined.javaClass}")

    val noDups = colors.union(strings)
    println("$noDups in ${noDups.javaClass}")

    val noDupColors = colors.distinct()
    println("$noDupColors in ${noDupColors.javaClass}")

    val mutables = strings.toMutableList()
    mutables.add("Karneval")
    println("$mutables in ${mutables.javaClass}")

}

fun nL(){
    val builder: StringBuilder = StringBuilder("-")
    var i = 0
    while(MAX>i++)
        builder.append("-")
    println(builder.toString())
}