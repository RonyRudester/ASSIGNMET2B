fun isPalindrome(str: String): Boolean {
    val cleanedStr = str.replace(Regex("[^A-Za-z0-9]"), "").toLowerCase()
    return cleanedStr == cleanedStr.reversed()
}

fun main() {
    val testString1 = "A man, a plan, a canal, Panama"
    val testString2 = "Hello, World!"

    println("\"$testString1\" is a palindrome: ${isPalindrome(testString1)}")
    println("\"$testString2\" is a palindrome: ${isPalindrome(testString2)}")
}
