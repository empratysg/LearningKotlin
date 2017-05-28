package huongnt.kotlin.learn.basic.controlflow

/**
 * Created by Genie on 5/27/2017.
 */
class ForLoops {

    fun simplest(arr: Array<Int>) {
        for (i in arr) println("$i")

        //or
        for (i: Int in arr) {
            println("$i")
        }

        //or with index
        for (i in arr.indices) {
            print("${arr[i]}")
        }

        // or this
        for ((index, value) in arr.withIndex()) {
            println("the element at $index is $value")
        }

    }

}
