data class FriendOfMe (val name: String, val age: Int, val tel: String)       // #1

fun main(args: Array<String>) {
    // ���� ������ LinkedHashMap ����
    var fr = mutableMapOf(1 to FriendOfMe("�輱��", 30, "010-123-4567"),      // #2
                          2.to(FriendOfMe("�ڹ���", 35, "010-777-4567")),     // #3
                          Pair(3, FriendOfMe("Ȳ���", 32, "010-234-6789")),  // #4
                          4 to FriendOfMe("ȫ�浿", 32, "010-456-7890"),
                          5 to FriendOfMe("ȫ�浿", 32, "010-456-7890"))

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
    println(fr.containsValue(FriendOfMe("Ȳ���", 32, "010-234-6789")))

    println("\n***** fr.count()")    // #10
    println("ģ�� ������ �Ǽ�: ${fr.count()}")
    println("32�� �̻��� ģ�� ������ �Ǽ�: ${fr.count { it.value.age >= 32 }}")

    println("\n***** ��Ҹ� �б�")  // #11
    println(fr.get(2))
    println(fr[2])

    println("\n***** ��Ҹ� �����ϰų� �߰��ϱ�")  // #12
    fr.set(6, FriendOfMe("��ö��", 31, "010-1234-7890"))
    fr[6] = FriendOfMe("��ö��", 31, "010-2345-7890")
    fr.forEach { k, v -> println("$k = $v") }
    println()

    fr.put(2, FriendOfMe("�ڹ���", 32, "010-777-4567"))  // #13
    fr.put(7, FriendOfMe("Ȳ����", 31, "010-1234-7890"))
    fr.forEach { k, v -> println("$k = $v") }

    println("\n***** ��Ҹ� �߰��ϱ�")
    fr.plusAssign(Pair(8, FriendOfMe("������", 35, "010-3712-5678")))        // #14
    fr.forEach { k, v -> println("$k = $v") }

    println("\n***** ��Ҹ� �߰��ϸ鼭 ���ο� Map���� �����ϱ�")  
    val frNew = fr.plus(Pair(9, FriendOfMe("�̵���", 37, "010-3212-5678")))  // #15
    frNew.forEach { k, v -> println("$k = $v") }

    println("\n***** ��Ҹ� Ű�� �˻� �� ������ ���� Map�� �߰��ϰ� �� ��ڰ��� ��ȯ�ϱ�")
    val frInstance = fr.getOrPut(10, { FriendOfMe("���޷�", 31, "010-8282-7890") })  // #16
    println("$frInstance")
    fr.forEach { k, v -> println("$k = $v") }

    println("\n***** ��Ҹ� �����ϱ�")
    fr.remove(7)                                      // #17
    fr.forEach { k, v -> println("$k = $v") }

    println("\n***** ���ٽ� ����ϱ�: fr.mapKeys()�� mapValues()")
    val frMap1 = fr.mapKeys { it.value.age }         //#18
    frMap1.forEach { k, v -> println("$k = $v") }
    println()
    val frMap2 = fr.mapValues { it.value.name }      // #19
    frMap2.forEach { k, v -> println("$k = $v") }

    println("\n***** ���ٽ� ����ϱ�: fr.filterKeys()�� filterValues()")
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

    println("\n***** ��� ��� �����ϱ�")  
    val frMap7 = frMap1 as MutableMap     // #24
    frMap7.clear()                        // #25
    println(frMap7)
    println(frMap1)

    // ���� Map���� �ٸ� List, Map ����  // #26
    val ls = fr.toList()
    val ml = fr.toMutableMap()
    val mp = fr.toMap()
    val sm = fr.toSortedMap()
}
