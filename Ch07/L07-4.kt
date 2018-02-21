fun main(args: Array<String>) {
    val c1 = Child("검정", "검정", "기타")  // #1
    c1.printHairColor()                     // #2

    c1.changeHairColor("파랑")              // #3
    c1.printHairColor()                     // #4

    c1.changeHairColorSuper("노랑")         // #5
    c1.printHairColorSuper()                // #6
}

open class Father(open var hairColor: String, open var eyeColor: String) {  // #7
    open fun changeHairColor(hairColor: String) {                           // #8
        this.hairColor = hairColor
    }
}

class Child : Father {
    override var hairColor: String  // #9
    override var eyeColor: String   // #10
    var others: String              // #11

    constructor(hairColor: String, eyeColor: String, others: String):
                                                super(hairColor, eyeColor) {  // #12
        this.hairColor = hairColor
        this.eyeColor = eyeColor
        this.others = others
    }

    override fun changeHairColor(hairColor: String) {  // #13
        this.hairColor = hairColor
    }

    fun printHairColor() {  // #14
        println("Child 모발색은 ${this.hairColor} 입니다")
    }

    fun changeHairColorSuper(hairColor: String) {  // #15
        super.hairColor = hairColor
        super.changeHairColor(hairColor)
    }

    fun printHairColorSuper() {  // #16
        println("Father 모발색은 ${super.hairColor} 입니다")
    }
}