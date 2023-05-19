//Class
/*

    Class is a blueprint of an object.
    It contains it own attributes and method.
    Members -> class variables
    methods -> class functions

 */

//Object
/*

    Object is an instance of a class.
    It is used to access members and methods of a class.
    Each object has its own state(values) and behaviour(methods).

 */

//Creating a class
class Animal{

    var name = ""//Class Member

    fun speak(sound:String){ //Class Method

        print(sound)

    }

    fun AnimalName(){
        var name = "Cat" //Local Variable
        print(this.name)// Global Variable
        //this keyword refers to instance of the class.

    }

}


fun main() {

    //Creating an object
    val dog = Animal()
    dog.name = "Dog"
    dog.speak("Bark! Bark!\n")
    dog.AnimalName()
    /*

    Here

    dog -> object
    name -> attributes
    speak -> behaviour

     */

}