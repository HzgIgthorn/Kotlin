package tobi.udemy.usesite

fun main(args: Array<String>) {
    val cars1 = mutableListOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars(cars1, cars2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    copyCars(fords1, fords2)

    //funktioniert nur, weil copyCars das Schlüsselwort out bei source verwendet
    copyCars(fords1, cars2)
}

/**
 * Die Sourcelist wird nur gelesen und kann deshalb mit out versehen werden
 * und dest wird nur geschrieben und kann mit in versehen werden
 */
fun <C> copyCars(source: MutableList<out C>, dest: MutableList<C>){
    for(car in source)
        dest.add(car)
}

open class Car{}

class Toyota: Car(){}
class Ford: Car(){}