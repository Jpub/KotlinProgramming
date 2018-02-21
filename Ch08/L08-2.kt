fun main(args: Array<String>) {
    val sum9: (Int, Int) -> Int = {x, y -> x + y}                 // #1

    val lambdaList = ArrayList <(Int, Int) -> Int> ()             // #2

    lambdaList.add(sum9)                                          // #3

    val a: (Int, Int) -> Int = lambdaList.get(0)                  // #4

    println("List의 람다식을 실행한 합계는 ${a(10, 20)} 입니다")  // #5
}