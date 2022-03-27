fun main() {

    var a: Int = 10000
    var b: Int = 10000
    println("a === b: ${a === b}") //Identity를 확인
    println("a == b: ${a == b}")
}

// 상기 main을 JAVA로 decompile 코드
//import kotlin.Metadata;
//
//@Metadata(
//    mv = {1, 6, 0},
//    k = 2,
//    d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
//    d2 = {"main", "", "Test"}
//)
//public final class Test_prmtvKt {
//    public static final void main() {
//        int a = true;
//        int b = true;
//        String var2 = "a === b: " + true;
//        System.out.println(var2);
//        var2 = "a == b: " + true;
//        System.out.println(var2);
//    }
//
//    // $FF: synthetic method
//    public static void main(String[] var0) {
//        main();
//    }
//}
