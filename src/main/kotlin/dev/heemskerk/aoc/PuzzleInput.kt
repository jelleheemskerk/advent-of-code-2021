package dev.heemskerk.aoc

import java.io.File

object PuzzleInput {
    fun get(day: Int): File {
        return File("src/main/resources/$day/input")
    }
}