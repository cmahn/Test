fun main() {
    println("hello")
    // 특수한 Array
    val x: IntArray = IntArray(3)
    println(x)
    x[0] = 7

//    println(x.get(0))
//    println(x.get(1))
//    println(x[0])
//    println(x.size)

    // 문자열
    var xx:String = "Kotlin"
    println(xx.get(0))
    println(xx[0])
    println(xx.length)

    for(c in xx){
        print(c)
    }
    println()


    val s = "hello, world:\nㅋㅋㅋ"
    println(s)
    val ss = """
        "' 이것은 코틀린의 
        row string 
        입니다'"
        """
    println(ss)
}

