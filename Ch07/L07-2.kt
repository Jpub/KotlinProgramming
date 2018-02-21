fun main(args: Array<String>) {
    val f1 = MyFriend() // #1
    println("${f1.name}, ${f1.tel}, ${f1.type}") // #2

    f1.name = "ȫ�浿" // #3
    f1.tel = "010-123-4567" // #4
    f1.type = 2 // #5
    println("${f1.name}, ${f1.tel}, ${f1.type}") // #6
}

class MyFriend {
    var name: String = "??"
        get() {
            println("name �Ӽ��� ���Ͱ� ȣ���")
            if (field != "??") return field
            else return "�̸�����"
        }
        set(value) {
            println("name �Ӽ��� ���Ͱ� ȣ���")
            field = value
        }

    var tel: String = "??"
        get() {
            println("tel �Ӽ��� ���Ͱ� ȣ���")
            if (field != "??") return field
            else return "��ȭ��ȣ����"
        }
    set(value) {
        println("tel �Ӽ��� ���Ͱ� ȣ���")
        field = value
    }

    var type: Int = 4 // 1: "�б�", 2: "ȸ��" 3: "SNS" 4: "��Ÿ"
        get() {
            println("type �Ӽ��� ���Ͱ� ȣ���")
            return field
        }
        set(value: Int) {
            println("type �Ӽ��� ���Ͱ� ȣ���")
            if(value < 4) field = value
            else field = 4
        }
}