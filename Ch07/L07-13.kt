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
            FriendType.SCHOOL -> "切背 模备"
            FriendType.COMPANY -> "雀荤 模备"
            FriendType.SNS -> "SNS 模备"
            FriendType.OTHERS -> "扁鸥 模备"
        }