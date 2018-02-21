fun main(args: Array<String>) {
    smartCast("스마트 캐스트 테스트")
}

fun smartCast(t: Any) {
    if (t is String)
        println("t = ${t.length}") // #1: t가 String 타입으로 스마트 캐스트된다

    if (t !is String)
        return
    else
        println("t = ${t.length}") // #2: t가 String 타입으로 스마트 캐스트된다

    // #3: || 연산자 오른쪽에서 t가 String 타입으로 스마트 캐스트된다
    if (t !is String || t.length == 0) return

    // #4: && 연산자 오른쪽에서 t가 String 타입으로 스마트 캐스트된다
    if (t is String && t.length > 0)
        println("t = ${t.length}") // #5: t가 String 타입으로 스마트 캐스트된다

    // #6: 해당 타입의 -> 다음 코드에서 t가 스마트 캐스트된다
    when (t) {
        is Int -> println(t + 1)
        is String -> println(t.length + 1)
        is IntArray -> println(t.sum())
    }
}
