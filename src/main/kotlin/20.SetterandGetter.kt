//Setter
/*

    setter is used to set a value of variable.

 */

//Getter
/*
    Getter is used to a value of variable in kotlin
 */

/*

    Both setters and getters can only be used for class
    variables.

 */

class Check{

    var age = 20

    var result = "None"
        get() {

            if(age>18){
                return "Eligible"
            }else{
                return "Not Eligible"
            }
        }
        set(value){

            if(age>18){
                field = "Eligible"
            }else{
                field = "Not Eligible"
            }

        }

}

fun main(){

    val check = Check()

    check.result = "Check Eligible"//It will run set block of code
    //and check condition if age is > 18 and set its value.
    println(check.result)
    //From the above satement We are accessing the result
    //So, it will run get statement.

    /*

        The output is eligible because when we assign some to result
        variable it runs set block, and it checks the condition
        if age is greater than 20 and the age is 20 which
        greater than 18, it prints eligible.

     */

    //Now let us change age value

    check.age = 17
    println(check.result)

}