fun main() {
    while (true) {
        val word = run {
            print("Enter a word to check if it's a palindrome: ")
            readln().lowercase().toList()
        }

        if (word == word.reversed()) {
            println("${word.joinToString("")} is a palindrome")
        } else {
            println("${word.joinToString("")} is not a palindrome")
        }
    }
}
