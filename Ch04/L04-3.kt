fun main(args: Array<String>) {
	val m1 = Score(100, 200)
	val m2 = Score(300, 400)
	println(m1 + m2)
}

data class Score(val a: Int, val b: Int) {
	operator fun plus(other: Score): Score {
		return Score(a + other.a, b + other.b)
	}
}