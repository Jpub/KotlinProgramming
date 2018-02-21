fun main(args: Array<String>) {
    val userID: String? = getUserID()                            // #1

    // sendNotification(userID)                                  // #2 ������ ����

    if(userID != null) sendNotification(userID)                 // #3

    userID?.let {userID -> sendNotification(userID)}            // #4

    userID?.let {sendNotification(it)}                          // #5

    userID?.let {
        println("$userID �Կ��� �˸� �޽����� ���½��ϴ�.")      // #6
        println("$it �Կ��� �˸� �޽����� ���½��ϴ�.")          // #7
    }
}

fun getUserID(): String? {                                      // #8
    // ����� ID�� �Է¹޴� �ڵ带 �̰��� �߰��Ѵ�
    return "user01"
}

fun sendNotification(userID: String) {                          // #9
    // �� ����ڿ��� �˶� �޽����� ������ �ڵ带 �̰��� �߰��Ѵ�
    println("$userID �Կ��� �˸� �޽����� ���½��ϴ�.")
}
