import java.util.*

fun main(args: Array<String>) {
    //--------- List-----------------------------------------------------------
    var ls = listOf("1", "2", "3", "4")         // #1
    // ls.set(0, "5")   ������ ����: �б� ���� ArrayList�̹Ƿ� set() �Լ��� ����.
    println("listOf: $ls")

    var ml = mutableListOf("1", "2", "3", "4")  // #2
    println("mutableListOf: $ml")

    ml.set(0, "5")  // #3
    ml[0] ="5"
    println("mutableListOf: $ml")

    ml.remove("2")  // #4
    println("mutableListOf: $ml")

    var al = arrayListOf("1", "2", "3", "4")  // #5
    println("arrayListOf: $al")

    al.set(0, "5")  // #6
    println("arrayListOf: $al")

    al.remove("2")  // #7
    println("arrayListOf: $al")

    var ar = ArrayList<String>(ls)  // #8
    println("ArrayList: $ar")

    ar.set(0, "5")  // #9
    println("ArrayList: $ar")

    ar.remove("2")  // #10
    println("ArrayList: $ar")

    var ll = LinkedList<String>()  // #11
    ll.add("1")
    ll.add("2")
    ll.add("3")
    ll.add("4")
    println("LinkedList: $ll")

    ll.set(0, "5")
    println("LinkedList: $ll")

    ll.remove("2")
    println("LinkedList: $ll")

    //--------- Set-----------------------------------------------------------
    var st = setOf("3","2", "1", "4", "2")  // #12
    // st.remove("4")  ������ ����: �б� ���� LinkedHashSet�̹Ƿ� remove() �Լ��� ����.
    println("setOf: $st")

    var ms = mutableSetOf("3","2", "1", "4", "2")  // #13
    ms.remove("4")
    println("mutableSetOf: $ms")

    var hs = hashSetOf("3","2", "1", "4", "2")     // #14
    hs.remove("4")
    println("hashSetOf: $hs")

    var lk = linkedSetOf("3","2", "1", "4", "2")  // #15
    lk.remove("4")
    println("linkedSetOf: $lk")

    var sr = sortedSetOf("3","2", "1", "4", "2")  // #16
    sr.remove("4")
    println("sortedSetOf: $sr")

    var hss = HashSet(st)         // #17
    hss.remove("4")
    println("HashSet: $hss")

    var lhs = LinkedHashSet(st)  // #18
    lhs.remove("4")
    println("LinkedHashSet: $lhs")

    //--------- Map-----------------------------------------------------------
    var mp = mapOf(Pair("1","�ϳ�"), Pair("2", "��"), // #19
            Pair("3", "��"), Pair("4", "��"))
    // mp.remove("4")  ������ ����: �б� ���� LinkedHashMap�̹Ƿ� remove() �Լ��� ����.
    println("mapOf: $mp")

    val mt = mutableMapOf("1" to "�ϳ�", "2" to "��",  // #20
            "3" to "��", "4" to "��")
    mt.remove("4")
    println("mutableMapOf: $mt")

    val hm = hashMapOf("1".to("�ϳ�"), "2".to( "��"),  // #21
            "3".to( "��"), "4".to( "��"))
    hm.remove("4")
    println("hashMapOf: $hm")

    var lm = linkedMapOf(Pair("1","�ϳ�"), Pair("2", "��"),  // #22
            Pair("3", "��"), Pair("4", "��"))
    lm.remove("4")
    println("linkedMapOf: $lm")

    var sm = sortedMapOf(Pair("1","�ϳ�"), Pair("2", "��"),  // #23
            Pair("3", "��"), Pair("4", "��"))
    sm.remove("4")
    println("sortedMapOf: $sm")

    var hsm = HashMap(mp)        // #24
    hsm.remove("4")
    println("HashMap: $hsm")

    var lhm = LinkedHashMap(mp) // #25
    lhm.remove("4")
    println("LinkedHashMap: $lhm")
}
