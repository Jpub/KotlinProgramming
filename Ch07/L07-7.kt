fun main(args: Array<String>) {
    OuterClass.printMsg()
}

class OuterClass {
    companion object ComObj { // �̸� ���� companion object { �� �ص� �ȴ�
        fun printMsg() {
            println("���� ��ü�� �Լ��� ȣ���")
        }
    }
}