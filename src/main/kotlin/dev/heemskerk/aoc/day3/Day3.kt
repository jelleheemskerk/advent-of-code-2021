package dev.heemskerk.aoc.day3

class Day3 {
    fun solve(input: List<String>): Int {
        return input.map {
            it.windowed(1) { character -> character.toString().toInt() }
        }.reduce { accumulator, element ->
            accumulator.zip(element) { a, b -> a + b }
        }.map {
            if (it > input.size / 2) 1 else 0
        }.let {
            it.joinBinaryListToDecimal() * it.map { int -> int.xor(1) }.joinBinaryListToDecimal()
        }
    }

    private fun List<Int>.joinBinaryListToDecimal() = this.joinToString(separator = "").toInt(2)
}