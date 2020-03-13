package tobi.udemy.functions

fun main(args: Array<String>) {
    println(labelMultiply1(2,21,"Das Ergebnis ist: "))
    println(labelMultiply2(3,14,"Das Ergebnis ist: "))
    multiPly()

    val emp1 = Employee("Donald")
    println(emp1.ucFkt())

    println(labelMultiply1(1, 42))

    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("green", "Ford", 2017)

    printColors(car1,car2,car3)

    val number = arrayOf(1,2,3)

    val cars1 = arrayOf(car3, car1, car2)
    // Der Spread-Operator macht aus einem Array ein vararg Object
    printColors(*cars1)

    val cars2 = arrayOf(car3, car1)
    val car4 = car2.copy()

    val cars4 = arrayOf(*cars1, *cars2, car4)
    for (c in cars4)
        println(c)

    val str = "das ist alles in kleinbuchstaben"
    /**
     * upperfirstAndLast ist eigentlich eine Funktion, die den String erweitert. Aber wir
     * können natürlich die String-Classe nicht einfach erweitern
     */
    println(Utils().upperFirstAndLast(str))

    println(str.upperFirstAndLast())
}

/**
 * Wir können auch Funktionen definieren, die den Rückgabetyp Unit haben. Alternativ können
 * wir die Rückgabewert Unit auch angeben
 */
fun multiPly() = println(6 * 7)

/**
 * Der return-Typ einer Funktion wird am Ende der Deklaration mit angegeben
 */
fun labelMultiply1(operand1: Int, operand2: Int, label: String = "Die Antwort ist: "): String{
    return "$label ${operand1 * operand2}"
}

/**
 * Wenn die Funktion nur ein return Argument hat, kann dieses auch mit '=' zurückgegeben werden.
 * Der inline-Parameter ist nützlich, wenn die Funktion Lambda-Expression hat. Mit dem Parameter
 * versucht der Kompiler auf das Erstellen eine Klasse zu verzichten um Resourcen zu sparen
 */
inline fun labelMultiply2(operand1: Int, operand2: Int, label: String) = "$label ${operand1 * operand2}"

class Employee(val firstName: String){
    fun ucFkt() = firstName.toUpperCase()
}

data class Car(val color: String, val model: String, val year: Int){}

/**
 * vararg gibt, dass eine beliebige Anzahl von Car-Objecten erwartet wird
 */
fun printColors(vararg cars: Car){
    var hasFirst: Boolean = false
    for(car in cars){
        if(hasFirst)
            print(", ${car.color}")
        else{
            hasFirst = true
            print(car.color)
        }
    }
    println()
}

/**
 * Eine Extension Function schafft die Illusion, dass einer fremden Klasse eine Funktion
 * hinzugefügt wurde
 */
fun String.upperFirstAndLast(): String{
    val first = substring(0,1).toUpperCase() + substring(1);
    return first.substring(0,first.length - 1) + substring(length - 1, length).toUpperCase()
}

