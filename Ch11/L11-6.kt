interface �������      // #1
class �ڵ���: �������  // #2
class �����: �������  // #3

inline fun <reified T> checkType(s: Any) {  // #4
    if (s is T) {                           // #5
        println("���� Ÿ���Դϴ�")
    } else {
        println("�ٸ� Ÿ���Դϴ�")
    }
}

fun main(args: Array<String>) {
    checkType<�ڵ���>(�ڵ���())    // #6
    checkType<�����>(�ڵ���())    // #7
    checkType<�������>(�ڵ���())  // #8
}
