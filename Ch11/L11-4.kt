fun <T: Comparable<T>> min(first: T, second: T): T { // #1
    return if (first < second) first else second     // #2

    // val result = first.compareTo(second)          // #3
    // return if (result < 0) first else second      // #4
}

fun main(args: Array<String>) {
    println("작은 값: ${min(2, 5)}")                // #5
    println("작은 값: ${min("홍길동", "김선달")}")  // #6
}