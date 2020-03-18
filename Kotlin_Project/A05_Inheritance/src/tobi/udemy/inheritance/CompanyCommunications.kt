package tobi.udemy.inheritance

import java.time.Year

val STRING: String = "Das ist der eigentliche String!"

fun main(args: Array<String>) {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.accessPrivateVal())

    val class1 = SomeClass.justAssign(STRING)
    val class2 = SomeClass.toUpper(STRING,false)

    println(class1.str + " / "+class2.str)

    var index = 42

    wantsSomeInterface(object: SomeInterface{
        override fun mustImplement(num: Int): String{
            index++
            return "Das ist von mustImplement(): ${num*100}"
        }
    })

    println("Der Index ist jetzt: ${index}")

    println(Department.IT.getDepartmentInfo())
}

enum class Department(val nname: String, val employees: Int){
    HR("Personal", 2), IT("Produktion", 100), ACCOUNTING("Rechnungswesen",1), SALES("Vertrieb", 3);

    fun getDepartmentInfo() = "Das $nname hat $employees Mitarbeiter."
}

/**
 * Das Schlüsselwort 'object' kann verwendet werden um einen Singelton zu definieren. Es ersetzt auch das
 * nicht vorhandene Schlüsselwort 'static' zum Teil
 */
object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Cour Company. All rights reserved."
}

/**
 * Das Schlüsselwort 'companion object' kann verwendet werden, um Variablen zu definieren, auf die man
 * ohne das Erstellen einen konkreten Instanz zugreifen kann. Auch hier wird in gewisser Weise das
 * Schlüsselwort 'static' ersetzt. Das Schlüsselwort 'companion' ist nur einmal pro Klasse erlaubt.
 *
 * Das Schlüsselwort 'companion object' kann auch verwendet werden, um eine Factory zu erzeugen. Wenn
 * der Primärkonstruktor das Schlüsselwort 'private constructor' erhält, kann nur noch über
 * das 'companion object' eine Instanz erzeugt werden
 */
class SomeClass private constructor(val str: String){

    companion object {
        private val privateVal = 6

        fun accessPrivateVal() = "Ich greife auf privateVal zu: $privateVal"

        fun justAssign(str: String) = SomeClass(str)
        fun toUpper(str: String, lower: Boolean): SomeClass{
            if (lower)
                return SomeClass(str.toLowerCase())
            else
                return SomeClass(str.toUpperCase())
        }
    }
}

interface SomeInterface{
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface){
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}

fun topLevel(str: String) = "Das ist die topLevel($str) Funktion"