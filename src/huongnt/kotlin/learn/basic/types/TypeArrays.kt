package huongnt.kotlin.learn.basic.types

import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * Created by Genie on 5/22/2017.
 * represented by the Array class
 */
class TypeArrays {

    val arrs: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val byteArr: ByteArray = ByteArray(10) // ByteArray , ShortArray ,IntArray and so on
    val arrAnys: Array<Any> = arrayOf(1, 'a', true, "text")

    /**
     * arrays in Kotlin are invariant
     * in Java      Object[] a =new String[10] -> Success
     * in kotlin    val a: Array<Any> = Array<String>(...) -> Error
     */
    fun createArray() {
        // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
        val asc = Array(5, { i -> (i * i).toString() })

        // Array[i] = Array.get(i)
    }
}