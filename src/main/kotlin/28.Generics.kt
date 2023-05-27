
//Generics

/*

    Generics are the powerful features that allow us to define classes,
    methods, and properties which are accessible using different
    data types while keeping a check on the compile-time type safety.

 */

//Creating a class with generic type T
class Details<T>(var element1:T,var element2:T){

    init {

        showDetails()

    }

    fun showDetails(){

        println("Element 1 = $element1\nElement 2 = $element2")

    }


}

class Search<T>(var elements:ArrayList<T>,var target:T){

    fun getElementIndex(){

        for (element in elements){

            if(element == target){

                println("$target is found at ${elements.indexOf(element)}")
                break

            }


        }


    }

}


fun main() {
    //Creating objects with int and strings constructors arguments
    val j1 = Details(12,13)
    val j2 = Details("Hello ","World!")

    val s1 = Search(arrayListOf(1,5,4,8,9,2,3,4),3)
    val s2 = Search(arrayListOf("A","B","C","Z","D","S"),"Z")
    s1.getElementIndex()
    s2.getElementIndex()

    //So, using generics, we can write code for single generics
    //type and use it for all data types.
}