import java.util.*

const val GRAVITY = 9.8

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val densityOfLiquid = scanner.nextDouble()
    val heightOfColumn = scanner.nextDouble()
    println(densityOfLiquid * GRAVITY * heightOfColumn)
}