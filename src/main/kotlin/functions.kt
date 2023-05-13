fun main(){

    println(sum(123,456))
    println(sum1(123,456))
    println(greet("Rithik"))

}

//Functions
/*
    * Functions are named block of code that runs only when call it.
 */

//Syntax
/*
fun name(parameter1:Datatype,parameter2:Datatype,..):Datatype{

    Function body

}

 */

//This function returns the sum of two parameters.
fun sum(a:Int,b:Int):Int{

    return a+b

}

//Same function can be written as

fun sum1(a:Int,b:Int):Int = a+b

//Above method can be used for the function that contains
//single line expressions.

fun greet(name:String){

    println("Hello, $name")

}