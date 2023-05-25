//Data Class
/*

    Data classes are used to store a collection of data.

 */

//Creating a data class

data class Student(var name:String, var rollno:Int, var section:String, var marks:List<Int>)



//Creating objects to store data

fun main() {
    var marks = listOf(98,97,99,100,94)
    var s1 = Student("Shakeel",237,"C", marks)

    println("Name:${s1.name}\nRoll No:${s1.rollno}\nSection:${s1.section}")




}