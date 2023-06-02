//Fiter

/*

    The filter function is used to create a new collection
    containing only the elements that satisfy a given predicate
    (a lambda expression that evaluates to a Boolean).
    It iterates over each element in the collection
    and includes only those elements for which the predicate
    returns true.

 */
//Map
/*

    The map function is used to transform each element of a collection according
    to a given transformation function (a lambda expression).
    It applies the transformation function to each element and
    returns a new collection with the transformed elements.
    The resulting collection has the same size as the original collection.

 */
fun main() {


    var nums = listOf<Int>(1,2,3,5,3,10,34,73)
    var evenElement = nums.filter { it%2==0 }
    println(evenElement)

    //Transforming numbs into a Boolean Elements
    var oddElementResult = nums.map{ it%2!=0 }
    println(oddElementResult)
    //Map can be only used for modifying not filtering.

    var oddElementSquare = nums.filter{it%2 != 0}.map{it * it}
    println(oddElementSquare)

    var elements2 = listOf(1,5,3,90,56,34,87,23)

    var checkDividableBy3 = elements2.all{it%3==0}
    //Checks if all the elements are divisible by 3
    println(checkDividableBy3)

    var checkAnyDividableBy3 = elements2.any { it%3==0 }
    //Checks if any of the elements are divisible by 3
    println(checkAnyDividableBy3)

    var count = elements2.count { it%3==0 }
    //Returns the numbers of elements that satisfy the predicate
    println(count)

    var firstElement = elements2.find{it%3==0}
    //Return the first element that satisfies the predicate.
    println(firstElement)






}