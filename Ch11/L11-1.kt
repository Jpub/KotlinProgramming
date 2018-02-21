fun main(args: Array<String>) {
    var ls = listOf(1, 2, 3, 4)                     // #1

    val ar1: List<Int> = ArrayList<Int>(ls)         // #2
    val ar2: MutableList<Int> = ArrayList<Int>(ls)  // #3
    val ar3: ArrayList<Int> = ArrayList<Int>(ls)    // #4

    printArrayList1(ar1)
    printArrayList2(ar1)
    printArrayList3(ar1)
    //printArrayList4(ar1)  // #5: ������ ����(Ÿ�� ����ġ)
    //printArrayList5(ar1)  // #6: ������ ����(Ÿ�� ����ġ)

    printArrayList1(ar2)
    printArrayList2(ar2)
    printArrayList3(ar2)
    printArrayList4(ar2)
    //printArrayList5(ar2)  // #7: ������ ����(Ÿ�� ����ġ)

    printArrayList1(ar3)
    printArrayList2(ar3)
    printArrayList3(ar3)
    printArrayList4(ar3)
    printArrayList5(ar3)
}

fun printArrayList1 (ls: Iterable<Int>) {println(ls)}     // #8
fun printArrayList2 (ls: Collection<Int>) {println(ls)}   // #9
fun printArrayList3 (ls: List<Int>) {println(ls)}         // #10
fun printArrayList4 (ls: MutableList<Int>) {println(ls)}  // #11
fun printArrayList5 (ls: ArrayList<Int>) {println(ls)}    // #12