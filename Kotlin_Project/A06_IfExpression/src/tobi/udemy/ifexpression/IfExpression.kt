package tobi.udemy.ifexpression

fun main(args: Array<String>) {

    val BOOL = true

    var num: Int
    if(BOOL){
        num = 42
    }else
        num = 666

    // in Kotlin wird der ternäre Operator simuliert mit dem Rückgabewert der 'if' Bedingung
    // Der Rückgabewert kann aber nur verwendet werden, wenn der 'else' existiert
    num = if(BOOL) 42 else 666

    val str = if(BOOL){
        println("something")
        "in if"

    }else{
        println("something else")
        "in else"
    }

    println(str)

    //Es geht auch mit Unit, obwohl es keinen Sinn hat
    val xunit = if(BOOL){
        println("in if")
    }else{
        println("in else")
    }

    println(xunit.javaClass)
}