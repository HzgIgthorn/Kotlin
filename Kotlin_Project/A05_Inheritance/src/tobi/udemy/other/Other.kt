package tobi.udemy.other

import tobi.udemy.inheritance.Department
import tobi.udemy.inheritance.topLevel
import tobi.udemy.functions.upperFirstAndLast as ufal
import tobi.udemy.inheritance.CompanyCommunications as Comm

/**
 * Wir konnen ein import so umdefinieren, dass er mit einem ganz anderen Klassennamen
 * identifiziert werden kann
 */
fun main(args: Array<String>) {
    println(topLevel("Aus einem anderen Package"))
    println(Comm.getCopyrightLine())
    println(Department.HR.getDepartmentInfo())

    //wir können Funktionen aus anderen Modulen benutzen, wenn die das Modul als Abhängigkeit
    //definiert haben
    println("ein String".ufal())
}