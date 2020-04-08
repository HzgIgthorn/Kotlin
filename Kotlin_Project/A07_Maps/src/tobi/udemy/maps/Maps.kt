package tobi.udemy.maps

val MAX: Int = 159

fun main(args: Array<String>) {

    val immutalbeMap = mapOf(1 to Car("grün", "Toyota", 2015),
            2 to Car("rot", "Ford", 2016),
            3 to Car("silber", "Honda", 2005))
    println("$immutalbeMap in ${immutalbeMap.javaClass}")

    val mutableMap = mutableMapOf("Donald's Auto" to Car("rot", "Rover", 2010),
            "Dagobert's Auto" to Car("blau", "Hyundai", 2012))
    println("$mutableMap in ${mutableMap.javaClass}")

    val hashMap = hashMapOf("Donald's Auto" to Car("rot", "Rover", 2010),
            "Dagobert's Auto" to Car("blau", "Hyundai", 2012))
    val car4 = Car("rot", "Corvette", 1965)
    hashMap.put("Daisy's Auto",car4)
    println("$hashMap in ${hashMap.javaClass}")

    val pair = Pair(10,"ten")
    val (v1,v2) = pair
    println("erster Wert ist $v1 und zweiter Wert ist $v2")

    for((k,v) in mutableMap){
        println("Key ist $k und Value ist $v")
    }

    nL()

    val (c,m,y) = car4
    println("Frabe ist $c, Model ist $m und Baujahr ist $y in ${car4.javaClass}")

    val car2 = Car2("blau", "Hyundai", 2012)
    val (c2,m2,y2) = car2
    println("Frabe ist $c2, Model ist $m2 und Baujahr ist $y2 in ${car2.javaClass}")

    nL()

    val setInts = setOf(10,15,5,3, -22)
    println("${setInts.plus(20)} in ${setInts.javaClass}")
    println("${setInts.plus(10)} in ${setInts.javaClass}")
    println("${setInts.minus(19)} in ${setInts.javaClass}")
    println("${setInts.minus(10)} in ${setInts.javaClass}")
    println("${setInts.average()} in ${setInts.javaClass}")
    println("${setInts.drop(5)} in ${setInts.javaClass}")

    val mutableIntes = mutableSetOf(1,2,3,4,5)
    mutableIntes.plus(10)
    println("${mutableIntes} in ${mutableIntes.javaClass}")

}

fun nL(){
    val builder: StringBuilder = StringBuilder("-")
    var i = 0
    while(MAX>i++)
        builder.append("-")
    println(builder.toString())
}

class Car(val color: String, val model: String, val year: Int){
    /*Die component1() Funktionen werden aufgerufen, wenn das Object automatisch zerlegt wird
    * data class Objecte bekommen die component1() Funktionen automatisch erstellt*/
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
}

data class Car2(val color: String, val model: String, val year: Int){}