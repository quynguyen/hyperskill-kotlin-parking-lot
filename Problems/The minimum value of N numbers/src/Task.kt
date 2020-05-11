import java.util.*
import kotlin.math.min

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.nextInt().downTo(1).fold(Int.MAX_VALUE, { a, b ->
        min(a, scanner.nextInt())
    }).let { print(it) }
}