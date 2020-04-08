package tobi.udemy.iokotlin

import java.io.File

fun main(args: Array<String>) {

    val lines = File("testfile.txt").reader().readLines()

    lines.forEach{print("$it, ")}
    print("in ${lines.javaClass}")
    println()

    //Die readText() vom Reader muss selbst geschlossen werden, die Version vom File
    //muss nicht geschlossen werden, aber hat eine Beschränkung auf Datein mit 2GB
    val reader = File("testfile.txt").reader()
    val string = reader.readText()
    println("$string in ${string.javaClass}")
    reader.close()

    // die use() Funktion funktioniert nur auf Klassen die Closeable sind
    val useLines = File("testfile.txt").reader().use { it.readText() }
    println("$useLines in ${useLines.javaClass}")

    //Die forEachLine() Funktion ließt nicht die ganze Datei auf einmal in den Haupt-
    //speicher, sondern führt für jede Zeile print einzeln aus. Auch der Reader
    //wird automatisch am Ende geschlossen
    File("testfile.txt").reader().forEachLine { print("$it, ") }

    //Ist das Gleiche wie bei forEachLine(), nur das useLines() manuell aufgerufen wird
    //Die use..() Funktionen ersetzen das try-with-resources in Java
    File("testfile.txt").reader().useLines { it.forEach { print("$it, ") } }
}