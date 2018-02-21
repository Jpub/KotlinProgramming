class Star<T> {}                              // #1

fun main(args: Array<String>) {
    val st1: Star<Any> = Star<Any>()          // #2
    //val st2: Star<Any> = Star<Int>()        // #3 ������ ����: Ÿ�� ����ġ
    //val st3: Star<Any> = Star<Number>()     // #4 ������ ����: Ÿ�� ����ġ
    //val st4: Star<Any> = Star<String>()     // #5 ������ ����: Ÿ�� ����ġ

    val st5: Star<out Any> = Star<String>()  // #6: ��� ���� ����

    val st6: Star<*> = Star<Any>()           // #7: ��Ÿ ��������
    val st7: Star<*> = Star<Int>()
    val st8: Star<*> = Star<Number>()
    val st9: Star<*> = Star<String>()
}