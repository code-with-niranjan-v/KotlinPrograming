//Late init
/*

    It is used when we need to initialize variables
    at a later time.

    It is restricted only for var variables, and
    they must non-null data type

    Lateinit cannot be used for primitive types.

 */

fun main() {
    val sample = Sample()
    sample.setValues()
    sample.display()

}

class Sample{

    private lateinit var text:String

    fun setValues(){

        text = "Hello World"

    }

    fun display(){
        println(text)
    }


}