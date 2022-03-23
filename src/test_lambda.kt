fun main() {
    val fruits = listOf("avoid", "apple", "banana", "kiwi")
    fruits
        .filter{it.startsWith("a")}
        .sortedBy{it}
        .map{it.toUpperCase()}
        .forEach{println(it)}
}