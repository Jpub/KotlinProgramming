// 전형적인 형태의 함수
fun sum1(a:Int, b: Int): Int {
    return a + b
}

// 코틀린 특유의 대입문 형태로 정의된 함수
fun sum2_1(a:Int, b: Int): Int = a + b
fun sum2_2(a:Int, b: Int) = a + b

// 익명 함수로 정의된 함수 #1(함수 타입이 지정됨)
val sum3_1: (Int, Int) -> Int = fun(x: Int, y: Int): Int { return x + y }
val sum3_2: (Int, Int) -> Int = fun(x, y): Int { return x + y }
val sum3_3: (Int, Int) -> Int = fun(x, y) = x + y

// 익명 함수로 정의된 함수 #2(함수 타입이 생략됨)
val sum4_1 = fun(x: Int, y: Int): Int { return x + y }
val sum4_2 = fun(x: Int, y: Int) = x + y

// 람다식으로 정의된 함수 #1(함수 타입이 지정됨)
val sum5: (Int, Int) -> Int = {x, y -> x + y}

// 람다식으로 정의된 함수 #2(함수 타입이 생략됨)
val sum6 = {a: Int, b: Int -> a + b}

// 람다식에서 여러 개의 표현식을 한 줄에 작성할 때는 중간에 세미콜론(;)을 넣어야 한다
// 또한, 람다식에 여러 개의 표현식이 있을 때는 마지막 표현식의 결과가 반환값이 된다
val sum7_1 = {a: Int, b: Int -> println(a + b); a + b}
val sum7_2 = {a: Int, b: Int -> a + b; println(a + b)}

fun main(args: Array<String>) {
    println("합계는 ${sum1(10, 20)} 입니다")

    println("합계는 ${sum2_1(10, 20)} 입니다")
    println("합계는 ${sum2_2(10, 20)} 입니다")

    println("합계는 ${sum3_1(10, 20)} 입니다")
    println("합계는 ${sum3_2(10, 20)} 입니다")
    println("합계는 ${sum3_3(10, 20)} 입니다")

    println("합계는 ${sum4_1(10, 20)} 입니다")
    println("합계는 ${sum4_2(10, 20)} 입니다")
    
    println("합계는 ${sum5(10, 20)} 입니다")

    println("합계는 ${sum6(10, 20)} 입니다")
    
    println("합계는 ${sum7_1(10, 20)} 입니다")
    println("합계는 ${sum7_2(10, 20)} 입니다")
}