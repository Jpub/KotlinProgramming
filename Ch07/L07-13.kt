fun main(args: Array<String>) {
    println(FriendType.SCHOOL)
    println(FriendType.SCHOOL.ordinal)
    println(FriendType.COMPANY.ordinal)
    println(FriendType.COMPANY.name)
    println(FriendType.valueOf("COMPANY"))

    val friends = FriendType.values()
    for (item in friends) {
        println(item)
    }

    println(getFriendTypeName(FriendType.SCHOOL))
}

enum class FriendType {
    SCHOOL, COMPANY, SNS, OTHERS
}

fun getFriendTypeName(friend: FriendType) =
        when (friend) {
            FriendType.SCHOOL -> "�б� ģ��"
            FriendType.COMPANY -> "ȸ�� ģ��"
            FriendType.SNS -> "SNS ģ��"
            FriendType.OTHERS -> "��Ÿ ģ��"
        }