fun main(args: Array<String>) {
    for(i in 1..10) {
        StateManager.msgNumber += 1
        StateManager.msgContent = StateManager.msgNumber.toString() + "번째 메시지"
        StateManager.storeMessage()
    }
}

object StateManager {
    var msgNumber: Int = 0
    var msgContent: String = ""

    fun storeMessage() {
        // 데이터를 저장하는 코드를 여기에 둔다
        println("메시지 번호 = " + msgNumber + ", 내용 = " + msgContent)
    }
}