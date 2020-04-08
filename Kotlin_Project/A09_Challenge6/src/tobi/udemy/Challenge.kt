package tobi.udemy

fun main(args: Array<String>) {
    val employee = Employee("Donald", "Duck", 2018)
    employee.lastName = "Ganz"
    employee.salaryLast3Years = floatArrayOf(50000.25f, 54000.60f, 56800.42f)

}