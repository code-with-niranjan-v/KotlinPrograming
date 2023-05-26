//Abstract Class

/*

    * An abstract class is a class which cannot be directly instantiated,
    but we can only create objects for subclasses.

    * It acts as a blueprint for its subclasses.

    * It contains both abstracts method and concrete methods.


 */
abstract class Employee(var name:String = "",var empno:Int = 0,var department:String = "", var salary:Int = 0){

    abstract fun getDetails()

    fun showDetails(){

        println("Employee Name:\t$name\nEmployee No:\t$empno\nDepartment:\t$department\nSalary:\t$salary")

    }

}


class SoftwareEngineer:Employee(){

    override fun getDetails() {
        println("Enter Employee Name:")
        name = readLine().toString()
        println("Enter Employee No:")
        empno = readLine()!!.toInt()
        println("Enter Employee Department:")
        department = readLine().toString()
        println("Enter the Employee Salary:")
        salary = readLine()!!.toInt()
    }

}

fun main() {

    val employee1 = SoftwareEngineer()
    employee1.getDetails()
    employee1.showDetails()

}

//Interface vs Abstract
/*

    * Abstract contains both abstract and concrete methods.
    * But interface can only contain abstract methods and properties.
    * A class can only inherit one abstract class, but it can contain
    multiple interfaces.
    * Interface does not contain constructor but abstract class contains constructor.


 */