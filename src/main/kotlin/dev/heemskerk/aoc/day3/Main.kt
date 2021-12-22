package dev.heemskerk.aoc.day3

import dev.heemskerk.aoc.PuzzleInput

/**
 * https://adventofcode.com/2021/day/3
 */
fun main() {
    val input = PuzzleInput.get(day = 3).useLines {
        it.toList()
    }

    print("What is the power consumption of the submarine? (Be sure to represent your answer in decimal, not binary.)" +
            "[${Day3().solve(input)}]")
}