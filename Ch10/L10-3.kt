import java.util.*
fun main(args: Array<String>) {
    //--------- List-----------------------------------------------------------
    val ls = listOf("1", "2")
    println("listOf: ${ls.javaClass.canonicalName}, ��ڰ�: $ls")

    val ln = listOfNotNull<String>(null, "1", "2")
    println("listOfNotNull: ${ln.javaClass.canonicalName}, ��ڰ�: $ln")

    val ml = mutableListOf("1", "2")
    println("mutableListOf: ${ml.javaClass.canonicalName}, ��ڰ�: $ml")

    val al = arrayListOf("1", "2")
    println("arrayListOf: ${al.javaClass.canonicalName}, ��ڰ�: $al")

    val ar = ArrayList<String>(ls)
    println("ArrayList: ${ar.javaClass.canonicalName}, ��ڰ�: $ar")

    val ll = LinkedList<String>()
    println("LinkedList: ${ll.javaClass.canonicalName}, ��ڰ�: $ll")

    //--------- Set-----------------------------------------------------------
    val st = setOf("3","2", "1", "4", "2")
    println("setOf: ${st.javaClass.canonicalName}, ��ڰ�: $st")

    val ms = mutableSetOf("3","2", "1", "4", "2")
    println("mutableSetOf: ${ms.javaClass.canonicalName}, ��ڰ�: $ms")

    val hs = hashSetOf("3","2", "1", "4", "2")
    println("hashSetOf: ${hs.javaClass.canonicalName}, ��ڰ�: $hs")

    val lk = linkedSetOf("3","2", "1", "4", "2")
    println("linkedSetOf: ${lk.javaClass.canonicalName}, ��ڰ�: $lk")

    val sr = sortedSetOf("3","2", "1", "4", "2")
    println("sortedSetOf: ${sr.javaClass.canonicalName}, ��ڰ�: $sr")

    val hss = HashSet(st)
    println("HashSet: ${hss.javaClass.canonicalName}, ��ڰ�: $hss")

    val lhs = LinkedHashSet(st)
    println("LinkedHashSet: ${lhs.javaClass.canonicalName}, ��ڰ�: $lhs")

    //--------- Map-----------------------------------------------------------
    val mp = mapOf(Pair("1","�ϳ�"), Pair("2", "��"))
    println("mapOf: ${mp.javaClass.canonicalName}, ��ڰ�: $mp")

    val mt = mutableMapOf("1" to "�ϳ�", "2" to "��")
    println("mutableMapOf: ${mt.javaClass.canonicalName}, ��ڰ�: $mt")

    val hm = hashMapOf("1".to("�ϳ�"), "2".to( "��"))
    println("hashMapOf: ${hm.javaClass.canonicalName}, ��ڰ�: $hm")

    val lm = linkedMapOf(Pair("1","�ϳ�"), Pair("2", "��"))
    println("linkedMapOf: ${lm.javaClass.canonicalName}, ��ڰ�: $lm")

    val sm = sortedMapOf(Pair("1","�ϳ�"), Pair("2", "��"))
    println("sortedMapOf: ${sm.javaClass.canonicalName}, ��ڰ�: $lm")

    val hsm = HashMap(mp)
    println("HashMap: ${hsm.javaClass.canonicalName}, ��ڰ�: $hsm")

    val lhm = LinkedHashMap(mp)
    println("LinkedHashMap: ${lhm.javaClass.canonicalName}, ��ڰ�: $lhm")
}
