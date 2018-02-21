fun main(args: Array<String>) {
    println("\n***** 정수 연속 범위인 IntRange 인스턴스 생성")
    val range = IntRange(1, 10)           // #1

    println("\n***** forEach() 함수 사용")
    range.forEach {print("$it")}          // #2
    println()

    (1..10).forEach {print("$it")}        // #3

    println("\n***** IntRange의 속성들")  // #4
    println("시작값: ${range.first}")
    println("끝값: ${range.last}")
    println("증가값: ${range.step}")

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
    println(range.count { it % 2 == 1 }) // 홀수의 개수
    println("값의 개수(중복 제외): ${range.distinct().count()}")
    println(range.max())
    println(range.min())
    println(range.sum())
    println(range.average())

    println("\n***** range.joinToString()")
    println("범위값: ${range.joinToString(", ")}")

    println("\n***** range.filter()와 람다식")
    val fList = range.filter {it >= 5}  // #5
    println("fList: ${fList.javaClass.canonicalName}")  // #6

    // 연속 범위값을 새로운 List나 Set으로 생성  // #7
    val ls = range.toList()
    val ml = range.toMutableList()
    val st = range.toSet()
    val ms = range.toMutableSet()
    val hs = range.toHashSet()
}