fun main(args: Array<String>) {
    val result = createArray(5, 9)
    printArray(result)
}

fun createArray(row: Int, col: Int): Array<Array<Int>> {
    val newArray = Array(row, { Array(col, { i -> 0 }) })

    var rowValue = 1
    end@ for(x in 0..row - 1) {             // #1
        for(y in 0..col - 1) {              // #2

            if(rowValue >= 40)             // #3
                break@end                  // #4

            newArray[x][y] = rowValue + y

            if((rowValue + y) % 2 != 0)    // #5
                continue                   // #6

            newArray[x][y] *= 10          // #7
        }
        rowValue += 10
    }
    return newArray
}

fun printArray(arr: Array<Array<Int>>) {
    for(x in 0..arr.size - 1) {
        for(y in 0..arr[x].size - 1) {
            print("${arr[x][y]}  ")
        }
        println()
    }
}
