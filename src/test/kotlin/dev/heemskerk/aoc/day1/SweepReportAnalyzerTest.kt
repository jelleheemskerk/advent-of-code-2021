package dev.heemskerk.aoc.day1

import org.junit.Test
import kotlin.test.assertEquals

class SweepReportAnalyzerTest {
    private val analyzer = SweepReportAnalyzer()

    @Test
    fun `When there is only a single measurement the result should not increment`() {
        assertEquals(
            expected = 0,
            analyzer.analyse(listOf(1))
        )
    }

    @Test
    fun `When a larger measurement is followed by a smaller one the result should not increment`() {
        assertEquals(
            expected = 0,
            analyzer.analyse(listOf(2, 1))
        )
    }

    @Test
    fun `When measurements are equal the result should not increment`() {
        assertEquals(
            expected = 0,
            analyzer.analyse(listOf(1, 1))
        )
    }

    @Test
    fun `When a smaller measurement is followed by a larger one the result should increment`() {
        assertEquals(
            expected = 1,
            analyzer.analyse(listOf(1, 2))
        )
    }
}