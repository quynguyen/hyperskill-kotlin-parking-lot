import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.run {
        val (start, finish) = Pair(nextLong(), nextLong())
        start.until(finish).reduce { a, b -> a * b }.let { print(it) }
    }
}