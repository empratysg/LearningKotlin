package huongnt.kotlin.learn.basic.types

/**
 * Created by Genie on 5/22/2017.
 * two types of string literals
 * - escaped strings
 * - raw strings
 */
class TypeStrings{
    val escapedStr = "Hello, world!\n- oh"
    val rawStr = """
        fun main(args: Array<String>){
            println("this is raw strings \n")
        }
"""
    val text = """
|Tell me and I forget.
|Teach me and I remember.
|Involve me and I learn.
|(Benjamin Franklin)
""".trimMargin()

    fun display(){
        println(escapedStr)
        println(rawStr)
        println(text)
    }

    fun stringTemplates(){
        val i = 10
        val s = "i = $i" // evaluates to "i = 10"
        println(s)

        val t = "price"
        val text =  "$t.length is ${t.length}"
        println(text)

        val price = """$t: $9.99"""
        println(price)
    }


}
