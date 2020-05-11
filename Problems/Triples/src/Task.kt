import java.util.*

const val RUN_LENGTH = 2

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    var totalRuns = 0
    var currRun = 0
    var prev = scanner.nextInt()
    for (i in 1 until size) {
        val curr = scanner.nextInt()
        if (curr - prev == 1) {
            currRun++
            if (currRun == RUN_LENGTH) {
                totalRuns++
                currRun--
            }
        } else {
            currRun = 0
        }
        prev = curr
    }
    println(totalRuns)
}