//Enum Class

/*

    We can create user defined data types using enum classes.

 */
enum class Colour{

    Red,
    Blue,
    Yellow,
    Orange,
    Green


}

enum class Taste{

    Sweet,
    Sour,
    Bitter,
    Spicy



}

enum class Fruits{

    Apple,
    Banana,
    Orange,
    Mango


}

class FruitDetails(var name:Fruits,var colour: Colour,var taste: Taste){

    fun showDetails(){

        println("Name:$name\nColour:$colour\nTaste:$taste")

    }

}

fun main() {
    var apple:Fruits = Fruits.Apple
    var appleColour = Colour.Red
    var appleTaste = Taste.Sweet
    val fruit1 = FruitDetails(apple,appleColour,appleTaste)
    fruit1.showDetails()

}