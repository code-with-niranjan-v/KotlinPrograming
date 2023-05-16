//Set
/*

    * Set is an unordered collection of elements, and it does not
    contain any duplicate elements.

    * It supports both mutable and immutable types.


 */

fun main() {

    //Creating a set
    var numbers = setOf(1,2,3,4,5,6,1)//Output -> [1, 2, 3, 4, 5, 6]
    println(numbers)//It removes duplicate element automatically.

    //setOf() is immutable by default.

    //Indexing
    println(numbers.elementAt(2)) //We can't use [] operator accessing set elements.

    //Accessing last and first element
    println("$numbers.first()}\n${numbers.last()}")

    //Basic Functions
    println("Sum:${numbers.sum()}\nAverage:${numbers.average()}\nMax:${numbers.max()}\nMin:${numbers.min()}")

    //we can also use contains and containsAll functions in set.

    //IsEmpty() -> To if a set is empty
    println(numbers.isEmpty())

    //Mutable set

    var numbers1 = mutableSetOf(1,2,4,5,6,6)

    numbers1.add(7)
    numbers1.addAll(listOf(8))
    println(numbers1)

    var numbers2 = mutableSetOf(2,3,4,5,9,10)

    //Set Operations
    println(numbers1.union(numbers2))
    println(numbers1.intersect(numbers2))
    println(numbers1.subtract(numbers2))

    //Removing
    numbers1.remove(7)
    println(numbers1)



}