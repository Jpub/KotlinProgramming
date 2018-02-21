fun main(args: Array<String>) {
	printHello(1)
}
fun printHello(msgType: Int) {
	when (msgType) {
		1, 2 -> println("안녕하세요?")
		else -> println("메시지 번호 오류")
	}
}