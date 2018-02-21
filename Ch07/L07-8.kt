fun main(args: Array<String>) {
    val m = MyClass.create() // val m = MyClass( )는 에러임
    m.printMyClass()
}

class MyClass {
    private constructor()

    companion object {
        fun create(): MyClass = MyClass()
    }
    
    fun printMyClass() {
        println("팩토리 객체의 함수가 호출됨")
    }
}