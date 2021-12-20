package dev.heemskerk.aoc.day2

class Day2 {
    fun solve(input: List<String>): Int {
        return input.map { it.split(" ") }.map {
            Pair(
                Input(it[0], it[1].toInt()),
                Output(0, 0, 0),
            )
        }.fold(
            Pair(
                Input("", 0),
                Output(0, 0, 0),
            )
        ) { accumulator, element ->
            Pair(
                Input(element.first.instruction, element.first.unit),
                Output(
                    Submarine(accumulator, element).position(),
                    Submarine(accumulator, element).aim(),
                    Submarine(accumulator, element).depth(),
                )
            )
        }.run { second.position * second.depth }
    }

    private fun Submarine.position() = when (this.element.first.instruction) {
        "forward" -> this.accumulator.second.position + this.element.first.unit
        else -> this.accumulator.second.position
    }

    private fun Submarine.aim() = when (this.element.first.instruction) {
        "down" -> this.accumulator.second.aim + this.element.first.unit
        "up" -> this.accumulator.second.aim - this.element.first.unit
        else -> this.accumulator.second.aim
    }

    private fun Submarine.depth() = when (this.element.first.instruction) {
        "forward" -> this.accumulator.second.depth + (this.element.first.unit * this.aim())
        else -> this.accumulator.second.depth
    }

    data class Input(
        val instruction: String,
        val unit: Int,
    )

    data class Output(
        val position: Int,
        val aim: Int,
        val depth: Int,
    )

    data class Submarine(
        val accumulator: Pair<Input, Output>,
        val element: Pair<Input, Output>,
    )
}