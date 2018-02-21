fun printListItem(list: MutableList<*>) {        // #1
    println("요소 수: ${list.size}")
    println("요소 내역: $list")
    //list.add(100)                              // #2 컴파일 에러
}

fun main(args: Array<String>) {
    val ls1 = mutableListOf("김선달", "홍길동")  // #3
    val ls2 = mutableListOf(1, 2, 3, 4, 5)       // #4
    printListItem(ls1)                           // #5
    printListItem(ls2)                           // #6
}