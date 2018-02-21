class InVariance<T> {}         // #1

class CoVariance<out T> {}     // #2

class ContraVariance<in T> {}  // #3

fun main(args: Array<String>) {
    val in1 = InVariance<Int>()              // #4
    //val in2: InVariance<Number> = in1      //  #5 컴파일 에러: 타입 불일치

    val co1 = CoVariance<Int>()              // #6
    val co2: CoVariance<Number> = co1        // #7

    val ct1 = ContraVariance<Int>()          // #8
    //val ct2: ContraVariance<Number> = ct1  // #9 컴파일 에러: 타입 불일치
    val ct3 = ContraVariance<Number>()       // #10
    val ct4: ContraVariance<Int> = ct3       // #11
}
