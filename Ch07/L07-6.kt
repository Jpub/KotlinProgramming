fun main(args: Array<String>) {
    for(i in 1..10) {
        StateManager.msgNumber += 1
        StateManager.msgContent = StateManager.msgNumber.toString() + "��° �޽���"
        StateManager.storeMessage()
    }
}

object StateManager {
    var msgNumber: Int = 0
    var msgContent: String = ""

    fun storeMessage() {
        // �����͸� �����ϴ� �ڵ带 ���⿡ �д�
        println("�޽��� ��ȣ = " + msgNumber + ", ���� = " + msgContent)
    }
}