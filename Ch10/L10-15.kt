fun main(args: Array<String>) {
    var count = 0                                // #1

    val seq1 = generateSequence(count) {it + 1}  // #2

    val seq2 = seq1.takeWhile {it <= 5}          // #3

    println("generateSequence()로 생성된 시퀀스가 실행됨: ${seq2.sum()}")     // #4

    println("generateSequence()로 생성된 시퀀스가 실행됨: ${seq2.toList()}")  // #5

    println()
    val seq3 = sequenceOf(1, 2, 3, 4, 5)                                      // #6

    println("sequenceOf()로 생성된 시퀀스가 실행됨:${seq3.sum()}")            // #7

    println("sequenceOf()로 생성된 시퀀스가 실행됨:${seq3.toList()}")         // #8
}