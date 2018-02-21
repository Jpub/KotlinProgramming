fun main(args: Array<String>) {
    val ls = listOf(1, 2, 3, 4, 5)                // #1
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
    println("\n�÷��� �Լ� ���� ȣ��: $ls \n")

    val seq1 = listOf(1, 2, 3, 4, 5).asSequence() // #2
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
    println("\n������(���� �Լ� ����): $seq1")

    val seq2 = listOf(1, 2, 3, 4, 5).asSequence() // #3
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
    println("\n������(���� �Լ� ����): $seq2")
}