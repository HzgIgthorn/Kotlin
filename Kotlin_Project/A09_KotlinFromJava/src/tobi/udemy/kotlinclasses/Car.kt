@file:JvmName("StaticCar")
package tobi.udemy.kotlinclasses

import java.io.IOException

fun topLevel() = println("Ich bin in der Car Datei von Kotlin")

class Car(color: String, val model: String, @JvmField val year: Int, val automatic: Boolean){
    var color: String = color
    set(value){
        field = "immer grün"
    }

    override fun toString(): String {
        return "Car(model='$model', year=$year, color='$color')"
    }

    /**
     * Durch die Annotation @JvmStatic sorgen wir dafür, dass der Compiler eine statische Methode
     * Erzeugt, die dann in Java als statische Methode aufgerufen werden kann. Sonst wird
     * eine nur eine Subclass von Car erzeugt (mit Annotation beides)
     */
    companion object {
        const val CONSTANTE = 25
        @JvmField val isAuto = false
        @JvmStatic fun carComp() = "Ich bin im Car companion Objekt."
    }

    fun printMe(text: String){
        println("Ich werwarte keinen Wert null: ${text}")
    }
}

object SingletonObj{
    @JvmStatic fun doSomething() = println("Ich tue etwas aus dem SingletonObj heraus.")
}

@Throws(IOException::class)
fun doIO(){
    throw IOException()
}

/**
 * Mit der JvmOverloads Annotation erstellt der Compiler alle möglichen Versionen von der
 * Funktion, damit die default-Werte benutzt werden können.
 */
@JvmOverloads
fun defaultArgs(str: String, num: Int = 25){

}

fun String.printK(){
    println(this)
}