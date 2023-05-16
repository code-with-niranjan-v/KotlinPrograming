//HashSet
/*

    HashSet is same as set but the sequence produced in the
    output different the order that we defined.

    HashSet are immutable.

    i.e, HashSet is Unordered while set is ordered.

 */

fun main() {

    var numbers3 = HashSet<Int>()
    numbers3.addAll(listOf(1,2,3,4,5,5,8,9,78,45,30,15))//Output order will be different.
    println(numbers3)

    /*

    All the operations that are done in mutable-set can be done
    in HashSet also.
    THe main difference between set and HashSet is
    that set is ordered while HashSet is not Ordered.
    So, we cannot access a particular element from HashSet
    using its index.

     */

}