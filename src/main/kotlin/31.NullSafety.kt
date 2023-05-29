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
    /*
         Types of Cast Operator
         1.as -> unsafe cast
         2.as? -> safe cast


     */
    var str:Any = 20
    var num2 = str as Int
    println(str)

    var str1 :Any? = null
    var num3 =  str1 as? Int
    println(num3)
}