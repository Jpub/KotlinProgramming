fun main(args: Array<String>) {
    var x = 100

    if(x == 100) // #1
        println("x = $x")

    if(x == 100) { // #2
        ++x
        println("x = $x")
    }

    if(x == 100) // #3
        println("x�� 100")
    else
        println("x�� 100�� �ƴ�")

    if(x < 50) // #4
        println("x�� 50 �̸�")
    else if((x >= 50) and (x < 70)) // #5: else if((x >= 50) && (x < 70))�� ������
        println("x�� 50 ~ 69")
    else if((x >= 70) and (x < 90))
        println("x�� 70 ~ 89")
    else
        println("x�� 90 �̻�")
}