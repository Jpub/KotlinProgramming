fun main(args: Array<String>) {
    val result1 = ClassOuter.Nested().funcNested()
    println(result1)  // 2�� ��µ�
    
    val result2 = ClassOuter().Inner().funcInner() // == 1
    println(result2)  // 1�� ��µ�
}

class ClassOuter {
    private val bar: Int = 1

    class Nested {
        fun funcNested() = 2  // fun funcNested( ) = bar�� ������
    }

    inner class Inner {
        fun funcInner() = bar
    }
}