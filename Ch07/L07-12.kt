// ��Ʋ���� Ŭ���� ������ �̿��� ���� ����
fun main(args: Array<String>) {
    val r = Rectangle()
    val c = Circle()
    Window(r).draw()
    Window(r).fill()
    Window(c).draw()
    Window(c).fill()
}

interface Figure {
    fun draw()
    fun fill()
}

class Rectangle() : Figure {
    override fun draw() {
        println("Draw rectangle")
    }
    override fun fill() {
        println("Fill rectangle")
    }
}

class Circle() : Figure {
    override fun draw() {
        println("Draw circle")
    }
    override fun fill() {
        println("Fill Circle")
    }
}

class Window(val figure: Figure) : Figure by figure {}