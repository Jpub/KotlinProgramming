fun main(args: Array<String>) {
    val m = MyClass.create() // val m = MyClass( )�� ������
    m.printMyClass()
}

class MyClass {
    private constructor()

    companion object {
        fun create(): MyClass = MyClass()
    }
    
    fun printMyClass() {
        println("���丮 ��ü�� �Լ��� ȣ���")
    }
}