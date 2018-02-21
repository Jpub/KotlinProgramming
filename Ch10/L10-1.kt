fun main(args: Array<String>) {
    val ls = listOf("1", "2", "3", "4")                   // #1
    // ls.remove("2")  // #2

    val ml = mutableListOf("1", "2", "3", "4")            // #3
    ml.remove("2")

    val al = arrayListOf("1", "2", "3", "4")              // #4
    al.remove("2")

    val ar1 = ArrayList<String>(ls)                       // #5
    ar1.remove("2")

    val ar2: MutableList<String> = ArrayList<String>(ls)  // #6
    ar2.remove("2")

    val ar3: List<String> = ArrayList<String>(ls)        // #7
    // ar3.remove("2")

    val ar4: ArrayList<String> = ArrayList<String>(ls)   // #8
    ar4.remove("2")
}
