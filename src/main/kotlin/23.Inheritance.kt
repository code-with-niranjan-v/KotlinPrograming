//Inheritance

/*

    * Inheritance means creating a new class using an existing
    class.
    * The existing class is known as base or parent class and
    new class is known as child or subclass.
    * This subclass inherits all the properties of parent class.
    We can override the function and properties of parent class from subclass.

 */

open class animal(name:String,speed: Int){
    val name:String
    var speed:Int

    init {

        this.name = name
        this.speed = speed

    }

    open fun display(){

        println("Name:$name\nSpeed:$speed")

    }

}

class Tiger(name:String,speed:Int,color:String,pattern:String):animal(name,speed){

    var  color:String
    var pattern:String

    init{

        this.color = color
        this.pattern = pattern

    }

    override fun display(){
        super.display()
        println("Tiger color:$color\nPattern:$pattern")

    }

}

fun main() {

    val tiger1 = Tiger("Tiger",100,"Orange","Black Lines")
    tiger1.display()

}