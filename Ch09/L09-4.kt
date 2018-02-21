class UserException3 : Throwable() { // #1
}

class UserException4 : Throwable() { // #2
}

fun firstEx() {     // #3
    throw UserException3()
}

fun secondEx() {    // #4
    throw UserException4()
}

fun main(args: Array<String>) {
    try {
        firstEx()   // #5
    } finally {
        secondEx()  // #6
    }
}