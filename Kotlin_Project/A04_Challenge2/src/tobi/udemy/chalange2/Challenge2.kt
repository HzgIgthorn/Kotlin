package tobi.udemy.chalange2

fun main(args: Array<String>) {
    /*1. Declare a non-nullable float variable two ways and assign it the value -3847.384*/
    val f1: Float = ("-3847.384").toFloat()
    val f2: Float = -3847.384f

    /*2. Now change both of those variable declarations into nullable variables.*/
    var f3: Float? = f1
    var f4 = f2!!

    /*3. Now declare an array of type non-nullable Short. Make it size 5, and assign it the vallues 1,2,3,4,5*/
    val short = arrayOf<Short>(1,2,3,4,5)

    /*4. New delcalre an array of nullable Ints and initialize it with the values
    * 5, 10, 15, 20, 30, 35, 40, 45, 50 etc., all the way up to 200*/
    val ints = Array<Int?>(40) {i -> 5*(i+1)}
    printLine(ints)

    /*5 You have to call a Java method with the following signature form Kotlin:
    * public void method{char[] charArray}. Declare an array that you could
    * pass to the method and initialize it with the values 'a', 'b' and 'c'*/
    val chars = charArrayOf('a','b','c')

    /*6. Given the following code:*/
    val x: String? = "I AM IN UPPERCASE"
    /*Using one line of code, declare another string variable, and assign it x.toLowerCase() when
    * x isn't null, and the string "I give up!" when x is null.*/
    println()
    println(x?.toLowerCase() ?:"I give up!")

    /*7. Now use the let function to (a) lowercase the string, and then (b) replace "am" with "am not" in the resutl*/
    println(x?.let { it.toLowerCase().replace("am","am not") })

    /*8. You're really, really confident that the variable myNonNullVariable can't contain null.
    * Change the following code to assert that myNonNullVariable isn't null (and shoot yoursel in the foot!)*/
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}

fun printLine(anys: Array<Int?>){
    var hasFirst = false
    for(any in anys){
        if(hasFirst)
            print(", ${any.toString()}")
        else{
            print(any.toString())
            hasFirst = true
        }
    }
}