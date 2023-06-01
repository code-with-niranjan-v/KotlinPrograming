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




}