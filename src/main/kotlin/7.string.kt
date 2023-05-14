fun main() {

    /*
    -------------------------------------------------------------
   | * String is a collection or sequence of character.
   | * It is immutable i,e. We cannot modify individual elements in string.
   | * Double quotes is used for single line strings
   | * triple quotes are used for multi-line strings.
   | * Note:- single quotes used for character data type.
    --------------------------------------------------------
    */

    //Creating a string
    var string1 = "Welcome"

    //Acessing elements
    println(string1[0])
    println(string1.get(2))

    //Iterating through String
    string1.forEach {

        println(it)

    }
    //Iterating through for loop

    for(i in string1){

        println(i)

    }

    //String templates
    println("$string1 to Kotlin!")//Here Welcome string is assigned in its place.

    /*
        Types of String:-
        ----------------
        1.Escaped String -> it contains for both escape characters and characters
        2.Raw String -> it contains Multi Line strings.

     */

    //Example for Escaped string
    println("1\n2\n3")

    //Example for Raw String
    println("""
    -------------------------------------------------------------
   | * String is a collection or sequence of character.
   | * It is immutable i,e. We cannot modify individual elements in string.
   | * Double quotes is used for single line strings
   | * triple quotes are used for multi-line strings.
   | * Note:- single quotes used for character data type.
    --------------------------------------------------------
""".trimIndent())
}