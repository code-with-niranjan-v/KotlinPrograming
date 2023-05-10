//Loops are used to run block of code again and again until some
// condition is satisfied.

fun main(){

  //There are three loops in kotlin
    //1.While Loop
    //2.For Loop
    //3.Do while Loop

    //1.While Loop
    println("While")
    var i = 1//Control variable initialization
    while (i<=10) //i<10 -> condition
    {

        println("Hello World! -> Iteration:$i")//-> Statement
        i++ // Increment
    }

    //2.For loop
    println("For")
    for(i in 1..10 ){

        println("Hello World! -> Iteration:$i")

    }

    //3.Do while Loop
    var j = 1
    println("Do While")
    do {

        println("Hello World! -> Iteration:$j")
        j++

    }while (j<=10)
    //Unlike for and while, In do while loop body of loop is
    //executed at-least once whether the condition is true or false.
}