fun main() {


    var nums = listOf<Int>(1,2,3,5,3,10,34,73)
    var evenElement = nums.filter { it%2==0 }
    println(evenElement)

}