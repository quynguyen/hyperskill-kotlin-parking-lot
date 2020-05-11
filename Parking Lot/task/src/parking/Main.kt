package parking

import java.lang.System.`in`
import java.util.*

fun main() {
    val scanner = Scanner(`in`)

    data class Car(val id: String, val colour: String)

    var spots: Array<Car?>? = null
    fun findEmptySpot(): Int = spots?.withIndex()?.find { it.value == null }?.index ?: -1
    while (true) {
        val cmd = scanner.nextLine().split(" ")
        if (cmd[0].toLowerCase() == "exit") {
            return
        }
        if (cmd[0].toLowerCase() == "create") {
            val size = cmd[1].toInt()
            spots = Array<Car?>(size) { _ -> null }
            println("Created a parking lot with $size spots.")
        }
        if (spots == null) {
            println("Sorry, a parking lot has not been created.")
            continue
        }
        if (cmd[0].toLowerCase() == "status") {
            val cars = spots.withIndex().filter { it.value != null } as List<IndexedValue<Car>>
            if (cars.isEmpty()) {
                println("Parking lot is empty.")
            } else {
                cars.forEach {
                    println("${it.index + 1} ${it.value.id} ${it.value.colour}")
                }
            }
        }
        if (cmd[0].toLowerCase() == "park") {
            val car = Car(cmd[1], cmd[2])
            val spot = findEmptySpot()
            if (spot > -1) {
                spots[spot] = car
                println("${car.colour} car parked in spot ${spot + 1}.")
            } else {
                println("Sorry, the parking lot is full.")
            }
        } else if (cmd[0].toLowerCase() == "leave") {
            val spot = cmd[1].toInt() - 1
            if (spot in 0..spots.lastIndex) {
                if (spots[spot] != null) {
                    spots[spot] = null
                    println("Spot ${spot + 1} is free.")
                } else {
                    println("There is no car in spot ${spot + 1}.")
                }
            }
        }
    }
}
