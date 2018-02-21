fun main(args: Array<String>) {
    var x = 100

    if(x == 100) // #1
        println("x = $x")

    if(x == 100) { // #2
        ++x
        println("x = $x")
    }

    if(x == 100) // #3
        println("x는 100")
    else
        println("x는 100이 아님")

    if(x < 50) // #4
        println("x는 50 미만")
    else if((x >= 50) and (x < 70)) // #5: else if((x >= 50) && (x < 70))과 동일함
        println("x는 50 ~ 69")
    else if((x >= 70) and (x < 90))
        println("x는 70 ~ 89")
    else
        println("x는 90 이상")
}