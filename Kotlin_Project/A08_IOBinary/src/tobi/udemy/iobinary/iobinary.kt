package tobi.udemy.iobinary

import java.io.DataInputStream
import java.io.EOFException
import java.io.File
import java.io.FileInputStream

fun main(args: Array<String>) {

    val di = DataInputStream(FileInputStream("testfile.bin"))
    var si: String
    try{
        while(true){
            si = di.readUTF()
            println("$si, ")
        }
    }catch (e: EOFException){}

    //Listet den Filetree vom Kotlin-Projekt auf
    File(".").walkTopDown().forEach { print("$it, ") }
    println("")
    //walkTopDown() liefert eine Sequenz zurück und kann deshalb gefiltert werden
    File(".").walkTopDown().filter { it.name.endsWith(".kt") }.forEach {  print("$it, ")  }
}