fun main(args: Array<String>) {
	printCount(1, 100)
	println("�հ� = $count")
}

var count = 0

fun printCount(from: Int, to: Int) {
	for(i in from..to) { count += i }
}

val TAB1 = "\t"
const val TAB2 = "\t"