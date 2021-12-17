package dev.heemskerk.aoc.day1

import org.junit.Test
import kotlin.test.assertEquals

class SweepReportAnalyzerTest {
    private val analyzer = SweepReportAnalyzer()

    @Test
    fun `When there is only a single measurement the result should not increment`() {
        assertEquals(
            expected = 5,
            analyzer.analyse(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263))
        )
    }
}