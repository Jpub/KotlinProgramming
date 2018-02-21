data class FriendMine (val name: String, val age: Int, val tel: String)  // #1

val friend = listOf(FriendMine("�輱��", 30, "010-123-4567"),            // #2
        FriendMine("ȫ�浿", 28, "010-234-5678"),
        FriendMine("������", 27, "010-345-6789"),
        FriendMine("Ȳ���", 32, "010-456-7890"),
        FriendMine("�ڹ���", 33, "010-567-8901"))

fun findHong(friendList: List<FriendMine>) {       // #3
    for(friend in friendList) {                    // #4
        if(friend.name.substring(0, 1) == "ȫ") {  // #5
            println("ȫ���� ã����")
            return
        }
    }
    println("ȫ�� ã�Ⱑ �����")      // #6
}

fun findPark(fr: List<FriendMine>) {  // #7
    fr.forEach {                      // #8
        if(it.name.substring(0, 1) == "��") {
            println("�ھ��� ã����")
            return
        }
    }
    println("�ھ� ã�Ⱑ �����")
}

fun findHwang(fr: List<FriendMine>) {  // #9
    fr.forEach here@ {
        if(it.name.substring(0, 1) == "Ȳ") {
            println("Ȳ���� ã����")
            return@here
        }
    }
    println("Ȳ�� ã�Ⱑ �����")
}

fun main(args: Array<String>) {
    findHong(friend)
    findPark(friend)
    findHwang(friend)
}