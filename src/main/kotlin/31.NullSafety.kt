import kotlin.reflect.typeOf

fun main(){

    var name:String? = null
    //Safe Operator
    println(name?.length)
    /*

        Safe Operator returns null if the value is null

     */

    //Elvis Operator
    /*

        Elvis operator returns a non-null value if the original value is null


     */

    println(name?.length ?: 0)

    //Type Checking

    var num = 10
    if(num is Int){

        println("$num is Integer")

    }else{

        println("$num is not a Integer")

    }

    //Cast Operator
    var num2 = "20"
    var str = num2 as Int
    println(str)
}