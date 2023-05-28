//Extension Function
/*

    Extension function is used to add functionalities to
    existing class without inheriting them.
 */
class Calculator(var num1:Int,var num2:Int)
{

    fun add():Int{

        return num1+num2

    }

}

fun main(){

    val cal = Calculator(12,45)
    val sum = cal.add()
    val ans = cal.sub()
    var result = 0
    println("Sum:$sum\nAns:$ans\nResult:$result")
    println(result.addAll(13,45))
    println(808.isPalindrome())

}

//Adding an extension function sub to Calculator class
fun Calculator.sub(): Int {

    return num1 - num2


}

//Another Example
//Adding an extension function to Int class
fun Int.addAll(num1:Int,num2:Int): Int {

    return this+num1+num2

}

//Here we have added isPalindrome() to Int() class without inheriting it.
fun Int.isPalindrome():Boolean{

    var temp = this
    var digit = 0
    var reverse = 0

    while (temp>0){
        digit = temp%10
        reverse = reverse*10 + digit
        temp = temp.floorDiv(10)
    }
    return this==reverse

}