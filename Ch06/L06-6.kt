fun main(args: Array<String>) {
    val m1 = Score2(100, 200)
    val m2 = Score2(300, 400)

    println(m1 times m2)      // #1: ���� �Լ��� times( )�� ȣ��
    println(m1.times(m2))     // #2: ȣ�� ���¸� �ٸ��� ����� ����
}

data class Score2(val a: Int, val b: Int) { }

infix fun Score2.times(other: Score2): Score2 {   // #3: ���� �Լ�
    return Score2(a * other.a, b * other.b)
}