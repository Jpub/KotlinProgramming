fun main(args: Array<String>) {
    val m1 = Score2(100, 200)
    val m2 = Score2(300, 400)

    println(m1 times m2)      // #1: 중위 함수인 times( )를 호출
    println(m1.times(m2))     // #2: 호출 형태만 다르고 결과는 동일
}

data class Score2(val a: Int, val b: Int) { }

infix fun Score2.times(other: Score2): Score2 {   // #3: 중위 함수
    return Score2(a * other.a, b * other.b)
}