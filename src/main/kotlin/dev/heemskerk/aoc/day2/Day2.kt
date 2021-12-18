package dev.heemskerk.aoc.day2

class Day2 {
    fun solve(input: List<String>) = input.map { it.split(" ") }.run {
        sumOfInstruction("forward") * (sumOfInstruction("down") - sumOfInstruction("up"))
    }
}

fun List<List<String>>.sumOfInstruction(instruction: String) = filter { it[0] == instruction }.sumOf { it[1].toInt() }