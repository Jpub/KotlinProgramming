fun main(args: Array<String>) {
    val v1 = calc(2, 7, {a, b -> a * b})
    val v2 = calc(3, 100, {a, b -> a + b})
    val v3 = calc(50, 200, {a, b -> a - b})

    println("����� $v1 �Դϴ�")
    println("����� $v2 �Դϴ�")
    println("����� $v3 �Դϴ�")
}

fun calc(value1: Int, value2: Int,
         execCode: (codeParam1: Int, codeParam2: Int) -> Int): Int {
    return execCode(value1, value2)
}