package tobi.udemy

fun sayHelloToJava(name: String){
    println("Kotlin sagt hallo zu Java: $name")
}


object  Challenge{
     fun doMath(x: Int, y:Int) = (x + y) * (x - y)
}

class Employer(val firstName: String, val lastName: String,val startYear: Int){

    @JvmOverloads
    fun takesDefault(param1: String, param2: String = "default"){
        println("$param1 und $param2")
    }
}

//@file:JvmName("KotlinStuff")
//package tobi.udemy
//
//fun sayHelloToJava(name: String){
//    println("Kotlin sagt hallo zu Java: $name")
//}
//
//
//object  Challenge{
//    @JvmStatic fun doMath(x: Int, y:Int) = (x + y) * (x - y)
//}
//
//class Employer(val firstName: String, val lastName: String,@JvmField var startYear: Int){
//
//    @JvmOverloads
//    fun takesDefault(param1: String, param2: String = "default"){
//        println("$param1 und $param2")
//    }
//}