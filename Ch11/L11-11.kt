fun printListItem(list: MutableList<*>) {        // #1
    println("��� ��: ${list.size}")
    println("��� ����: $list")
    //list.add(100)                              // #2 ������ ����
}

fun main(args: Array<String>) {
    val ls1 = mutableListOf("�輱��", "ȫ�浿")  // #3
    val ls2 = mutableListOf(1, 2, 3, 4, 5)       // #4
    printListItem(ls1)                           // #5
    printListItem(ls2)                           // #6
}