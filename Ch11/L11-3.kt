fun <T: Number> sumValue(vararg ts: T): Double {    // #1
    var result = 0.0
    for (t in ts)
        result += t.toDouble()
    return result
}

fun main(args: Array<String>) {
    println("합계: ${sumValue(1, 2, 7)}")           // #2
    // println("합계: ${sumValue("1", "2", "7")}")  // #3
}