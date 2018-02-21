fun main(args: Array<String>) {
    smartCast("����Ʈ ĳ��Ʈ �׽�Ʈ")
}

fun smartCast(t: Any) {
    if (t is String)
        println("t = ${t.length}") // #1: t�� String Ÿ������ ����Ʈ ĳ��Ʈ�ȴ�

    if (t !is String)
        return
    else
        println("t = ${t.length}") // #2: t�� String Ÿ������ ����Ʈ ĳ��Ʈ�ȴ�

    // #3: || ������ �����ʿ��� t�� String Ÿ������ ����Ʈ ĳ��Ʈ�ȴ�
    if (t !is String || t.length == 0) return

    // #4: && ������ �����ʿ��� t�� String Ÿ������ ����Ʈ ĳ��Ʈ�ȴ�
    if (t is String && t.length > 0)
        println("t = ${t.length}") // #5: t�� String Ÿ������ ����Ʈ ĳ��Ʈ�ȴ�

    // #6: �ش� Ÿ���� -> ���� �ڵ忡�� t�� ����Ʈ ĳ��Ʈ�ȴ�
    when (t) {
        is Int -> println(t + 1)
        is String -> println(t.length + 1)
        is IntArray -> println(t.sum())
    }
}
