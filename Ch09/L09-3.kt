class UserException2 : Throwable { // #1
    constructor() {}
    constructor(msg: String) : super(msg) {}
}

fun throwEx2() { // #2
    println("throwEx2() 함수에서 UserException2 예외가 발생됨")
    throw UserException2()
}

fun throwEx3() { // #3
    println("throwEx3() 함수에서 UserException2 예외가 발생됨")
    throw UserException2("이 예외는 사용자 예외임")
}

fun main(args: Array<String>) {
    try {
        throwEx2() // #4
    } catch (e: UserException2) {
        e.printStackTrace() // #5
    }

    try {
        throwEx3() // #6
    } catch (e: UserException2) {
        e.printStackTrace() // #7
    }
}