

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
}