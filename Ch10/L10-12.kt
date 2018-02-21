data class FriendOfMe (val name: String, val age: Int, val tel: String)       // #1

fun main(args: Array<String>) {
    // 변경 가능한 LinkedHashMap 생성
    var fr = mutableMapOf(1 to FriendOfMe("김선달", 30, "010-123-4567"),      // #2
                          2.to(FriendOfMe("박문수", 35, "010-777-4567")),     // #3
                          Pair(3, FriendOfMe("황토길", 32, "010-234-6789")),  // #4
                          4 to FriendOfMe("홍길동", 32, "010-456-7890"),
                          5 to FriendOfMe("홍길동", 32, "010-456-7890"))

    println("\n***** for, forEach, onEach")
    for ((key, value) in fr) {                             // #5
        println("Key = $key, Value = $value")
    }
    fr.forEach { k, v -> println("$k = $v") }              // #6

    println("\n***** fr.size")
    println(fr.size);                                      // #7

    println("\n***** fr.isEmpty(), isNotEmpty(), none()")  // #8
    println(fr.isEmpty())
    println(fr.isNotEmpty())
    println(fr.none())

    println("\n***** fr.contains()")  // #9
    println(fr.contains(2))
    println(fr.containsKey(2))
    println(fr.containsValue(FriendOfMe("황토길", 32, "010-234-6789")))

    println("\n***** fr.count()")    // #10
    println("친구 데이터 건수: ${fr.count()}")
    println("32세 이상의 친구 데이터 건수: ${fr.count { it.value.age >= 32 }}")

    println("\n***** 요소를 읽기")  // #11
    println(fr.get(2))
    println(fr[2])

    println("\n***** 요소를 변경하거나 추가하기")  // #12
    fr.set(6, FriendOfMe("김철수", 31, "010-1234-7890"))
    fr[6] = FriendOfMe("김철수", 31, "010-2345-7890")
    fr.forEach { k, v -> println("$k = $v") }
    println()

    fr.put(2, FriendOfMe("박문수", 32, "010-777-4567"))  // #13
    fr.put(7, FriendOfMe("황진이", 31, "010-1234-7890"))
    fr.forEach { k, v -> println("$k = $v") }

    println("\n***** 요소를 추가하기")
    fr.plusAssign(Pair(8, FriendOfMe("성춘향", 35, "010-3712-5678")))        // #14
    fr.forEach { k, v -> println("$k = $v") }

    println("\n***** 요소를 추가하면서 새로운 Map으로 생성하기")  
    val frNew = fr.plus(Pair(9, FriendOfMe("이도령", 37, "010-3212-5678")))  // #15
    frNew.forEach { k, v -> println("$k = $v") }

    println("\n***** 요소를 키로 검색 후 없으면 현재 Map에 추가하고 그 요솟값을 반환하기")
    val frInstance = fr.getOrPut(10, { FriendOfMe("진달래", 31, "010-8282-7890") })  // #16
    println("$frInstance")
    fr.forEach { k, v -> println("$k = $v") }

    println("\n***** 요소를 삭제하기")
    fr.remove(7)                                      // #17
    fr.forEach { k, v -> println("$k = $v") }

    println("\n***** 람다식 사용하기: fr.mapKeys()와 mapValues()")
    val frMap1 = fr.mapKeys { it.value.age }         //#18
    frMap1.forEach { k, v -> println("$k = $v") }
    println()
    val frMap2 = fr.mapValues { it.value.name }      // #19
    frMap2.forEach { k, v -> println("$k = $v") }

    println("\n***** 람다식 사용하기: fr.filterKeys()와 filterValues()")
    val frMap3 = fr.filterKeys { it > 5 }            // #20
    frMap3.forEach { k, v -> println("$k = $v") }
    println()
    val frMap4 = fr.filter { (it.key > 5) }          // #21
    frMap4.forEach { k, v -> println("$k = $v") }
    println()

    val frMap5 = fr.filterValues { it.age >= 35 }    // #22
    frMap5.forEach { k, v -> println("$k = $v") }
    println()
    val frMap6 = fr.filter { (it.value.age >= 35) }  // #23
    frMap6.forEach { k, v -> println("$k = $v") }
    println()

    println("\n***** 모든 요소 삭제하기")  
    val frMap7 = frMap1 as MutableMap     // #24
    frMap7.clear()                        // #25
    println(frMap7)
    println(frMap1)

    // 기존 Map으로 다른 List, Map 생성  // #26
    val ls = fr.toList()
    val ml = fr.toMutableMap()
    val mp = fr.toMap()
    val sm = fr.toSortedMap()
}
