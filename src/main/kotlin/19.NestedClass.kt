//Nested Class
/*

    * Defining a class inside  another
    class is known as Nested class.

    * We define it by using the keyword inner.

    * the inner class have access to all the properties of
    outer class.

    * if we don't use inner keyword the inner function cant
    access the properties of outer class.

 */
class Car{

    var model = ""
    var brand = ""
    var year = 0

    inner class Details{

        fun Display(){

            print("Brand:${brand}\nModel:${model}\nYear:${year}")

        }

    }


}

fun main() {

    var car1 = Car()
    car1.brand = "Tata Neon"
    car1.model = "Nexon XE"
    car1.year = 2023

    car1.Details().Display()

}