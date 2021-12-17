package dev.heemskerk.aoc.day1

class SweepReportAnalyzer {
    fun analyse(report: List<Int>): Int {
        return report.windowed(size = 2, step = 1).count { (a, b) -> a < b }
    }
}