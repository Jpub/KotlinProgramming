fun main(args: Array<String>) {
    val ls2 = listOf("1", "2", "3", "4")
    println("ls2의 초깃값: $ls2")

    println(kotlinCollection(ls2 as MutableList<String>))             // #1
    println("ls2의 변경값: $ls2")
}

fun kotlinCollection(ls: MutableList<String>): MutableList<String> {  // #2
    for(index in ls.indices) {                                        // #3
        ls.set(index,(ls.get(index).toInt()+1).toString())            // #4
    }
    return ls                                                         // #5
}