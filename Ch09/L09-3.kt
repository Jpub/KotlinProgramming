class UserException2 : Throwable { // #1
    constructor() {}
    constructor(msg: String) : super(msg) {}
}

fun throwEx2() { // #2
    println("throwEx2() �Լ����� UserException2 ���ܰ� �߻���")
    throw UserException2()
}

fun throwEx3() { // #3
    println("throwEx3() �Լ����� UserException2 ���ܰ� �߻���")
    throw UserException2("�� ���ܴ� ����� ������")
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