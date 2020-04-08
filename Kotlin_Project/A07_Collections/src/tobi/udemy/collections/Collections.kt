package tobi.udemy.collections

val MAX: Int = 82

fun main(args: Array<String>) {
    val strings = listOf("Frühling", "Sommer", "Herbst", "Winter")
    println(strings.javaClass)

    val empty = emptyList<String>()
    println(empty.javaClass)

    try{
        println(empty[0])
    }catch(ibe: IndexOutOfBoundsException){
        println(ibe.toString())
    }

    val noNulls = listOfNotNull("Hallo", null, "Auf Wiedersehen")
    println(noNulls)

    val arrayList = arrayListOf(1,2,3)
    println(arrayList.javaClass)

    nL()

    val mutables = mutableListOf<Int>(1,2,3)
    println(mutables.javaClass)

    val array = arrayOf("schwarz", "weiß", "grün")
    val colors = listOf(array)
    println(colors.javaClass)

    val colors2 = listOf(*array)
    println(colors2.javaClass)

    val colors3 = array.toList()
    println(colors3.javaClass)

    val ints = intArrayOf(1,2,3)
    println(ints.toList().javaClass)

    //Listen können in kotlin mit [] manipuliert werden
    mutables[1] = 20
    println(mutables)

    nL()

    val setInts = setOf(10, 15, 19, 5, 3, -22)
    val immutableMap = mapOf<Int, Car>(1 to Car("grün", "Toyota", 2015),
            2 to Car("rot", "Ford", 2016),
            3 to Car("silber", "Honda", 2010))

    println("${setInts.filter { it % 2 != 0 }} in ${setInts.javaClass}")
    println("${immutableMap.filter { it.value.year > 2015}} in ${immutableMap.javaClass}")

    val mutableMap = mutableMapOf<Int, Car>(1 to Car("grün", "Toyota", 2015),
            2 to Car("rot", "Ford", 2016),
            3 to Car("silber", "Honda", 2010),
            17 to Car("rot", "BMW", 2000),
            8 to Car ("grün", "Ford", 2010))
    mutableMap.filter { it.value.year > 2015 }
    println("${mutableMap} in ${mutableMap.javaClass}")

    val intS = arrayOf(1,2,3,4,5)
    //map() kann für jede Collection angewand werden
    val add10 = intS.map { it + 10 }
    println("${add10} in ${add10.javaClass}")

    println("${immutableMap.map { it.value.color }} in ${immutableMap.map{ it.value.color }.javaClass}")
    println(mutableMap.filter { it.value.model == "Ford"}.toString() + " in ${mutableMap.javaClass}")
    println(mutableMap.filter { it.value.model == "Ford"}.map { it.value.color }.toString() + " in ${mutableMap.javaClass}")
    println("${mutableMap.all { it.value.year > 2014 }} all in ${mutableMap.all { it.value.year > 2014 }.javaClass}")
    println("${mutableMap.any { it.value.year > 2014 }} any in ${mutableMap.any { it.value.year > 2014 }.javaClass}")
    println("${mutableMap.count { it.value.year > 2014 }} count in ${mutableMap.count { it.value.year > 2014 }.javaClass}")

    nL()

    val cars = mutableMap.values
    println("${cars.find { it.year > 2014 }} find in ${cars.javaClass}")
    println("${cars.groupBy { it.color }} groupBy in ${cars.groupBy { it.color }.javaClass}")
    println("${mutableMap.toSortedMap()} toSortedMap in ${mutableMap.toSortedMap().javaClass}")
    println("${cars.sortedBy { it.year }} sortedBy in ${cars.sortedBy { it.year }.javaClass}")
}

fun nL(){
    val builder: StringBuilder = StringBuilder("-")
    var i = 0
    while(MAX>i++)
        builder.append("-")
    println(builder.toString())
}

data class Car(val color: String, val model: String, val year: Int){}