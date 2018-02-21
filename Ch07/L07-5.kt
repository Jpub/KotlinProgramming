fun main(args: Array<String>) {
    val m1 = Professional("피아노")  // #1
    m1.play(m1.musicalInstrument)    // #2

    val m2 = Amateur()               // #3
    m2.play(m2.musicalInstrument)    // #4
}

interface PlayMusic {  // #5
    val musicalInstrument: String    // #6
    val instrumentType: Int          // #7
        get() = 1
    fun play(mi: String)             // #8
}

class Professional(override val musicalInstrument: String) : PlayMusic {  // #9
    override fun play(mi: String) {  // #10
        println("프로가 $mi 로 연주함")
    }
}

class Amateur : PlayMusic {          // #11
    override var musicalInstrument: String = "기타"  // #12
    override fun play(mi: String) {  // #13
        println("아마추어가 $mi 로 연주함")
    }
}