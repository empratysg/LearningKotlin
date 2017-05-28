package huongnt.kotlin.learn.basic.types

/**
 * Created by Genie on 5/22/2017.
 * has two values: true and false.
 */
class TypeBooleans {
    val valBool = true

    /**
     * || – lazy disjunction
     * && – lazy conjunction
     * ! - negation
     */
    fun operations() {
        val t = true
        val f = false
        if (t)
            println("true")

        if (!f)
            println("false")

        if (t && f)
            println("t and f is true")
        else
            println("t or f is false")

        if (t || f)
            println("t ork f is true")
        else
            println("t and f is false")
    }
}