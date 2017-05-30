package huongnt.kotlin.learn.basic.returnjump

/**
 * Created by Genie on 5/27/2017.
 */
fun main(args: Array<String>) {
    val br = BreakAndContinue()
    val va = br.foo(listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9))
    println(va)
}

class BreakAndContinue {
    fun simplest() {
        for (i in 1..10) {
            if (i == 9)
                break
            if (i < 5)
                continue
            println("$i")
        }
    }

    fun breakWithLabel() {
        loop@ for (i in 1..10) {
            for (j in 1..100) {
                println("$i value is $j")
                if (i < 5) continue@loop
                if (j > 10) break@loop
            }
            println("it's end of $i")
        }
    }

    /**
     * cant understand
     */
    fun returnAtLabels(ints: Array<Int>): Int {
        ints.forEach {
            if (it == 0) return@returnAtLabels it
            println(it)
        }

        ints.forEach lit@ {
            if (it == 0) return@lit
            print(it)
        }

        ints.forEach {
            if (it == 0) return@forEach
            println(it)
        }
        return 1
    }

    fun foo(ints: List<Int>) {
        ints.forEach {
            if (it == 0) return
            print(it)
        }
        println("whta")
    }
}