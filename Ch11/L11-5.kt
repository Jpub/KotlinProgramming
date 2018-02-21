@JvmName("printListInt")                    // #1
fun printList(ls: List<Int>) {              // #2
    ls.forEach {print("$it")}
}

fun printList(ls: List<String>) {           // #3
    ls.forEach {print("$it")}
}

fun main(args: Array<String>) {
    printList(listOf(1, 2))                // #4
    printList(listOf("�輱��", "ȫ�浿"))  // #5
}