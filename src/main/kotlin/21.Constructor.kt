//Constructor
/*

    Constructor are a special function which are executed
    when an object is created.

    there are two types of object in kotlin
        * Primary constructor -> included within the header of class
        * Secondary constructor -> defined using constructor keyword

 */

//Primary Constructor
class Cars(var model:String,var brand:String,var year:Int){

    init {//Primary constructor code block

        display()

    }



    fun display(){

        println("Model:$model\nBrand:$brand\nYear:$year")

    }
}

fun main() {

    val tata = Cars("Tata Neon","Tata",2023)
    val apple = Fruit("Apple",25,50,"Good")


}

class Fruit{

    var name:String
    var price:Int
    var amount:Int
    var quality:String = ""

    //Secondary Constructor
    constructor(name:String, price:Int, amount:Int){

        this.name = name
        this.price = price
        this.amount = amount

        display()

    }

    //Calling one secondary constructor from another

    constructor(name:String,price:Int,amount:Int,quality:String):this(name,price,amount){

        this.quality = quality
        println("\nQuality:$quality")

    }

    fun display(){

        print("Name:$name\nPrice:$price Rs\nAmount:$amount Kg")

    }

}