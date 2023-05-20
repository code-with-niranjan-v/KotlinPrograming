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
        get() = field
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
    //and check condition if age is > 18 and set it value.
    println(check.result)

}