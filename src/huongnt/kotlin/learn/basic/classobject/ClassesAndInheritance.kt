package huongnt.kotlin.learn.basic.classobject

/**
 * Created by Genie on 5/27/2017.
 * Classes can contain
 * - Constructors and initializer blocks
 * - Functions
 * - Properties
 * - Nested and Inner Classes
 * - Object Declarations
 */
fun main(args: Array<String>) {
    val cl = ClassesAndInheritance("what", "wut")

}

/**
 * what with this?
 * what does it use for?
 */
class Empty

/**
 * with default constructor
 * this param cant be use in method
 *
 */
class ClassesAndInheritance(first: String) {
    init {
        println("primary constructor with $first")
    }

    /**
     * and another constructor
     */
    constructor(first: String, last: String) : this(first) {
        println("primary constructor with $last")
    }
}

/**
 * declare properties in primary constructor
 */
class ClassWithProperties(val firstName: String, val lastName: String) {
    fun doSomething() {
        println("$firstName $lastName")
    }

}

/**
 * If the constructor has annotations or visibility modifiers, the constructor keyword is required, and the modifiers go before it
 */
class Customer public @SinceKotlin("1.1") constructor(name: String = "huhu") {}

open class ParentClass(val number: Int) {
    open var x: Int
        get() {
        return 10
    } set(value: Int) {
        value * 10
    }

    constructor(number: Int, str: String) : this(number) {}

    open fun ns() {}
    fun nv() {}
}

class childClass : ParentClass {
    override var x: Int
        get() = super.x
        set(value) {}
    constructor(number: Int) : super(number)

    constructor(number: Int, str: String) : super(number, str) {
    }

    override fun ns() {
        super.ns()
    }

}

open class Base {
    open fun f() {}
}
abstract class Derived : Base() {
    override abstract fun f()
}


open class A {
    open fun f() { print("A") }
    fun a() { print("a") }
}
interface B {
    fun f() { print("B") } // interface members are 'open' by default
    fun b() { print("b") }
}
class C() : A(), B {
    // The compiler requires f() to be overridden:
    override fun f() {
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }
}
