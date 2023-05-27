import java.math.BigDecimal

//Generics

class Details<T>(var element1:T,var element2:T){

    init {

        showDetails()

    }

    fun showDetails(){

        println("Element 1 = $element1\nElement 2 = $element2")

    }


}


fun main() {

    val j1 = Details(12,13)
    val j2 = Details("Hello ","World!")
}