package dev.heemskerk.aoc.day1

class Day1 {
    fun solve(input: List<Int>) = input.windowed(size = 3).map { it.sum() }.windowed(size = 2).count { (a, b) -> a < b }
}