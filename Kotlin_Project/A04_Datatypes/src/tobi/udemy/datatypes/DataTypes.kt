package tobi.udemy.datatypes

import tobi.udemy.javacode.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    val myInt = 10
    println("Der Standard Datentyp ist Int (${myInt is Int})")
    val myLong = 22L
    val seLong: Long

    seLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort = myByte.toShort()

    val myDouble = 2.71828182
    println("myDouble ist $myDouble vom Type Double (${myDouble is Double})")
    val myFloat = 1.41421356f

    var seDouble = myFloat.toDouble()

    val myChar = 'i'
    val myCharInt = 65
    println(myCharInt.toChar())

    val myBoolean = true
    val dummyClass: DummyClass = DummyClass()

    println(dummyClass.isVacationTime(myBoolean))

    val names = arrayOf("Donald", "Tick", "Trick", "Track")

    val longs1 = arrayOf(1, 2,3L)
    val longs2 = arrayOf<Long>(1 , 2 ,3 )

    println(longs1 is Array<Long>)

    val even = Array(16){i -> i*2+2}
    var b = false
    for(number in even){
        if(b)
            print(", ${number}")
        else{
            print(number)
            b = true
        }
    }

    val zeoroes = Array(100){_->0}

    println()
    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    b = false
    for(element in mixedArray){
        if(b)
            print(", $element")
        else{
            print(element)
            b = true
        }
    }

    val intArray = intArrayOf(1,2,3,4,5)
    dummyClass.printLnInt(intArray)

    var otherArray = IntArray(5)
    dummyClass.printLnInt(otherArray)

    dummyClass.printLnInt(even.toIntArray())

    val conIntArr: Array<Int> = intArray.toTypedArray()
}