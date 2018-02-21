fun main(args: Array<String>) {
	val result = createArray(5, 5)
	printArray(result)
}

fun createArray(row: Int, col: Int): Array<Array<Int>> {
	val newArray = Array(row, { Array(col, { i -> 0 }) })

	var rowValue = 1
	for(x in 0..row - 1) {
		for(y in 0..col - 1) {
			newArray[x][y] = rowValue + y
		}
		rowValue += 10
	}
	return newArray
}

fun printArray(arr: Array<Array<Int>>) {
	for(x in 0..arr.size - 1) {
		for(y in 0..arr[x].size - 1) {
			print("${arr[x][y]} ")
		}
		println()
	}
}