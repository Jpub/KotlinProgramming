class Star<T> {}                              // #1

fun main(args: Array<String>) {
    val st1: Star<Any> = Star<Any>()          // #2
    //val st2: Star<Any> = Star<Int>()        // #3 컴파일 에러: 타입 불일치
    //val st3: Star<Any> = Star<Number>()     // #4 컴파일 에러: 타입 불일치
    //val st4: Star<Any> = Star<String>()     // #5 컴파일 에러: 타입 불일치

    val st5: Star<out Any> = Star<String>()  // #6: 사용 지점 변형

    val st6: Star<*> = Star<Any>()           // #7: 스타 프로젝션
    val st7: Star<*> = Star<Int>()
    val st8: Star<*> = Star<Number>()
    val st9: Star<*> = Star<String>()
}