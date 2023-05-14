fun main() {

    /*
        Array is a collection of items.
        It is stored in continues order in memory.
        It is mutable.

     */

    //Syntax
    /*
      var array_name = arrayof<Data type>(e1,e2,e3,...en) e -> elements

     */

    var numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val strings = arrayOf<String>("Kotlin","Python","C++")
    //Iterating through array
    numbers.forEach {

        println(it)

    }
    strings.forEach {
        println(it)
    }

    //There variables types of array in Kotlin
    /*
    intArrayOf()
    floatArrayOf()
    booleanArrayOf()
    shortArrayOf()
    byteArrayOf()
    longArrayOf()
     */

    //Accessing elements of array
    println(numbers[0])//Using []
    println(numbers.get(0))//Using get()

    //Modifying
    numbers[0] = 0
    for (i in numbers.indices){

        println(numbers[i])

    }

    println(numbers)
    /*

     [Ljava.lang.Integer;@4f3f5b24
     [ -> single dimension
     Ljava.lang.Integer -> integer data type

     */



}