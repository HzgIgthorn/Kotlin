package tobi.udemy.inheritance

/**
 *  Jede Klasse die nicht 'open' ist, ist automatisch 'final'. Wir können also
 *  von Klassen ohne 'open' nicht erben. Die zwei Klammen hinter dem Klassennamen
 *  definieren den empty-Konstruktor. Bei Klassen mit 'abstract'
 */
open abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

/**
 * Jede Funktion in Kotlin ist 'final' als Standard. Deshalb können wir
 * printModel() nicht einfach überschreiben. Sie muss 'open' sein. Funktion
 * mit 'abstract' sind im Standard auch 'open'. Wenn wir eine 'open'
 * Funktion überschreiben, aber wollen, dass diese nicht noch einmal über-
 * schrieben werden kann, brauchen wir 'final'
 */
open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {
    override fun bestSellingPrice(): Double = 123.99

    final override fun printModel() = println("The model name of this laser printer is $modelName")
}

class SpecialLaserPrinter(modelName: String): LaserPrinter(modelName, 12){
    //override fun printModel() = println("This is my way of doing it!")
}

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()
    System.out.println(laserPrinter.bestSellingPrice())
}

open class Something: SubInterface{
    val someProperty: String
    override val number: Int = 25

    constructor(someParameter: String){
        someProperty = someParameter
    }

    override fun subFkt(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun baseFkt(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class SomethingElse: Something{
    override val number2 = 25

    constructor(someOtherParameter: String): super(someOtherParameter)
}

/**
 * Klassen mit 'data' können nicht 'open' sein. Man kann von ihnen nicht erben.
 * Klassen mit 'data' können aber von anderen Klassen erben.
 */
data class DataClass(val date1: String){}

/**
 *  Wenn wir eine Konstante im Interface haben wollen, müssen wir den
 *  Wert mit einem getter liefern
 */
interface BaseInterface{
    val number:Int
    val number2: Int
        get() = number * 50

    fun baseFkt(str: String):String
}

interface SubInterface: BaseInterface{
    fun subFkt(num: Int): String
}