package tobi.udemy.functions

class Utils {

    fun upperFirstAndLast(str: String): String {
        val first = str.substring(0,1).toUpperCase() + str.substring(1);
        return first.substring(0,first.length - 1) + str.substring(str.length - 1, str.length).toUpperCase()
    }
}