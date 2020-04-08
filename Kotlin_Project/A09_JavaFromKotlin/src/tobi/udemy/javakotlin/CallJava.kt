package tobi.udemy.javakotlin

import tobi.udemy.javaclasses.Car

fun main(args: Array<String>) {
    val car = Car("blau","Ford",2015)
    car.color = "grün"
    car.model = null
    println(car)

    var color:String= car.color
    println("$color in ${color.javaClass}")

    car.variableMethod(5,"Hallo!", "Wie geht es?", "Auf Wiedersehen")
    val strings = arrayOf("Hallo!", "Wie geht es?", "Auf Wiedersehen")
    car.variableMethod(5,*strings)
    car.wantsIntArray(intArrayOf(2,7,1,8,2,8))

    //(car.`object` as java.lang.Object).notify()

    println("x = ${Car.X}")

    car.runMethod()

    car.runMethod( { println("Ich bin in einem Kotlin Lambda!")})
}