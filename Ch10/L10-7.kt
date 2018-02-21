fun main(args: Array<String>) {
    var ar = listOf(0, 1, 2, 3, 4, 5, 6) // #1

    val num = ar.iterator()              // #2
    var item: Int

    while (num.hasNext()) {              // #3
        item = num.next()                // #4
        print("$item")
    }
    println()                            // #5

    for(item in ar) {                    // #6
        print("$item")                   // #7
    }
}