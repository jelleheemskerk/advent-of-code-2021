package dev.heemskerk.aoc.day1

import org.junit.Test
import kotlin.test.assertEquals

class Day1Test {
    private val day = Day1()

    @Test
    fun example() {
        assertEquals(
            expected = 5,
            day.solve(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263))
        )
    }
}