fun main(args: Array<String>) {
    val result1 = ClassOuter.Nested().funcNested()
    println(result1)  // 2가 출력됨
    
    val result2 = ClassOuter().Inner().funcInner() // == 1
    println(result2)  // 1이 출력됨
}

class ClassOuter {
    private val bar: Int = 1

    class Nested {
        fun funcNested() = 2  // fun funcNested( ) = bar는 에러임
    }

    inner class Inner {
        fun funcInner() = bar
    }
}