

//Object

/*

    Object is a special type of class that has only one
    object created for it, by default.

    So, we don't have to create objects for them.

 */

open class EmployeeDetails(var name:String,var department:String,var empNo:Int,var salary:Int){


    fun display(){

        println("Name:$name\nEmployee No:$empNo\nDepartment:$department\nSalary:$salary")

    }


}
/*

    Object doesn't have constructors because they have only
    one objects, so we can directly pass the parameters to the parent
    class from them.

 */

object EmployeeGetDetails:EmployeeDetails("Ram","Developer",287,150000){


}

fun main() {

    EmployeeGetDetails.display()

}

//Companion Object
/*

    In Kotlin, a companion object is a special object declaration that
    is tied to the class it belongs to. It allows you to define static
    members (properties and functions) that can be accessed directly
    on the class itself, without requiring an instance of the class.

 */
class StudentDetails(var name: String,var rollNo:Int){


    companion object{
        var depat = "CSE"
        fun display(){

            println("This a companion Object")

        }


    }

    fun display1(){

        println("Name:$name\nRoll No:$rollNo\nDepartment:$depat")

    }

}

/*

    Companion object cant access the objects or properties outside it,
    but the class methods or variables can access the properties inside the companion
    object.

 */