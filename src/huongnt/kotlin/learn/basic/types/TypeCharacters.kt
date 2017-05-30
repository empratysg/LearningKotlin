package huongnt.kotlin.learn.basic.types

/**
 * Created by Genie on 5/22/2017.
 * Characters are represented by the type Char . They can not be treated directly as numbers
 *
 * fun check(c: Char) {
 *      if (c == 1) { // ERROR: incompatible types
 *      // ...
 *      }
 * }
 */
class TypeCharacters {
    /**
     * @param c character
     */
    fun decimalDigitValue(c: Char): Int {
        if (c !in '0'..'9')
            throw IllegalArgumentException("Out of range")
        return c.toInt() - '0'.toInt() // Explicit conversions to numbers
    }

    fun representation() {
        val v: Char = '\"'
        val v1: Char? = v
        v1?.inc()
        val v2: Char? = v
        println(v1 === v2)
        println("${v1.toString()} and ${v2.toString()}")
    }

}