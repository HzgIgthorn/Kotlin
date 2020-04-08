package tobi.udemy.generics

import java.math.BigDecimal

val MAX: Int = 158

fun main(args: Array<String>) {
    val list = mutableListOf("Hello")
    list.add("another string")
    printCollection(list)

    val bdList = mutableListOf(BigDecimal(3.14159), BigDecimal(1.41421), BigDecimal(2.71828))
    printCollection(bdList)

    list.printCo()
    bdList.printCo()

    val ints = listOf(1,2,3,4,5)
    val shorts: List<Short> = listOf(10,20,30,40,50)
    val floats: List<Float> = listOf(3.14159f, 1.41421f, 2.71828f)

    convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)

    testAppend(StringBuilder("erster String"),StringBuilder("zweiter String"))

    nL()

    val listAny: Any = listOf("str1", "str2")
    //Wenn wir in Kotlin keinen Generic Typ angeben können, nutzen wir den *
    if(listAny is List<*>)
        println("Ja, das ist eine Liste. Danke Sternprotektion")

    if(listAny is List<*>){
        println("Diese Liste enthält Strings")
        val strList = listAny as List<String>
        println(strList[1].replace("str", "string"))
    }

    nL()

    val mixedList: List<Any> = listOf("strings", 1, BigDecimal(0.57721), "fall", BigDecimal(1.08366))
    val bigDeci = getElementsOfType<BigDecimal>(mixedList)
    for(item in bigDeci)
        print("$item, ")
    println("")
}

/**
 * Top Level Funktion
 */
fun <T> printCollection(list: List<T>) {
    var hasFirst = false
    val builder: StringBuilder = StringBuilder()
    for(item in list){
        if(hasFirst){
            builder.append(", $item")
        }
        else{
            hasFirst = true
            builder.append(item)
        }
    }
    println(builder.toString())
}

/**
 * Erweiterung der List
 */
fun <T> List<T>.printCo() {
    var hasFirst = false
    val builder: StringBuilder = StringBuilder()
    for(item in this){
        if(hasFirst){
            builder.append(", $item")
        }
        else{
            hasFirst = true
            builder.append(item)
        }
    }
    println(builder.toString())
}

fun <T: Number> convertToInt(collection: List<T>){
    for(num in collection){
        print("${num.toInt()}, ")
    }
    println("")
}

fun <T> testAppend(it1: T, it2: T)
    where T: CharSequence, T: Appendable{
        println("Ergebnis ist: ${it1.append(", $it2")}")
}

fun nL(){
    val builder: StringBuilder = StringBuilder("-")
    var i = 0
    while(MAX>i++)
        builder.append("-")
    println(builder.toString())
}

/**
 * nur Typparameter von inline Funktionen können reified gesetzt werden. Damit kann der Typ innerhalb
 * einer Funktion überprüft werden
 */
inline fun <reified T> getElementsOfType(list: List<Any>): List<T>{
    var newList: MutableList<T> = mutableListOf()
    for (element in list){
        if (element is T){
            newList.add(element)
        }
    }
    return newList
}