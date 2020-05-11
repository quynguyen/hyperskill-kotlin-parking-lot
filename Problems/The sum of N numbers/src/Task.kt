import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum = 0
    for (i in 1..scanner.nextInt())
        sum += scanner.nextInt()
    println(sum)
}