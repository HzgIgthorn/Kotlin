package tobi.udemy.challenge

import java.text.DecimalFormat

val DDF = DecimalFormat("###.###")

fun main(args: Array<String>) {

    var hasFirst = false
    val b1 = StringBuilder()
    for(i in 5 .. 5000 step 5){
        if(hasFirst)
            b1.append(", $i")
        else{
            hasFirst = true
            b1.append(i)
        }
    }
    println(b1.toString())

    hasFirst = false
    val b2 = StringBuilder()
    for(i in (0 .. 500).reversed()){
        if(hasFirst)
            b2.append(", ${-i}")
        else{
            hasFirst = true
            b2.append(-i)
        }
    }
    println(b2.toString())

    var fkl=1
    var fgr=1
    val b3 = StringBuilder("Fibonacci: $fkl")
    for(i in 1..30){
        b3.append(", $fgr")
        val tmp = fgr
        fgr = fkl+fgr
        fkl = tmp
    }
    println(b3.toString())

    val b4 = java.lang.StringBuilder()
    hasFirst = false
    iLoop@for(i in 1..5){
        if(hasFirst)
            b4.append(", $i")
        else{
            b4.append(i)
            hasFirst=true
        }
        for(j in 11..20){
            b4.append(", $j")
            for(k in 100 downTo 90){
                b4.append(", $k")
                if(k == 98)
                    continue@iLoop

            }
        }
    }
    println(b4.toString())

    val b5 = java.lang.StringBuilder()
    hasFirst = false
    for(num in 1..200){
        var dnum = when{
            num < 100 -> -234.567
            num > 100 -> 4444.555
            else -> 0.0
        }
        if(hasFirst)
            b5.append(", $dnum")
        else{
            b5.append(dnum)
            hasFirst=true
        }
    }
    println(b5.toString())

    val b6 = java.lang.StringBuilder("Primzahlen: ")
    hasFirst = false
    var count = 0
    p@for(p in 1..300){

        for(i in 2..p/2){
            if(p%i==0)
                continue@p;
        }
        count++;
        if(hasFirst)
            b6.append(", $p(${DDF.format(1.0*count/p)})")
        else{
            hasFirst = true
            b6.append("$p(${DDF.format(1.0*count/p)})")
        }
    }
    println(b6.toString())
}

