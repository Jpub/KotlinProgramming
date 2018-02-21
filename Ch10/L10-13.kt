import kotlin.streams.asStream
import kotlin.streams.toList

fun main(args: Array<String>) {
    val ls1 = listOf(1, 2, 3, 4, 5).asSequence()              // #1
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
    println("\n�÷��� ������: $ls1")                          // #2

    val ls2 = listOf(1, 2, 3, 4, 5).asSequence().asStream()   // #3
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
    println("\n�÷��� ��Ʈ��: $ls2")

    val ar1 = arrayOf(1, 2, 3, 4, 5).asSequence()             // #4
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
    println("\n�迭 ������: $ar1 \n")

    val ar2 = arrayOf(1, 2, 3, 4, 5).asSequence().asStream()  // #5
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
    println("\n�迭 ��Ʈ��: $ar2 \n")

    val ra1 = (1..5).asSequence()                             // #6
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
    println("\n���� ������: $ra1 \n")

    val ra2 = (1..5).asSequence().asStream()                  // #7
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
    println("\n���� ��Ʈ��: $ra2 \n")
}