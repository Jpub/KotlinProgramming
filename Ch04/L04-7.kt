    //---------- #1
    val item1 = listOf("���", "�ٳ���", "Ű��")
    for (item in item1) {
        println(item)
    }

    //---------- #2
    val item2 = listOf("���", "�ٳ���", "Ű��")
    for (index in item2.indices) {
        println("item at $index is ${item2[index]}")
    }

    //---------- #3
    val item3 = arrayOf("���", "�ٳ���", "Ű��")
    for (index in item3.indices) {
        println("item at $index is ${item3[index]}")
    }
