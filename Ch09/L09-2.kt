class UserException : Throwable() // #1

fun throwEx() { // #2
    println("throwEx( ) �Լ����� UserException ���ܰ� �߻���")
    throw UserException() // #3
}

fun main(args: Array<String>) {
    try { // #4
        throwEx()
    } catch (e: UserException) { // #5
        println("���ܸ� ó���Ͽ���!!")
    }
}