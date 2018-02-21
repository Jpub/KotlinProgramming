fun main(args: Array<String>) {
    val e = intArrayOf(7, 8, 9) // Int 타입의 요소 세 개를 저장한 배열을 생성한다
    val list = newIntList(1, 2, 3, *e, 5) // #1
    println(list)

    println(list.get(2)) // #2
    list.set(0, 100)
    println(list)

    list.add(10)         // #3
    println(list)

    list.remove(2)       // #4
    println(list)
}

fun newIntList(vararg ts: Int): ArrayList<Int> {
    val result = ArrayList<Int>()
    for (t in ts) // ts는 배열이다
        result.add(t)
    return result
}