//Infix Function

/*
    What is Infix Function?
        Infix function is an extension function that contains only
        one parameter, and they are created using infix keyword.

        Note:-All infix functions are extension functions, but not all extension functions
        are infix.

    Use:
        Improves readability
        e.g.,
            1.plus(2) -> normal extension function
            1 plus 2 -> infix function

 */
fun main() {

    println(2 plus 5)

}

infix fun Int.plus(num:Int):Int{

    return this + num


}