fun main(args: Array<String>) {
    val v1 = calc(2, 7, {a, b -> a * b})
    val v2 = calc(3, 100, {a, b -> a + b})
    val v3 = calc(50, 200, {a, b -> a - b})

    println("결과는 $v1 입니다")
    println("결과는 $v2 입니다")
    println("결과는 $v3 입니다")
}

fun calc(value1: Int, value2: Int,
         execCode: (codeParam1: Int, codeParam2: Int) -> Int): Int {
    return execCode(value1, value2)
}