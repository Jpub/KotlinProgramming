fun main(args: Array<String>) {
    val ls1 = listOf("1", "2", "3", "4")  // #1
    println("ls1�� �ʱ갪: $ls1")  // #2

    println(JavaCollection.addOne(ls1))  // #3
    println("ls1�� ���氪: $ls1")  // #4
}