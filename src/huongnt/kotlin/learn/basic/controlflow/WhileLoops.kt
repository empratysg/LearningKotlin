package huongnt.kotlin.learn.basic.controlflow

/**
 * Created by Genie on 5/27/2017.
 */
fun main(args: Array<String>) {
    val whi = WhileLoops()
    whi.simplest()
}

class WhileLoops {
    fun simplest() {
        var x = 100
        while (x > 0) {
            x--
        }
        do {
            val y = createData()

        } while (y == null) // y is visible here!
    }

    fun createData(): Any? {
        return null
    }
}
