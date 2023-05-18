//HashMap
/*

    * HashMap is same as a map but the order of the sequence
    is not guaranteed in it.
    * HashMap is mutable by default.
    * HashMap is faster because of its hash table structure.

 */
fun main(){

    var numbers= hashMapOf(1 to "One",2 to "Two",3 to "Three",4 to "Four",5 to "Five")
    println(numbers)

    //Iterating
    for (i in numbers){

        println("${i.key} -> ${i.value} ")

    }

    //Adding Key value pair
    numbers.put(6,"Six")
    println(numbers)
    numbers.putAll(mapOf(7 to "Seven",8 to "Eight"))

    //Removing a element
    numbers.remove(5)
    println("After Removing:\n${numbers}")


}