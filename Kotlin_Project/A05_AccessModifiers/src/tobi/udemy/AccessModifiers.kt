package tobi.udemy

val CONSTANT = 100

fun main(args: Array<String>) {
    val emp = Employee();
    println(emp)

    val emr = Employer();
    println(emr)

    val emp1 = EmployeeK1("Donald")
    println(emp1.firstName)

    val emp2 = EmployeeK4("Dagobert")
    println(" Firstname: ${emp2.firstName}, FullTime: ${emp2.fullTime}")

    val emp3 = EmployeeK5("Tick", false)
    println(" Firstname: ${emp3.firstName}, FullTime: ${emp3.fullTime}")

    emp3.fullTime = true
    println(" Firstname: ${emp3.firstName}, FullTime: ${emp3.fullTime}")

    println(CONSTANT)

    val car1 = Car("blue", "Toyota", 2015);
    println(car1)

    val car2 = Car("blue", "Toyota", 2015)
    println("car1 und car2 haben die gleichen Eigenschaften? ${car1==car2}")

    val car3 = car1.copy()
    println("car1 und car3 haben die gleichen Eigenschaften? ${car1==car3}")

    val car4 = car1.copy(model = "Trabant")
    println("car1 und car4 haben die gleichen Eigenschaften? ${car1==car4}")
}

/**
 * private-Klassen können von allen Klassen in der gleichen Datei gesehen werden
 * Der Java-Compiler wandelt private von Kotlin zu package von Java um
 */
private class Employee{

}

/**
 * internal-Klassen können von allen Klassen in dem selben Modul gesehen werden
 * Der Java-Compiler wandelt internal von Kotlin zu public von Java um
 */
internal class Employer{

}

/**
 * der Konstuktor im Kopf der Definition der Funktion ist der Primärconstruktor
 * die init() Funktion wird von jedem Konstruktor aufgerufen
 */
class EmployeeK1 constructor(firstName: String){
    val firstName: String

    init {
        this.firstName = firstName;
    }
}

/**
 * Wenn die init() Funktion nur Klassenvariablen zuweist, kann das auch ohne init() geschehen
 */
class EmployeeK2 constructor(firstName: String){
    val firstName : String = firstName
}
/**
 * Wir können die initialisierung des Primärkonstruktor auch ganz einsparen
 */
class EmployeeK3 (val firstName: String){}

/**
 * Wir können einen sekundären Konstruktor aufrufen, der den primären Konstruktor aufruft
 * Ein sekundärer Konstruktor kann aber nicht im Methodenkopf Felder anlegen
 */
class EmployeeK4 (val firstName: String){

    var fullTime: Boolean = true

    constructor(firstName: String, fullTime: Boolean):this(firstName){
        this.fullTime=fullTime;
    }
}

/**
 * Wir können den default getter nur direkt nach der Deklaration aufrufen
 */
class EmployeeK5 (val firstName: String, fullTime: Boolean = true){

    var fullTime = fullTime
    set(value){
            println("Running the custom set")
        field = value
        }
    get(){
        println("Running the custom get")
        return field
    }

}

/**
 * data class haben schon eine Sinnvolle toString() und equals() Funktion vordefiniert
 */
data class Car(val color: String, val model: String, val year: Int){

}