fun main(args: Array<String>) {
    whenUsage(2, 50, "�����")
}

fun whenUsage(inputType: Int, score: Int, city: String) {
	//---------- #1
    when (inputType) {
        1 -> println("Ÿ��-1")
        2, 3 -> println("Ÿ��-2,3")
        else -> {
            println("��Ȯ��")
        }
    }

	//---------- #2
    when (inputType) {
        checkInputType(inputType) -> {
            println("Ÿ�� ����")
        }
        else -> print("Ÿ�� ������")
    }

	//---------- #3
    val start = 0
    val end = 100
    when (score) {
        in start..(end / 4) -> println("�����")
        50 -> println("�����")
        in start..end -> println("������ ����")
        else -> print("������ ���")
    }

	//---------- #4
    val isSeoul = when (city) {
        is String -> city.startsWith("����")
        else -> false
    }
    println(isSeoul)

	//---------- #5
    when {
        city.length == 0 -> println("���ø��� �Է��ϼ���")
        city.substring(0, 2).equals("����") -> println("�����̱���")
        else -> println(city)
    }
}

fun checkInputType(inputType: Int): Int {
    if (inputType >= 1 && inputType < 3) {
        return inputType
    }
    return -1
}