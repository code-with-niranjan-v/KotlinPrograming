//Map
/*

    * Map is a collection that contains pair of objects in key and value
    pair.
    * Key is uniques.

    * There two map in kotlin
        i) mapOf()
        ii) mutableMapOf()

 */

fun main() {

    //Creating a Map
    val numbers = mapOf(1 to "one",2 to "two",3 to "three",4 to "four")
    println(numbers)

    //Map size
    println(numbers.size)

    //Empty Map
    var numbers1 = mapOf<Int,String>()

    //Accessing Value
    //Syntax -> map_name[key]
    println(numbers[1])

    //Iteration

    //Method 1
    numbers.forEach {
        println("Key:${it.key}\nValue:${it.value}")
    }

    //Method 2
    for(number in numbers){

        println("Key:${number.key}\nValue:${number.value}")

    }

    //We can also apply contains and containsall function for this also.

    //As we know that key is uniques
    //If we to try assign two values to same key in map it will
    //only select the last key that is assigned and omit the others.

    numbers1 = mapOf(1 to "One-1", 1 to "One-2")
    println(numbers1)

}