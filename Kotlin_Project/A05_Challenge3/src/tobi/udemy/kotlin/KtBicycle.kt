package tobi.udemy.kotlin

val DEFGEAR: Int = 1
val MAX: Int = 89

fun main(args: Array<String>) {
    KtBicycle(80, 3, 21).printDescription()
    KtMountainBike(85, 4,16, 42).printDescription()
    KtRoadBike(75, 2, 21, 25).printDescription()

    nL()

    KtBicycle(cadence = 80, speed= 21).printDescription()
    KtMountainBike(cadence = 85,speed= 16,seatHeight =  42).printDescription()
    KtRoadBike(cadence = 75,speed=  21,tireWidth= 25).printDescription()

    nL()

    KtMountainBike(cadence = 65,speed=  13,seatHeight= 39,color = "rot", gear = 3).printDescription()

    nL()

    KtMountainBike.availableColors.forEach{c -> print("$c, ")}
}

open class KtBicycle(var cadence: Int, var gear:Int = DEFGEAR, var speed: Int) {
    fun applyBreake(decrement: Int){
        speed -= decrement
    }

    fun speedUp(increment: Int){
        speed += increment
    }

    open fun printDescription() = println("Das Fahrrad ist im Gang $gear "+
            "mit einer Trittfrequenz von $cadence und einer Geschwindigkeit von $speed.")
}

class KtMountainBike(cadence: Int, gear: Int = DEFGEAR, speed: Int, var seatHeight: Int):
        KtBicycle(cadence, gear, speed) {
    constructor(cadence: Int, gear: Int, speed: Int, seatHeight: Int, color: String) : this(cadence, gear, speed, seatHeight){
        println("Die Farbe ist $color.")
    }

    companion object {
        val availableColors = listOf("blau", "rot", "weiß", "schwarz", "grün", "braun")
    }

    override fun printDescription() {
        super.printDescription()
        println("Das Mountainbike hat eine Sitzhöhe von $seatHeight Centimeter.")
    }
}

class KtRoadBike (cadence: Int, gear: Int = DEFGEAR, speed: Int, val tireWidth: Int):
        KtBicycle(cadence, gear,speed){
    override fun printDescription() {
        super.printDescription()
        println("Das Straßenfahrrad hat eine Reifenbreite von $tireWidth Millimeter.")
    }
}

fun nL(){
    val builder: StringBuilder = StringBuilder("-")
    var i = 0
    while(MAX>i++)
        builder.append("-")
    println(builder.toString())
}