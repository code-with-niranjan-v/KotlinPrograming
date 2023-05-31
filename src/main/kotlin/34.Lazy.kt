//Lazy
/*

    Lazy is used to initialize objects, but the objects
    defined by lazy will be initialized only when it is used,
    So, it is used save memory wastage.

    They are restricted to only val variables.

 */

fun main() {

    val text by lazy {
        "Hello World!"
    }

    println(text)

}