package huongnt.kotlin.learn.basic.types

/**
 * Created by Genie on 5/22/2017.
 * On the Java platform, numbers are physically stored as JVM primitive types,
 * unless we need a nullable number reference (e.g. Int? )
 * or generics are involved.
 *
 */
class TypeNumbers {
    val d: Double = 123.4 // double by default
    val f: Float = 123.4f // target by 'f'
    val l: Long = 123_456_789L // target by 'L' not 'l'
    val i: Int = 123_456_789
    val s: Short = 32_000
    val b: Byte = 127;

    /**
     * i dont know why
     * but if v = 10 will print 'true'
     * v = 10000 will print 'false'
     */
    fun representation() {
        val v: Int = 10000
        val v1: Int? = v
        val v2: Int? = v
        println(v1 === v2)
    }

    /**
     * Due to different representations, smaller types are not subtypes of bigger ones
     */
    fun explicitConversions() {
        val b: Byte = 1 // OK, literals are checked statically
//        val i: Int = b // ERROR
        val i: Int = b.toInt() // OK: explicitly widened

        val l = 1L + 3 // Long + Int => Long
        println("b is $b and i is $i and l is $l")
    }

    /**
     * shl(bits) – signed shift left (Java's << )
     * shr(bits) – signed shift right (Java's >> )
     * ushr(bits) – unsigned shift right (Java's >>> )
     * and(bits) – bitwise and
     * or(bits) – bitwise or
     * xor(bits) – bitwise xor
     * inv() – bitwise inversion
     */
    fun operations() {
        val x = (1 shl 2) and 0x000FF000
        println(x.toString())
    }


}
