fun main(args: Array<String>) {
    val ls1 = listOf("1", "2", "3", "4")  // #1
    println("ls1의 초깃값: $ls1")  // #2

    println(JavaCollection.addOne(ls1))  // #3
    println("ls1의 변경값: $ls1")  // #4
}