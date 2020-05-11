import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, c, d) = with(scanner) {
        arrayOf(nextDouble(), nextDouble(), nextDouble(), nextDouble())
    }
    println(a * 10.5 + b * 4.4 + (c + d) / 2.2)
}