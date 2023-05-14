//Decision-Making is very important in Programing.
/*

    A result is produced based on the evaluation of some condition
    In kotlin, Let see how we use if,else if ,else statements with example


 */
fun main() {
    var num1 = 10
    var num2 = 20
    var num3 = 40
    //Simple if else statement
    if (num1 >= 0) {

        println("$num1 is positive")

    } else{

        println("$num1 is negative")

    }

    //Program to find greatest of three numbers
    if(num1 > num2 && num1> num3){
        println("$num1 is the greatest")
    } else if(num2 > num1 && num2 > num3){
        println("$num2 is the greatest")
    }else{

        println("$num3 is the greatest")
    }

    //Nested if else
    if(num1>num2){

        if(num1>num3){
            println("$num1 is the greatest")
        }else{

            println("$num3 is the greatest")

        }

    } else if(num2>num1){

        if(num2>num3){

            println("$num2 is the greatest")

        }else{

            println("$num3 is the greatest")

        }

    }
    else{

        println("$num3 is the greatest")

    }

}


