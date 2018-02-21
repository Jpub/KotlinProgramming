import java.util.*

fun main(args: Array<String>) {
    //--------- List-----------------------------------------------------------
    var ls = listOf("1", "2", "3", "4")         // #1
    // ls.set(0, "5")   컴파일 에러: 읽기 전용 ArrayList이므로 set() 함수가 없음.
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
    // st.remove("4")  컴파일 에러: 읽기 전용 LinkedHashSet이므로 remove() 함수가 없음.
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
    var mp = mapOf(Pair("1","하나"), Pair("2", "둘"), // #19
            Pair("3", "셋"), Pair("4", "넷"))
    // mp.remove("4")  컴파일 에러: 읽기 전용 LinkedHashMap이므로 remove() 함수가 없음.
    println("mapOf: $mp")

    val mt = mutableMapOf("1" to "하나", "2" to "둘",  // #20
            "3" to "셋", "4" to "넷")
    mt.remove("4")
    println("mutableMapOf: $mt")

    val hm = hashMapOf("1".to("하나"), "2".to( "둘"),  // #21
            "3".to( "셋"), "4".to( "넷"))
    hm.remove("4")
    println("hashMapOf: $hm")

    var lm = linkedMapOf(Pair("1","하나"), Pair("2", "둘"),  // #22
            Pair("3", "셋"), Pair("4", "넷"))
    lm.remove("4")
    println("linkedMapOf: $lm")

    var sm = sortedMapOf(Pair("1","하나"), Pair("2", "둘"),  // #23
            Pair("3", "셋"), Pair("4", "넷"))
    sm.remove("4")
    println("sortedMapOf: $sm")

    var hsm = HashMap(mp)        // #24
    hsm.remove("4")
    println("HashMap: $hsm")

    var lhm = LinkedHashMap(mp) // #25
    lhm.remove("4")
    println("LinkedHashMap: $lhm")
}
