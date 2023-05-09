fun main(){
    //Types Of Variable
    //Var -> Variable
    //Val -> Constant ex: pi =3.14
    var age = 10
    val pi = 3.14
    println("Age:$age\nPi\n$pi")
    /*
    Var -> can be reassigned
    Val -> cannot be reassigned
     */

    //Data Types
    var num:Int = 1034
    var radius:Double = 2.45
    var fruit:String = "Apple"
    var character:Char = 'A'
    //Use single quotes instead of double
    //In kotlin, Characters are enclosed by single quotes
    //And string are enclosed by Double Quotes.
    var success:Boolean = true
    println("\nData Types\n$num\n$radius\n$fruit\n$character")

    //Type Conversion
    var Longnum = num.toLong()//converting int to Long
    var string1 = character.toString() // Converting character to string
    var code = 65
    var char1 = code.toChar()
    println("\nTypes Conversion\n$Longnum\n$string1\n$char1")

}