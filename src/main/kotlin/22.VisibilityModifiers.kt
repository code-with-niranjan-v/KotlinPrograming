//Visibility Modifiers
/*

    It is used to control visibility of a class, its members
    and its constructors.

    There are types in kotlin
    1.private -> visible inside the same class only
    2.internal -> visible inside the same module
    3.protected -> visible inside same class and subclasses
    4.public -> visible from everywhere
 */

open class A{

    private var a = 10
    internal var b = 10 // It is visible to its module only.
    protected var c = 10
    public var e = 20

}

class B: A() {

    var d = c //c is a protected variable, so it can be accessed in b subclass

}

fun main(){

    val a = A()
    val b = B()
    //println(a.a)//Cannot be accessed because it is a private variable.
    println(a.b)
    println(b.d)
    println(a.e)
}