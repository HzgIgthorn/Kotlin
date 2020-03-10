package tobi.udemy.declarations

typealias EmployeeSet = MutableList<EmployeeJava>

fun main(args: Array<String>) {
    var number: Int
    number = 10
    number = 11

    val employee1 = EmployeeJava("Donald Duck", 1)
    employee1.name = "Donald Gans"

    val employeeJava2: EmployeeJava
    val number2 = 100

    if(number < number2){
        employeeJava2 = EmployeeJava("Dagobert Duck", 2)
    }else{
        employeeJava2 = EmployeeJava("Tick Duck", 3)
    }

    val employee3 = EmployeeJava("Donald Gans", 1)

    StringBuilder("1.1")

    val names = arrayListOf("Donald", "Dagobert", "Gustav")
    println(names[1])

    //In Kotlin ist == und equals() das Gleiche
    println(employee1 == employeeJava2)
    println(employee1 == employee3)
    println(employee1.equals(employeeJava2))
    println(employee1.equals(employee3))

    val employeeSet: EmployeeSet

    val emp1 = EmployeeKotlin("Megabyte Knack",999)
    val emp2 = EmployeeKotlin("Karlchen Knack", 671)
    val emp3 = EmployeeKotlin("Kuno Knack", 167)
    val emp4 = EmployeeKotlin("Kuno Knack", 167)

    //In Kotlin ist == und equals() das Gleiche
    println(emp1==emp4);
    println(emp3 == emp4)
    println(emp1.equals(emp4))
    println(emp3.equals(emp4))

    //In Kotlin ist === das == aus Java
    println(emp1===emp4)
    println(emp3===emp4)
    println(emp1!==emp4)
    println(emp3!==emp4)

    println("*******************************************************")
    val x = 0x01001010101010
    val y = 0x01010101010101

    println(x or y)
    println(y and x)

    val s: Any = emp4
    if(s is EmployeeKotlin){
        println("ist EmployeeKotlin")
        //Der Cast mit 'as' ist nicht nötig, weil das 'is' schon einen Smartcast beinhaltet
        val ee = s as EmployeeKotlin
        println(ee)
    }else
        println("nicht EmployeeKotlin")
    val change = 4.22
    println("Der Wert von change ist $change und wir geben das mit \$change aus")

    val za = 10.99
    val ne = 20.00
    println("Der Wert von $za geteilt durch $ne ist ${za/ne}")

    val path = """c:\der\path\zur\datei.txt"""
    println(path)

    val rhyme = """Das ist das Haus vom Nicolaus
        *und nebenan der Weihnachtsmann""".trimMargin("*")

    println(rhyme)
}
