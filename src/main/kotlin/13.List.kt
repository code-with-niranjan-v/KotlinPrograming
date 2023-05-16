//List

//List is an ordered collection of objects

//listOf() is used to create a list in Kotlin

fun main() {

    //Creating a list.
    var numbers= listOf<Int>(1,6,7,3,6,7)

    //Indexing
    println(numbers[3])

    //Iterating
    //Method 1
    for (i in numbers){

        println(i)

    }

    //Method 2
    numbers.forEach{
        println(it)
    }

    //Sorting

    //Ascending
    println(numbers.sorted())

    //Descending
    println(numbers.sortedDescending())

    //Contains and Contains all
    println(numbers.contains(6))//-> it will check if a single element is present or not
    println(numbers.containsAll(listOf(5,6,7)))// -> it will check multiple elements.

    //At Default, list are immutable so,
    //they cannot be modified.

    //Creating a mutable list

}