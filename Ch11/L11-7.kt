fun <T> printAny (ls: List<T>) = ls.forEach {print("$it ")}      // #1

fun printInt (ls: List<Int>) = ls.forEach {print("$it ")}        // #2

fun printNumber (ls: List<Number>) = ls.forEach {print("$it ")}  // #3

fun main(args: Array<String>) {
    val lt1 = listOf<Int>(1, 2)         // #4
    val lt2 = listOf<Int?>(1, 2)
    val lt3: List<Double> = listOf(1.0, 2.0)
    val lt4: List<Double?> = listOf(1.0, 2.0)
    val lt5 = listOf<String>("1", "2")
    val lt6 = listOf<String?>("1", "2")

    println("\n ${printAny(lt1)}")     // #5
    println("\n ${printAny(lt2)}")  
    println("\n ${printAny(lt3)}")  
    println("\n ${printAny(lt4)}")  
    println("\n ${printAny(lt5)}")  
    println("\n ${printAny(lt6)}")  

    println("\n ${printInt(lt1)}")     // #6
    println("\n ${printInt(lt2)}")     //    ������ ����: Ÿ�� ����ġ
    println("\n ${printInt(lt3)}")     //    ������ ����: Ÿ�� ����ġ
    println("\n ${printInt(lt4)}")     //    ������ ����: Ÿ�� ����ġ
    println("\n ${printInt(lt5)}")     //    ������ ����: Ÿ�� ����ġ
    println("\n ${printInt(lt6)}")     //    ������ ����: Ÿ�� ����ġ

    println("\n ${printNumber(lt1)}")  // #7
    println("\n ${printNumber(lt2)}")  // ������ ����: Ÿ�� ����ġ
    println("\n ${printNumber(lt3)}")  
    println("\n ${printNumber(lt4)}")  // ������ ����: Ÿ�� ����ġ
    println("\n ${printNumber(lt5)}")  // ������ ����: Ÿ�� ����ġ
    println("\n ${printNumber(lt6)}")  // ������ ����: Ÿ�� ����ġ
}
