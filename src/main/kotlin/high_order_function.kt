//High Order Functions
/*
    A high order function is a function that
    has one or more function as a parameter or returns a function as a result.
 */

fun main() {

    val add:(a:Int,b:Int) -> Int = {a,b -> a+b}
    val sub:(a:Int,b:Int) -> Int = {a,b -> a-b}
    val mul:(a:Int,b:Int) -> Int = {a,b -> a*b}
    val div:(a:Int,b:Int) -> Int = {a,b -> a/b}
    displayResult(add,sub,mul,div)

}

fun displayResult(add:(Int,Int)->Int,sub:(Int,Int)->Int,mul:(Int,Int)->Int,div:(Int,Int)->Int){

    println("Addition:${add(10,56)}\nSubtraction:${sub(10,56)}\nMultiplication:${mul(10,56)}\nDivision:${div(10,56)}")

}

