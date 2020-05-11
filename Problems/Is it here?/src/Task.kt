import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = IntArray(scanner.nextInt())
    for (i in 0..a.lastIndex) a[i] = scanner.nextInt()
    if (a.contains(scanner.nextInt())) {
        "YES"
    } else {
        "NO"
    }.let { print(it) }
}