data class FriendMine (val name: String, val age: Int, val tel: String)  // #1

val friend = listOf(FriendMine("±è¼±´Þ", 30, "010-123-4567"),            // #2
        FriendMine("È«±æµ¿", 28, "010-234-5678"),
        FriendMine("Àü½ÅÁÖ", 27, "010-345-6789"),
        FriendMine("È²Åä±æ", 32, "010-456-7890"),
        FriendMine("¹Ú¹®¼ö", 33, "010-567-8901"))

fun findHong(friendList: List<FriendMine>) {       // #3
    for(friend in friendList) {                    // #4
        if(friend.name.substring(0, 1) == "È«") {  // #5
            println("È«¾¾¸¦ Ã£¾ÒÀ½")
            return
        }
    }
    println("È«¾¾ Ã£±â°¡ Á¾·áµÊ")      // #6
}

fun findPark(fr: List<FriendMine>) {  // #7
    fr.forEach {                      // #8
        if(it.name.substring(0, 1) == "¹Ú") {
            println("¹Ú¾¾¸¦ Ã£¾ÒÀ½")
            return
        }
    }
    println("¹Ú¾¾ Ã£±â°¡ Á¾·áµÊ")
}

fun findHwang(fr: List<FriendMine>) {  // #9
    fr.forEach here@ {
        if(it.name.substring(0, 1) == "È²") {
            println("È²¾¾¸¦ Ã£¾ÒÀ½")
            return@here
        }
    }
    println("È²¾¾ Ã£±â°¡ Á¾·áµÊ")
}

fun main(args: Array<String>) {
    findHong(friend)
    findPark(friend)
    findHwang(friend)
}