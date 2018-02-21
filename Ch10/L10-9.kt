import java.util.*  // #1

data class FriendOfMine (val name: String, val age: Int, val tel: String)  // #2 

fun readList(fr: List<FriendOfMine>) {
    println("***** fr.size, fr.indices")  // #3
    println(fr.size);  
    println(fr.indices)
    for(frIndex in fr.indices) {
        println("$frIndex -> $fr[frIndex]")
    }

    println("\n***** fr.isEmpty(), isNotEmpty(), none()")  // #4
    println(fr.isEmpty())
    println(fr.isNotEmpty())
    println(fr.none())

    println("\n***** fr.contains()")
    println(fr.contains(FriendOfMine("황토길", 32, "010-234-6789")))  // #5

    println("\n***** fr.get(), getOrNull(), elementAt(), elementAtOrNull(), fr[0]")  // #6
    val pos = fr.indexOf(FriendOfMine("황토길", 32, "010-234-6789"))
    println(fr.get(pos))
    println(fr.getOrNull(10))
    println(fr.elementAt(pos))
    println(fr.elementAtOrNull(10))
    println(fr[0])

    println("\n***** fr.last(), fr.first()")  // #7
    println(fr.last())
    println(fr.first())

    println("\n***** fr.count(), fr.distinct()")  // #8
    println("친구 데이터 건수(중복 포함): ${fr.count()}")
    println("친구 데이터 건수(중복 제외): ${fr.distinct().count()}")

    println("\n***** fr.component1()부터 component5()까지")  // #9
    val fr1: FriendOfMine = fr.component1()
    val fr2: FriendOfMine = fr.component2()
    val fr3: FriendOfMine = fr.component3()
    val fr4: FriendOfMine = fr.component4()
    val fr5: FriendOfMine = fr.component5()
    println("${fr1.name}, ${fr2.name}, ${fr3.name}, ${fr4.name}, ${fr5.name}")

    println("\n***** 컬렉션의 해체 선언")
    val (fn1, fn2, fn3, fn4, fn5) = fr  // #10
    println("${fr1.name}, ${fr2.name}, ${fr3.name}, ${fr4.name}, ${fr5.name}")

    println("\n***** fr.joinToString()")
    println("친구 명단:")
    for(friend in fr) {
        println("${fr.joinToString(", ")}")  // #11
    }
}

fun readListLambda(fr: List<FriendOfMine>) {
    println("\n***** fr.count()와 람다식")
    val countFriend = fr.count {it.age >= 33}  // #12
    println("33세 이상 친구 수: $countFriend")

    println("\n***** for, forEach, onEach")
    for(friend in fr) {  // #13
        println("${friend.name}, ${friend.age}, ${friend.tel}")
    }
    fr.forEach {println("${it.name}, ${it.age}, ${it.tel}")}  // #14
    fr.onEach {println("${it.name}, ${it.age}, ${it.tel}")}  // #15

    println("\n***** fr.sortedWith()와 람다식")
    val srList1 = fr.sortedWith(compareBy({it.name}, {it.age}))  // #16
    srList1.forEach {println("${it.name}, ${it.age}, ${it.tel}")}

    println("\n***** fr.sortedWith()와 클래스 멤버 속성 참조")
    val srList2 = fr.sortedWith(compareBy(FriendOfMine::name, FriendOfMine::age))  // #17
    srList2.forEach {println("${it.name}, ${it.age}, ${it.tel}")}

    println("\n***** fr.filter()와 람다식")
    val fList = fr.filter {it.age >= 35}  // #18
    fList.forEach {println("${it.name}, ${it.age}, ${it.tel}")}

    println("\n***** fr.map()")
    val mList = fList.map(FriendOfMine::name)  // #19
    println(mList)

    println("\n***** fr.filter()와 map()")
    val fmList1 = fr.filter {it.age >= 35}.map(FriendOfMine::name)  // #20
    val fmList2 = fr.filter {it.age >= 35}.map {it.name}  // #21
    println(fmList1)
    println(fmList2)
}

fun modifyList(fr: MutableList<FriendOfMine>) {
    println("\n***** fr.add()")
    fr.add(FriendOfMine("전신주", 35, "010-567-8901"))  // #22
    fr.forEach {println("${it.name}, ${it.age}, ${it.tel}")}

    println("\n***** fr.addAll()")
    val frList = listOf(FriendOfMine("이태백", 33, "010-890-1234"))
    fr.addAll(frList)  // #23
    fr.forEach {println("${it.name}, ${it.age}, ${it.tel}")}

    println("\n***** fr.removeAt()")
    fr.removeAt(6)  // #24
    fr.forEach {println("${it.name}, ${it.age}, ${it.tel}")}

    println("\n***** fr.set()을 사용하여 요소 변경")
    fr.set(4, FriendOfMine("이기자", 35, "010-567-8901"))  // #25
    fr.forEach {println("${it.name}, ${it.age}, ${it.tel}")}

    println("\n***** 인덱스를 사용하여 요소 변경")
    fr[4] = FriendOfMine("이기자", 35, "010-234-5678")  // #26
    fr.forEach {println("${it.name}, ${it.age}, ${it.tel}")}

    println("\n***** frSub1.subList()")
    val frSub1 = fr.subList(0, 2)  // #27
    frSub1.forEach {println("${it.name}, ${it.age}, ${it.tel}")} 
    println(fr.containsAll(frSub1))  // #28

    println("\n***** frSub2.slice()")
    val frSub2 = fr.slice(0..2)  // #29
    frSub2.forEach {println("${it.name}, ${it.age}, ${it.tel}")}

    println("\n***** frRev.asReversed()")
    val frRev = fr.asReversed()  // #30
    frRev.forEach {println("${it.name}, ${it.age}, ${it.tel}")}

    println("\n***** frRev.clear()")
    frRev.clear()  // #31
    println(frRev)

    // 기존 List로 다른 List, Set 생성  // #32
    val ls = fr.toList()
    val ml = fr.toMutableList()
    val st = fr.toSet()
    val ms = fr.toMutableSet()
    val hs = fr.toHashSet()
}

fun useOnlyLinkedList(fr: LinkedList<FriendOfMine>) {
    println("\n***** addFirst(), addLast()")
    fr.addFirst(FriendOfMine("갑돌이", 35, "010-5612-8901"))  // #33
    fr.addLast(FriendOfMine("갑순이", 33, "010-1234-8901"))  // #34
    fr.forEach {println("${it.name}, ${it.age}, ${it.tel}")}

    println("\n***** first(), last()")  // #35
    println(fr.first())  
    println(fr.last())

    println("\n***** removeFirst(), removeLast()")  // #36
    fr.removeFirst()
    fr.removeLast()
    fr.forEach {println("${it.name}, ${it.age}, ${it.tel}")}
}

fun others(nList: List<Int>) {
    println("\n***** max(), min(), count()와 람다식, sum()")  // #37
    println(nList.max())
    println(nList.min())
    println(nList.count())
    println(nList.count {it > 2})
    println(nList.sum())

    println("\n***** sorted()")
    val sList = nList.sorted()  // #38
    println("정렬 전: $nList, 정렬 후: $sList")

    println("\n***** flatMap()과 람다식")
    val fmList = nList.flatMap {listOf(it, it+1)}  // #39
    println(fmList)
}

fun main(args: Array<String>) {
    var fr1 = arrayListOf(FriendOfMine("김선달", 30, "010-123-4567"),  // #40
            FriendOfMine("박문수", 35, "010-777-4567"),
            FriendOfMine("황토길", 32, "010-234-6789"),
            FriendOfMine("홍길동", 32, "010-456-7890"),
            FriendOfMine("홍길동", 32, "010-456-7890"))

    var fr2 = LinkedList(fr1)  // #41

    readList(fr1)         // readList(fr2)도 동일하게 실행됨  // #42

    readListLambda(fr1)  // readListLambda(fr2)도 동일하게 실행됨  // #43

    modifyList(fr1)      // modifyList(fr2)도 동일하게 실행됨  // #44

    useOnlyLinkedList(fr2)  // LinkedList의 경우만 정상적으로 실행됨  // #45

    val nL = arrayListOf(20, 10, 50, 40, 30)  // #46
    others(nL)  // #47
}
