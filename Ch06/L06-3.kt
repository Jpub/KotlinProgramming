fun main(args: Array<String>) {
	println("�հ� = ${printCount(1, 100)}")
}

fun printCount(from: Int, to: Int): Int {
	var count = 0
	for(i in from..to) { count += i }
	return count
}