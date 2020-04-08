package tobi.udemy.challenge

fun main(args: Array<String>) {
    val donald = Person("Donald", "Duck", 32)
    val dagobert = Person("Dagobert","Duck",99)
    val gustav = Person("Gustav", "Ganz", 33)
    val franz = Person("Franz", "Ganz", 31)
    val daisy = Person("Daisy", "Duck", 28)

    val (fName, lName, age) = donald
    println("fName = ${fName}, lName = ${lName}, age = $age")

    val personMap = mapOf<String,Person>(donald.firstName to donald,
            dagobert.firstName to dagobert,
            gustav.firstName to gustav,
            franz.firstName to franz,
            daisy.firstName to daisy)
    println("${personMap.filter { it.value.lastName.startsWith("G") }.count()} beginnen mit G")
    println(personMap.map { Pair(it.value.firstName,it.value.lastName) })

    personMap.also { it.map { print("${it.value.firstName} ist ${it.value.age} Jahre alt, ") }}
    println("")

    val list1 = listOf(2,7,1,8)
    val list2 = listOf(2,77,1,88)
    println(list1.filter { it in list2 })

    val regPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regPaper
}

class Person(val firstName: String, val lastName: String, val age: Int){
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age
}

class Box<out T>{}
open class Paper{}
class Regular: Paper(){}
class Premium: Paper(){}