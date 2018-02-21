fun calcTotal(from: Int, to: Int): Int {   // #1
    var total: Int = 0 // #2

    val lambda = there@{f: Int, t: Int ->  // #3
        for (i in f..t) {  // #4
            total += i
        }
        return@there       // #5
    }

    lambda(from, to)       // #6

    return total           // #7
}

fun main(args: Array<String>) {
    println("1부터 100까지의 합계는 ${calcTotal(1,100)}입니다")  // #8
}