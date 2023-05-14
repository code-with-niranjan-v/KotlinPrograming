//ArrayList
/*

    Arraylist is a dynamic array,It means we
    can increase or decrease the size of the array.

    Main difference between arrayOf and Arraylist

    * ArrayList can be used to create empty array
    * It stores data in continuous manner in memory
      but, the operations takes more time when compared to arrayOf
      because it does logical operation to manage its size.
 */
fun main() {

    //Creating a ArrayList
    val number = ArrayList<Int>()

    //Adding a single element
    number.add(1)

    //Adding multiple elements
    number.addAll(arrayOf(2,3,4,5))

    //Accessing an Element
    println(number.get(2))
    println(number[2])

    //Modifying an array element
    number.set(2,3)
    println(number)
    number[3] = 4 //Another way

    //Getting the index of an element
    println(number.indexOf(5))

    //Removing an element
    number.remove(4)
    println(number)

    //Clearing the array
    number.clear()
    println(number)




}