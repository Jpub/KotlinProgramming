fun main(args: Array<String>) {
	pro1 += pro2   // #1
	println(pro1)  // #2

	val f1 = MyFriend("홍길동", "010-123-4567", 3) // #3
	f1.type = 2   // #4
	println("${f1.name}, ${f1.tel}, ${f1.type}")   // #5
}

var pro1 = 100    // #6
val pro2 = 200    // #7

class MyFriend (var name: String, var tel: String, var type: Int) // #8
{
	init {
		this.type = if(type < 4) type else 4 // 1: "학교", 2: "회사" 3: "SNS" 4: "기타"
	}
}