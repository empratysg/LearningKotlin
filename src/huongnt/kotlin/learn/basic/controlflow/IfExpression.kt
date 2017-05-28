package huongnt.kotlin.learn.basic.controlflow

/**
 * Created by Genie on 5/25/2017.
 * if is an expression, can return value
 * Therefore there is no ternary operator (condition ? then : else), because
 * ordinary if works fine in this role
 */
class IfExpression {

    fun findMaxTraditional(a: Int, b: Int): Int {

        // Traditional usage
        var max = a
        if (a < b) max = b
        // With else
        if (a > b) {
            max = a
        } else {
            max = b
        }
        return max
    }

    fun findMax(a: Int, b: Int): Int {
        return if (a < b) b else a
    }

    fun doSomethingWithReturnIf(a: Int, b: Int): Int {
        return if (a < b) {
            println("it's b")
            b
        } else {
            println("it's a")
            a
        }
    }
}
