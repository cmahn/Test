//fun main() {
//    var x:Any = 1
//    when(x) {
//        Integer.parseInt(x.toString()) -> print("x is encodes x")
//        1 + 3 -> println("4")
//        else -> println("s does not encode x")
//    }
//
//
//    var k = when(x) {
//        is String -> x.startsWith("prefix")
//        else -> false
//    }
//    println(k)
//
//
////    when {
////        x.isOdd() -> print("x is odd") //홀수체크, isOdd함수 별도 구현
////        x.isEven() -> print("x is even") //짝수
////        else -> print("x is funny")
////    }
//    var coll = listOf(1,2,3)
//    coll.iterator() // 확인
//    for (item in coll)
//        println(item)
//
//    var arry = arrayOf(1,2,3)
//    arry.iterator()
//    for (i in arry){
//        println("$i: $arry[i]")
//    }
//
//}
//================================================================
//fun main(args: Array<String>){
//    val myData = Mydata()
//    myData.iterator()
//    for (item in myData){
//        print(item)
//    }
//}
//
//// 아래 조건을 만족하면 iterator로 사용가능
//class MyIterator {
//    val data = listOf(1,2,3)
//    var idx = 0
//    operator fun hasNext(): Boolean {
//        return data.size > idx
//    }
//    operator fun next(): Int {
//        return data[idx++]
//    }
//}
//
//class Mydata {
//    operator fun iterator():MyIterator {
//        return MyIterator()
//    }
//}

fun main() {
    var arr = arrayOf("가","나","다")
    for ( i in arr.indices){
        println("$i: ${arr[i]}")
    }

    var array = arrayOf("가","나","다")
    for ( (index, value) in array.withIndex()){
        println("$index: ${value}")
    }
}