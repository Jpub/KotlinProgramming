fun main(args: Array<String>) {
    OuterClass.printMsg()
}

class OuterClass {
    companion object ComObj { // 이름 없이 companion object { 로 해도 된다
        fun printMsg() {
            println("동반 객체의 함수가 호출됨")
        }
    }
}