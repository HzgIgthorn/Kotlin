package tobi.udemy.nullreferences

fun main(args: Array<String>) {
    val str: String? = "This isn't null"
    println(str?.toUpperCase())

    var str2: String? = null
    println(str2?.toUpperCase())

    //Elvis-Operator for Default Values instat of null
    val str3 = str2 ?: "default"
    println(str3)

    //Safe-Cast Operator um eine Variable zu casten, deren Typ wir nicht kennen
    val something: Any = arrayOf(1,2,3,4)
    val str4 = something as? String
    println(str4)

    //If you want a NullPointerException if str3 is null in der Zeile mit !!
    //val str5 = str2!!
    //println(str5.toUpperCase())

    str2?.let{printText(it)}

    val nullableInts = arrayOfNulls<Int?>(5)
    for(i in nullableInts)
        print(i)

    println(" "+nullableInts[3].toString())
}

//printText erwartet einen NotNullString, wir können keinen NullableString übergeben
fun printText(text: String){
    println(text)
}
