fun main(args: Array<String>) {
    val ls = listOf(1, 2, 3, 4, 5)                // #1
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
    println("\n컬렉션 함수 연쇄 호출: $ls \n")

    val seq1 = listOf(1, 2, 3, 4, 5).asSequence() // #2
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
    println("\n시퀀스(종단 함수 없음): $seq1")

    val seq2 = listOf(1, 2, 3, 4, 5).asSequence() // #3
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
    println("\n시퀀스(종단 함수 있음): $seq2")
}