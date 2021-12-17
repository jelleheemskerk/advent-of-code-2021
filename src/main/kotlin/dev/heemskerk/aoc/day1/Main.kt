package dev.heemskerk.aoc.day1

import dev.heemskerk.aoc.PuzzleInput

/**
 * https://adventofcode.com/2021/day/1
 */
fun main() {
    val sweepReport = PuzzleInput.get(day = 1).useLines { sequence ->
        sequence.toList().map {
            it.toInt()
        }
    }

    print("How many measurements are larger than the previous measurement? " +
            "[${SweepReportAnalyzer().analyse(sweepReport)}]")
}