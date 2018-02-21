fun parseInt(value: String): Int { // #1
    return value.toInt()
}

fun main(args: Array<String>) {
    var err: Int? = 100 // #2

    try { // #3
        err = parseInt("7A")
    }
    catch (e: Exception) { // #4
        err = 0
    }
    catch (e: NumberFormatException) { // #5
        err = null
    }

    println(err) // #6
}