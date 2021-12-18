package dev.heemskerk.aoc.day2

import dev.heemskerk.aoc.PuzzleInput

/**
 * https://adventofcode.com/2021/day/2
 */
fun main() {
    val input = PuzzleInput.get(day = 2).useLines {
        it.toList()
    }

    print("What do you get if you multiply your final horizontal position by your final depth? " +
            "[${Day2().solve(input)}]")
}