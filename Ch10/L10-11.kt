fun main(args: Array<String>) {
    println("\n***** ���� ���� ������ IntRange �ν��Ͻ� ����")
    val range = IntRange(1, 10)           // #1

    println("\n***** forEach() �Լ� ���")
    range.forEach {print("$it")}          // #2
    println()

    (1..10).forEach {print("$it")}        // #3

    println("\n***** IntRange�� �Ӽ���")  // #4
    println("���۰�: ${range.first}")
    println("����: ${range.last}")
    println("������: ${range.step}")

    println("\n***** range.isEmpty(), none()")
    println(range.isEmpty())
    println(range.none())

    println("\n***** range.contains()")
    println(range.contains(5))

    println("\n***** range.indexOf(), elementAt(), elementAtOrNull()")
    val pos = range.indexOf(7)
    println(range.elementAt(pos))
    println(range.elementAtOrNull(15))

    println("\n***** range.count(), range.distinct(), max(), min(), sum(), average()")
    println(range.count())
    println(range.count { it % 2 == 1 }) // Ȧ���� ����
    println("���� ����(�ߺ� ����): ${range.distinct().count()}")
    println(range.max())
    println(range.min())
    println(range.sum())
    println(range.average())

    println("\n***** range.joinToString()")
    println("������: ${range.joinToString(", ")}")

    println("\n***** range.filter()�� ���ٽ�")
    val fList = range.filter {it >= 5}  // #5
    println("fList: ${fList.javaClass.canonicalName}")  // #6

    // ���� �������� ���ο� List�� Set���� ����  // #7
    val ls = range.toList()
    val ml = range.toMutableList()
    val st = range.toSet()
    val ms = range.toMutableSet()
    val hs = range.toHashSet()
}