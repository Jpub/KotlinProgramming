class UserException : Throwable() // #1

fun throwEx() { // #2
    println("throwEx( ) 함수에서 UserException 예외가 발생됨")
    throw UserException() // #3
}

fun main(args: Array<String>) {
    try { // #4
        throwEx()
    } catch (e: UserException) { // #5
        println("예외를 처리하였음!!")
    }
}