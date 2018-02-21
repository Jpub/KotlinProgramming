fun runLambda(lambda: (Int, Int) -> Int): Int {        // #1
    val lambdaList = ArrayList <(Int, Int) -> Int> ()  // #2

    lambdaList.add(lambda)     // #3

    val a = lambdaList.get(0)  // #4

    return a(10, 20)          // #5
}

fun main(args: Array<String>) {
    val sum9 = {x: Int, y: Int -> x + y} // #6
    println("List�� ���ٽ��� ������ �հ�� ${runLambda(sum9)} �Դϴ�") // #7
}