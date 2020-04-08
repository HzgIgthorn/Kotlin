package tobi.udemy.tryexpression

import jdk.jshell.spi.ExecutionControl

fun main(args: Array<String>) {
    println(getNumber("42"))
    println(getNumber("42.0"))

    println(getNumber2("42.0") ?: "I can't print the result")
    //println(getNumber2("42.0") ?: throw IllegalArgumentException("Number isn't an Int"))

    notImplementedYet("Hallo Welt")
}

/**
 * Bei einer Try-Expression kann der finally-Block einen Wert zurückgegen,
 * dieser wird aber in jedem Fall ignoriert
 */
fun getNumber(str: String): String{
    return try{
        "String wurde zu ${Integer.parseInt(str)} geparst"
    }catch(e: NumberFormatException){
        "String konnte nicht geparst werden, verwende 0"
    }finally {
        println("Ich bin im finally-Block")
    }
}

fun getNumber2(str: String): String?{
    return try{
        "String wurde zu ${Integer.parseInt(str)} geparst"
    }catch(e: NumberFormatException){
        null
    }finally {
        println("Ich bin im finally-Block")
    }
}

fun notImplementedYet(some: String): Nothing{
    throw ExecutionControl.NotImplementedException("Implement notImplementedYet()!")
}