package dev.heemskerk.aoc.day2

import org.junit.Test
import kotlin.test.assertEquals

class Day2Test {
    private val day = Day2()

    @Test
    fun example() {
        assertEquals(
            expected = 900,
            day.solve(listOf(
                "forward 5",
                "down 5",
                "forward 8",
                "up 3",
                "down 8",
                "forward 2",
            ))
        )
    }
}