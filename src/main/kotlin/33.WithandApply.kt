//With and Apply

/*

    With and Apply are scope functions that allow us to do operations
    on an object in a specified scope.

 */

class StudentsDetails{

    var name:String =""
    var rollno:Int = -1

    fun displayDetails(){

        println("Name:$name\nRoll No:$rollno")

    }

}

fun main() {

    val student1 = StudentsDetails()
    with(student1){

        name = "Ram"
        rollno = 12
        displayDetails()


    }

    /*

        we can use with() to access the public properties
        and functions an object without specifying the
        object name repeatedly.


     */



    student1.apply {
        name = "Arun"
        rollno = 5

    }.displayDetails()

    /*

        Apply is also similar to with function, but we can the functions
        inside the object at the end of the apply function.

     */

}