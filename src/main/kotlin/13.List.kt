//List

//List is an ordered collection of objects
//Elements are not stored continuously in memory.
//So, accessing of elements are slow when compared to array.

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

    var numbers1 = mutableListOf(1,2,3,4,5,6)

    //Adding a element
    numbers1.add(2)
    numbers1.addAll(listOf(7,8,9,10))

    //Removing an element
    numbers1.remove(10)
    numbers1.removeAt(8)

    println(numbers1)
}