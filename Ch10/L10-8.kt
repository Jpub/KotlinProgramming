fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)      // #1
    for (i in list) {
        print("${i*2} ")
    }
    println()

    val set = setOf(1, 2, 3, 4, 2)    // #2
    for (i in set) {
        print("${i*2} ")
    }
    println()

    for (i in 'a'..'g') {            // #3
        print("$i ")
    }
    println()

    for (i in 1..4) {                // #4
        print("$i ")
    }
    println()

    val arr = arrayOf(1, 2, 3, 4)   // #5
    for (i in arr) {
        print("${i*2} ")
    }
    println()

    for (i in "This is String") {  // #6
        print("${i.toUpperCase()} ")
    }
}