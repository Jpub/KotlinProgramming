fun main(args: Array<String>) {
    println(makeMessage1(1))
    println(makeMessage1(2))
    println(makeMessage2(1))
    println(makeMessage2(2))
}
fun makeMessage1(msgType: Int) : String {
    return if (msgType == 1) " �ȳ��ϼ���?" else "�� ��������!!"
}
fun makeMessage2(msgType: Int) = if (msgType == 1) "���� ����?" else "�� ������!!"