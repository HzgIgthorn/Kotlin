package tobi.udemy.lambdaexpression

val MAX: Int = 86
val BIG: Int = 22

fun main(args: Array<String>) {
    run{ println("Ich bin in einer Lambda Expression")}
    val employees = listOf(Employee("Donald", "Duck", 2012),
            Employee("Dagobert", "Duck", 1985),
            Employee("Tick", "Duck", 2019),
            Employee("Trick", "Duck", 2019))
    println(employees.minBy { it.startYear })

    run(::topLevel)

    nL()

    println(countTo100())
    println(withTo100())
    println(applyTo100())

    nL()

    findByLastName(employees, "Duck")
    lambdaByLastName(employees, "Duck")

    "Some String".apply someString@{
        "Another String".apply {
            println(toUpperCase())
            println(this@someString.toLowerCase())
        }
    }
}

fun userParameter(employees: List<Employee>, num: Int){
    employees.forEach{
        println("${it.firstName} $num, ")
    }
}

fun countTo100(): String{
    val numbers = StringBuilder("function: ")
    for(i in 1..BIG-1){
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(BIG)
    return numbers.toString()
}

fun withTo100(): String = with(StringBuilder("with: ")){
        for(i in 1..BIG-1){
            this.append(i)
            this.append(", ")
        }
        this.append(BIG)
        this.toString()
    }

fun applyTo100(): String = StringBuilder("apply: ").apply {
    for(i in 1..BIG-1){
        this.append(i)
        this.append(", ")
    }
    this.append(BIG)
}.toString()

fun topLevel() = println("Ich bin in einer Funktion")

fun findByLastName(employees: List<Employee>, findName: String){
    for(employee in employees){
        if(employee.lastName == findName){
            println("Wir haben den Arbeitnehmer mit Namen $findName gefunden!")
            return
        }
    }
    println("Wir haben keinen Arbeitnehmer mit Namen $findName")
}
fun lambdaByLastName(employees: List<Employee>, findName: String){
    employees.forEach {
        if(it.lastName == findName){
            println("Wir haben den Arbeitnehmer mit Namen $findName gefunden!")
            return
        }
    }
    println("Wir haben keinen Arbeitnehmer mit Namen $findName")
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int){}

fun nL(){
    val builder: StringBuilder = StringBuilder("-")
    var i = 0
    while(MAX>i++)
        builder.append("-")
    println(builder.toString())
}