//Recursion
/*

    A function calling itself from the
    function body is know as recursion.

 */
fun main() {

    println("Factorial:${factorial(5)}")
    display("Hello",4)

}

//Recursion function to find factorial of number.
fun factorial(num:Int):Int{

    return if (num==1){

        1

    } else{
        num*factorial(num-1)
    }

}

//Recursion function to display text n number of times.
fun display(text:String,times:Int):String?{

    if(times>0) {
        println(display(text,times-1))
    }
    return text
}