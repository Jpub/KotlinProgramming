fun main(args: Array<String>) {
	printHello(1)
}
fun printHello(msgType: Int) {
	when (msgType) {
		1, 2 -> println("�ȳ��ϼ���?")
		else -> println("�޽��� ��ȣ ����")
	}
}