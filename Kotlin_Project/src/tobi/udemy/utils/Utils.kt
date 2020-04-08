package tobi.udemy.utils

public class Utils (val MAX: Int){

    fun nL(){
        val builder: StringBuilder = StringBuilder("-")
        var i = 0
        while(MAX>i++)
            builder.append("-")
        println(builder.toString())
    }

}