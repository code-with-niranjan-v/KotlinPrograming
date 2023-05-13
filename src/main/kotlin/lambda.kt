//Lambda Function
/*
    A function which does not contain any name and only body of function is
    enclosed within curly braces{} and it
    is known as Lambda function.
 */

fun main() {

    //Lambda function can be implemented in different ways.
    //Method 1
    val sum1 = {a:Int,b:Int -> a+b}
    //Method 2
    val sum2:(a:Int,b:Int) -> Unit = {a,b -> println("Sum 2:${a+b}")}


    //Anonymous Function
    /*
        An anonymous function is similar to normal function, but
        it does not contain the
        name of the function.
     */
    val sum3 = fun(a:Int,b:Int):Int {
        println("Sum:${a+b}")
        return a+b
    }

    println(sum1(40,78)) //->Lambda Function
    sum2(45,89)// -> Lambda Function
    sum3(23,67)// -> Anonymous Function
}

