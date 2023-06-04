//Exception Handling

/*

    when there is an excepted event that may error
    or distrust the flow of program, we use exception
    handling to solve these problems.

 */
fun main() {
    var num1 = readLine()?.toInt()
    var num2 = readLine()?.toInt()
    //Try Block -> contains the code that may cause error
    try{

        var result = num1!! / num2!!

    }
    //Catch block -> contains the code that deals with error
    catch (e:ArithmeticException){

        println("Not allowed to divide by zero ")

    }
    //Finally -> this block always runs it does not matter whether it has an error or not.
    finally {
        println("This is always executed")
    }
    //Output
    /*

        10
        0
        Not allowed to divide by zero
        This is always executed



     */


}