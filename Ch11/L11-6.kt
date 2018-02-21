interface 교통수단      // #1
class 자동차: 교통수단  // #2
class 비행기: 교통수단  // #3

inline fun <reified T> checkType(s: Any) {  // #4
    if (s is T) {                           // #5
        println("같은 타입입니다")
    } else {
        println("다른 타입입니다")
    }
}

fun main(args: Array<String>) {
    checkType<자동차>(자동차())    // #6
    checkType<비행기>(자동차())    // #7
    checkType<교통수단>(자동차())  // #8
}
