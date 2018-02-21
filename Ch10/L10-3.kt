import java.util.*
fun main(args: Array<String>) {
    //--------- List-----------------------------------------------------------
    val ls = listOf("1", "2")
    println("listOf: ${ls.javaClass.canonicalName}, ¿ä¼Ú°ª: $ls")

    val ln = listOfNotNull<String>(null, "1", "2")
    println("listOfNotNull: ${ln.javaClass.canonicalName}, ¿ä¼Ú°ª: $ln")

    val ml = mutableListOf("1", "2")
    println("mutableListOf: ${ml.javaClass.canonicalName}, ¿ä¼Ú°ª: $ml")

    val al = arrayListOf("1", "2")
    println("arrayListOf: ${al.javaClass.canonicalName}, ¿ä¼Ú°ª: $al")

    val ar = ArrayList<String>(ls)
    println("ArrayList: ${ar.javaClass.canonicalName}, ¿ä¼Ú°ª: $ar")

    val ll = LinkedList<String>()
    println("LinkedList: ${ll.javaClass.canonicalName}, ¿ä¼Ú°ª: $ll")

    //--------- Set-----------------------------------------------------------
    val st = setOf("3","2", "1", "4", "2")
    println("setOf: ${st.javaClass.canonicalName}, ¿ä¼Ú°ª: $st")

    val ms = mutableSetOf("3","2", "1", "4", "2")
    println("mutableSetOf: ${ms.javaClass.canonicalName}, ¿ä¼Ú°ª: $ms")

    val hs = hashSetOf("3","2", "1", "4", "2")
    println("hashSetOf: ${hs.javaClass.canonicalName}, ¿ä¼Ú°ª: $hs")

    val lk = linkedSetOf("3","2", "1", "4", "2")
    println("linkedSetOf: ${lk.javaClass.canonicalName}, ¿ä¼Ú°ª: $lk")

    val sr = sortedSetOf("3","2", "1", "4", "2")
    println("sortedSetOf: ${sr.javaClass.canonicalName}, ¿ä¼Ú°ª: $sr")

    val hss = HashSet(st)
    println("HashSet: ${hss.javaClass.canonicalName}, ¿ä¼Ú°ª: $hss")

    val lhs = LinkedHashSet(st)
    println("LinkedHashSet: ${lhs.javaClass.canonicalName}, ¿ä¼Ú°ª: $lhs")

    //--------- Map-----------------------------------------------------------
    val mp = mapOf(Pair("1","ÇÏ³ª"), Pair("2", "µÑ"))
    println("mapOf: ${mp.javaClass.canonicalName}, ¿ä¼Ú°ª: $mp")

    val mt = mutableMapOf("1" to "ÇÏ³ª", "2" to "µÑ")
    println("mutableMapOf: ${mt.javaClass.canonicalName}, ¿ä¼Ú°ª: $mt")

    val hm = hashMapOf("1".to("ÇÏ³ª"), "2".to( "µÑ"))
    println("hashMapOf: ${hm.javaClass.canonicalName}, ¿ä¼Ú°ª: $hm")

    val lm = linkedMapOf(Pair("1","ÇÏ³ª"), Pair("2", "µÑ"))
    println("linkedMapOf: ${lm.javaClass.canonicalName}, ¿ä¼Ú°ª: $lm")

    val sm = sortedMapOf(Pair("1","ÇÏ³ª"), Pair("2", "µÑ"))
    println("sortedMapOf: ${sm.javaClass.canonicalName}, ¿ä¼Ú°ª: $lm")

    val hsm = HashMap(mp)
    println("HashMap: ${hsm.javaClass.canonicalName}, ¿ä¼Ú°ª: $hsm")

    val lhm = LinkedHashMap(mp)
    println("LinkedHashMap: ${lhm.javaClass.canonicalName}, ¿ä¼Ú°ª: $lhm")
}
