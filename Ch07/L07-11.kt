// 클래스 상속과 다형성을 이용한 위임 구현
fun main(args: Array<String>) {
    val r = Rectangle()     // #1
    val c = Circle()        // #2
    Window(r).drawFigure() // #3
    Window(r).fillFigure() // #4
    Window(c).drawFigure() // #5
    Window(c).fillFigure() // #6
}

abstract class Figure() {  // #7
    abstract fun draw()
    abstract fun fill()
}

class Rectangle() : Figure() { // #8
    override fun draw() {
        println("Draw rectangle")
    }

    override fun fill() {
        println("Fill rectangle")
    }
}

class Circle() : Figure() { // #9
    override fun draw() {
        println("Draw circle")
    }

    override fun fill() {
        println("Fill Circle")
    }
}

class Window(val figure: Figure) { // #10
    fun drawFigure() {
        figure.draw()
    }

    fun fillFigure() {
        figure.fill()
    }
}