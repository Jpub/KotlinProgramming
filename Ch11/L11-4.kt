fun <T: Comparable<T>> min(first: T, second: T): T { // #1
    return if (first < second) first else second     // #2

    // val result = first.compareTo(second)          // #3
    // return if (result < 0) first else second      // #4
}

fun main(args: Array<String>) {
    println("���� ��: ${min(2, 5)}")                // #5
    println("���� ��: ${min("ȫ�浿", "�輱��")}")  // #6
}