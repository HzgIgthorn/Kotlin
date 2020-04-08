package tobi.udemy.vatianz

fun main(args: Array<String>) {
    val shortList: List<Short> = listOf(1,2,3,4,5)
    convertListToInt(shortList)

    val flowerTender = object: FlowerCare<Flower>{
        override fun prune(flower: Flower) = println("Ich stutze die ${flower.name}")

    }

    val roseTender = object: FlowerCare<Rose>{
        override fun prune(flower: Rose) = println("Ich stutze die Rose")
    }
    val roseBiotop = Biotop<Rose>(listOf(Rose(), Rose()),roseTender)
    roseBiotop.tendFlower(0)

    val daffodilTender = object: FlowerCare<Daffodil>{
        override fun prune(flower: Daffodil) = println("Ich stutze die Narzisse")
    }
    val daffodilBiotop = Biotop<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()),daffodilTender)
    daffodilBiotop.tendFlower(2)

    val roseBiotop2 = Biotop<Rose>(listOf(Rose(), Rose()),flowerTender)
    roseBiotop.tendFlower(0)

    val daffodilBiotop2 = Biotop<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()),flowerTender)
    daffodilBiotop.tendFlower(2)

}

/**
 * Das funktioniert mit einer List von Number, aber nicht mit einer MutableList von Number,
 * weil eine List von Short keine Subclass von List of Number ist, sondern ein Subtype!
 * Short ist eine Subclass von Number, aber das spielt keine Rolle.
 */
fun convertListToInt(collection: List<Number>){
    var hasFirst = false
    val builder = StringBuilder()
    for(num in collection){
        if(hasFirst)
            builder.append(", ${num.toInt()}")
        else{
            hasFirst=true
            builder.append("${num.toInt()}")
        }
    }
    println(builder.toString())
}

fun waterGarden(garden: Garden<Flower>){}

fun tendGarden(roseGarden: Garden<Rose>){
    waterGarden(roseGarden)
}

open class Flower(val name: String){}

class Rose:Flower("Rose"){}

class Daffodil:Flower("Narzisse"){}

/**
 * Wenn wir eine Classe mit 'out' covariant machen, dann wird der Garden of Rose als
 * ein Subtype von Garden of Flower akzeptiert. Jetzt darf aber der Typ T nicht mehr
 * für Parameter einer Funktion in der Classe Garden verwendet werden (Rückgabetyp darf
 * aber noch T sein). Mit der Annotation @UnsafeVariance kann der Fehler umgangen werden,
 * wenn man sich sicher ist, dass der übergeben Subtyp nichts an dem eigentlichen Object
 * ändert. Es dient als Sicherheit, damit der Typ von Außen nicht geändert werden kann.
 *
 * Dieses Konzept entspricht der Java-Notation List<? extends Flower>, wird aber nur
 * bei den Methoden einer Klasse verwendet, nicht bei der Klasse selber
 */
class Garden<out T: Flower>(private var first: T){
    val flowers: List<T> = listOf()

    fun pickFlower(index: Int):T = flowers[index]
    fun plantFlower(flower: @UnsafeVariance T){}
}

class Biotop<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>){
    fun pickFlower(index: Int) = flowers[index]
    fun tendFlower(index: Int){
        flowerCare.prune(flowers[index])
    }
}

/**
 * Wenn wir das Schlüssewort in benutzen, akzeptiert das Interface auch Subtypen eines
 * übergebenen Typen. Damit kann aber der Typ T nicht mehr als Rückgabetyp verwendet werden.
 * Das Konzept wird als Contravarianz bezeichnet.
 *
 * Dieses Konzept entspricht der Java-Notation FlowerCare<? super Flower>, wird aber nur
 * bei den Methoden einer Klasse verwendet, nicht bei der Klasse selber
 */
interface FlowerCare<in T>{
    fun prune(flower: T)
}