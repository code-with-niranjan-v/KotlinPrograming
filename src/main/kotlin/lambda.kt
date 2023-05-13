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

    """
        Difference between Anonymous function and Lambda function
    Syntax: Anonymous functions are defined using the fun keyword, while lambda functions are defined using the { } syntax.

    Return type: In an anonymous function, you must specify the return type explicitly using a colon : after the argument list. In a lambda function, the return type is inferred from the context.

    Function name: Anonymous functions have a name, which can be used for recursion or for referencing the function itself. Lambda functions do not have a name, and can only be used as expressions.

    Inline functions: Lambda functions can be marked as inline, which means that their code is inserted directly into the calling function, reducing the overhead of function calls. Anonymous functions cannot be marked as inline."""
}

