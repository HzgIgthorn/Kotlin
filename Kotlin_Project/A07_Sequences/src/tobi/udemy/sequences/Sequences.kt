package tobi.udemy.sequences

/*
    Sequences in Kotlin ersetzen die Streams in Java. Sie sind nur für sehr große Collections ratsam,
    da in Kotlin Collections sehr stark optimiert wurden. Der Vorteil von Sequences in Kotlin ist,
    dass bei Ketten von Anweisungen die Collections für die Zwischenergebnisse nicht erstellt werden.
    Jeder Zwischenschritt der Sequence erstellt wieder eine Sequence. Erst nach einer Terminal-Operation
    wird wieder ein Ergebnis erstellt. Terminal-Operationen sind lazy.
 */
fun main(args: Array<String>) {
    val mutableMap = mutableMapOf<Int, Car>(1 to Car("grün", "Toyota", 2015),
            2 to Car("rot", "Ford", 2016),
            3 to Car("silber", "Honda", 2010),
            17 to Car("rot", "BMW", 2000),
            8 to Car ("grün", "Ford", 2010))

    mutableMap.asSequence().filter { it.value.model == "Ford" }.map {it.value.color}

    //die print()'s werden nicht ausgefüht, weil es keine Terminale Operation gibt
    listOf("Donald", "Dagobert", "Daisy", "Gustav").asSequence().filter { print("Filter: $it "); it[0] == 'D' }.map { print("Abbildung: $it "); it.toUpperCase() }

    listOf("Donald", "Dagobert", "Daisy", "Gustav").asSequence().filter { print("Filter: $it "); it[0] == 'D' }.map { print("Abbildung: $it "); it.toUpperCase() }.toList()

    println()

    //Die Sequence schickt jedes Object einzeln durch die Befehlskette und spart dadurch beim find() viele Rechenschritte
    listOf("Donald", "Dagobert", "Daisy", "Gustav").asSequence().filter { print("Filter: $it "); it[0] == 'D' }.map { print("Abbildung: $it "); it.toUpperCase() }.find { print("Find: $it "); it.endsWith('T') }

    println()

    //Ohne asSequence() werden mehr Rechenschritter erforderlich, weil immer alle Zwischenergebnisse aufgebaut werden müssen
    listOf("Donald", "Dagobert", "Daisy", "Gustav").filter { print("Filter: $it "); it[0] == 'D' }.map { print("Abbildung: $it "); it.toUpperCase() }.find { print("Find: $it "); it.endsWith('T') }

}

data class Car(val color: String, val model: String, val year: Int){}