fun main(args: Array<String>) {
    val ls = listOf("홍길동", "김선달", "황진이", "전신주", "황토길")             // #1

    println("********* withIndex()")
    val lt1 = ls.withIndex().filter { it.index > 2 && it.value.startsWith("황") } // #2

    lt1.forEach { (i, v) -> print("$v at $i,") }               // #3
    println()
    lt1.forEach {print("${it.value} at ${it.index}, ")}        // #4

    println("\n********* filterIndexed()")
    val lt2 = ls.filterIndexed { index, _ -> index % 2 == 0 }  // #5
    println(lt2)

    println("\n********* mapIndexed()")
    val lt3 = ls.mapIndexed { index, value -> value }          // #6
    println(lt3)

    println("\n********* forEachIndexed()")
    ls.forEachIndexed { i, v ->                                // #7
        if(i % 2 == 0) print("$i : $v,") }
}