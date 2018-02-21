fun printMutableList (ls: MutableList<Number>) = ls.forEach {print("$it ")}  // #1

fun main(args: Array<String>) {
    val mList1: MutableList<Int> = mutableListOf(1, 2)         // #2
    val mList2: MutableList<Double> = mutableListOf(1.0, 2.0)  // #3
    val mList3: MutableList<Number> = mutableListOf(1, 2)      // #4

    println("\n ${printMutableList(mList1)}")  // #5 컴파일 에러: 타입 불일치
    println("\n ${printMutableList(mList2)}")  // #6 컴파일 에러: 타입 불일치
    println("\n ${printMutableList(mList3)}")  // #7
}
