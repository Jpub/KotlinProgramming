fun main(args: Array<String>) {
    val userID: String? = getUserID()                            // #1

    // sendNotification(userID)                                  // #2 컴파일 에러

    if(userID != null) sendNotification(userID)                 // #3

    userID?.let {userID -> sendNotification(userID)}            // #4

    userID?.let {sendNotification(it)}                          // #5

    userID?.let {
        println("$userID 님에게 알림 메시지를 보냈습니다.")      // #6
        println("$it 님에게 알림 메시지를 보냈습니다.")          // #7
    }
}

fun getUserID(): String? {                                      // #8
    // 사용자 ID를 입력받는 코드를 이곳에 추가한다
    return "user01"
}

fun sendNotification(userID: String) {                          // #9
    // 이 사용자에게 알람 메시지를 보내는 코드를 이곳에 추가한다
    println("$userID 님에게 알림 메시지를 보냈습니다.")
}
