package dev.heemskerk.aoc.day3

import org.junit.Test
import kotlin.test.assertEquals

class Day3Test {
    private val day = Day3()

    @Test
    fun example() {
        assertEquals(
            expected = 198,
            day.solve(listOf(
                "00100",
                "11110",
                "10110",
                "10111",
                "10101",
                "01111",
                "00111",
                "11100",
                "10000",
                "11001",
                "00010",
                "01010",
            ))
        )
    }
}