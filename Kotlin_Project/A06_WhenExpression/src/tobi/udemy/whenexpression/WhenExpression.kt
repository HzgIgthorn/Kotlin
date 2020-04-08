package tobi.udemy.whenexpression

import java.math.BigDecimal

fun main(args: Array<String>) {

    val num = 200

    // Die 'when' Expression ersetzt das 'switch', es geht aber das break verloren
    when(num){
        100, 600 -> println("600")
        in 101..200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }

    val mum = 10
    when(num){
        mum + 180 -> println("180")
        mum + 190  -> println("190")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }

    val obj1:Any = "Hallo World"
    val obj2:Any = BigDecimal(22.5)
    val obj3:Any = 45

    val some: Any = obj2
    val res = when(some){
        is String -> println(some.toUpperCase())
        is BigDecimal -> println(some.remainder(BigDecimal(10.5)))
        is Int -> println(some - 22)
        else -> println("Doesn't match anything")
    }
    println(res)

    val zeit = Season.WINTER
    val str = when(zeit){
        Season.SPRING -> "Blumen sprießen"
        Season.SUMMER -> "Es ist sehr heiß"
        Season.FALL -> "Es regnet ständig"
        Season.WINTER -> "Es ist sehr kalt"
    }
    println(str)
}

enum class Season{
    SPRING, SUMMER, FALL, WINTER
}