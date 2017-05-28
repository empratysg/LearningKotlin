package huongnt.kotlin.learn.basic.controlflow

import java.lang.Integer.parseInt

/**
 * Created by Genie on 5/25/2017.
 * replaces the switch operator of C-like languages
 */
class WhenExpression {
    /**
     * simplest use of when expresion
     */
    fun simplest(x: Int) {
        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }

        when (x) {
            0, 1 -> print("x == 0 or x == 1")
            else -> print("otherwise")
        }


    }

    /**
     * when can be used as an expression
     */
    fun asExpression(x: Int): String {
        return when (x) {
            1 -> "x == 1"
            2 -> "x == 2"
            else -> { // Note the block
                "x is neither 1 nor 2"
            }
        }
    }

    /**
     * We can use arbitrary expressions (not only constants) as branch conditions
     */
    fun useWithArbitraryExpressions(x: Int, s: String) {
        when (x) {
            parseInt(s) -> print("s encodes x")
            else -> print("s does not encode x")
        }

    }

    /**
     * use with range value
     */
    fun useWithRange(x: Int) {
        val validNumbers = arrayOf(1, 5, 7, 9, 44)
        when (x) {
            in 1..10 -> print("x is in the range")
            in validNumbers -> print("x is valid")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }

    }

    /**
     * smart cast in when expression
     */
    fun smartCastWhen(x: Any) {
        val hasPrefix = when (x) {
            is String -> x.startsWith("prefix")//Smart Cast
            else -> false
        }

    }


    /**
     * use as replacement of if-else-if chain
     */
    fun useWithNoArgument(x: Int) {
        when {
            x.isOdd() -> print("x is odd")
            x.isEven() -> print("x is even")
            else -> print("x is funny")
        }

    }
}

private fun Int.isOdd(): Boolean {
    return this.rem(2) != 0
}

private fun Int.isEven(): Boolean {
    return this.rem(2) == 0
}
