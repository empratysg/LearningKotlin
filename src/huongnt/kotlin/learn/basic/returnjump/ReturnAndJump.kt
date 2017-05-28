package huongnt.kotlin.learn.basic.returnjump

/**
 * Created by Genie on 5/27/2017.
 * Kotlin has three structural jump expressions:
 * - return
 * - break
 * - continue
 */
fun main(args: Array<String>) {
    val returnandjump: ReturnAndJump? = null
    returnandjump?.name = "ahihi"
    returnandjump?.doSomethingWithName() ?: println("eo oi")
}

class ReturnAndJump {
    var name: String? = null

    fun doSomethingWithName() {
        println(name ?: return)
    }
}
