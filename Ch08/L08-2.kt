fun main(args: Array<String>) {
    val sum9: (Int, Int) -> Int = {x, y -> x + y}                 // #1

    val lambdaList = ArrayList <(Int, Int) -> Int> ()             // #2

    lambdaList.add(sum9)                                          // #3

    val a: (Int, Int) -> Int = lambdaList.get(0)                  // #4

    println("List�� ���ٽ��� ������ �հ�� ${a(10, 20)} �Դϴ�")  // #5
}