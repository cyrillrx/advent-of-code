import com.cyrillrx.adventofcode.Day02
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Day02Test {
    private val report1 = Day02.Report(listOf(7, 6, 4, 2, 1))
    private val report2 = Day02.Report(listOf(1, 2, 7, 8, 9))
    private val report3 = Day02.Report(listOf(9, 7, 6, 2, 1))
    private val report4 = Day02.Report(listOf(1, 3, 2, 4, 5))
    private val report5 = Day02.Report(listOf(8, 6, 4, 4, 1))
    private val report6 = Day02.Report(listOf(1, 3, 6, 7, 9))
    private val report7 = Day02.Report(listOf(3, 3, 6, 7, 9))
    private val report8 = Day02.Report(listOf(1, 3, 6, 7, 7))

    @Test
    fun testIsSafe() {
        assertTrue(report1.isSafe())
        assertFalse(report2.isSafe())
        assertFalse(report3.isSafe())
        assertFalse(report4.isSafe())
        assertFalse(report5.isSafe())
        assertTrue(report6.isSafe())
        assertFalse(report7.isSafe())
        assertFalse(report8.isSafe())
    }

    @Test
    fun testIsAlmostSafe() {
        assertTrue(report1.isAlmostSafe())
        assertFalse(report2.isAlmostSafe())
        assertFalse(report3.isAlmostSafe())
        assertTrue(report4.isAlmostSafe())
        assertTrue(report5.isAlmostSafe())
        assertTrue(report6.isAlmostSafe())
        assertTrue(report7.isAlmostSafe())
        assertTrue(report8.isAlmostSafe())
    }
}