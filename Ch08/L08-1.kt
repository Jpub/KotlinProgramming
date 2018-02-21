// �������� ������ �Լ�
fun sum1(a:Int, b: Int): Int {
    return a + b
}

// ��Ʋ�� Ư���� ���Թ� ���·� ���ǵ� �Լ�
fun sum2_1(a:Int, b: Int): Int = a + b
fun sum2_2(a:Int, b: Int) = a + b

// �͸� �Լ��� ���ǵ� �Լ� #1(�Լ� Ÿ���� ������)
val sum3_1: (Int, Int) -> Int = fun(x: Int, y: Int): Int { return x + y }
val sum3_2: (Int, Int) -> Int = fun(x, y): Int { return x + y }
val sum3_3: (Int, Int) -> Int = fun(x, y) = x + y

// �͸� �Լ��� ���ǵ� �Լ� #2(�Լ� Ÿ���� ������)
val sum4_1 = fun(x: Int, y: Int): Int { return x + y }
val sum4_2 = fun(x: Int, y: Int) = x + y

// ���ٽ����� ���ǵ� �Լ� #1(�Լ� Ÿ���� ������)
val sum5: (Int, Int) -> Int = {x, y -> x + y}

// ���ٽ����� ���ǵ� �Լ� #2(�Լ� Ÿ���� ������)
val sum6 = {a: Int, b: Int -> a + b}

// ���ٽĿ��� ���� ���� ǥ������ �� �ٿ� �ۼ��� ���� �߰��� �����ݷ�(;)�� �־�� �Ѵ�
// ����, ���ٽĿ� ���� ���� ǥ������ ���� ���� ������ ǥ������ ����� ��ȯ���� �ȴ�
val sum7_1 = {a: Int, b: Int -> println(a + b); a + b}
val sum7_2 = {a: Int, b: Int -> a + b; println(a + b)}

fun main(args: Array<String>) {
    println("�հ�� ${sum1(10, 20)} �Դϴ�")

    println("�հ�� ${sum2_1(10, 20)} �Դϴ�")
    println("�հ�� ${sum2_2(10, 20)} �Դϴ�")

    println("�հ�� ${sum3_1(10, 20)} �Դϴ�")
    println("�հ�� ${sum3_2(10, 20)} �Դϴ�")
    println("�հ�� ${sum3_3(10, 20)} �Դϴ�")

    println("�հ�� ${sum4_1(10, 20)} �Դϴ�")
    println("�հ�� ${sum4_2(10, 20)} �Դϴ�")
    
    println("�հ�� ${sum5(10, 20)} �Դϴ�")

    println("�հ�� ${sum6(10, 20)} �Դϴ�")
    
    println("�հ�� ${sum7_1(10, 20)} �Դϴ�")
    println("�հ�� ${sum7_2(10, 20)} �Դϴ�")
}