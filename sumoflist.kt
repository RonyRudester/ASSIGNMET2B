fun sumOfList(numbers: List<Int>): Int {
    return numbers.sum()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = sumOfList(numbers)
    println("The sum of the list is: $sum")
}
