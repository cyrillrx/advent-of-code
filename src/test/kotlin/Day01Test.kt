import com.cyrillrx.adventofcode.Day01.Companion.getSmallest
import kotlin.test.Test
import kotlin.test.assertEquals

class Day01Test {

    @Test
    fun testGetSmallest() {
        // Given
        val input = listOf(1721, 979, 366, 299, 675, 1456)

        // When
        val result = input.getSmallest()

        // Then
        assertEquals(expected = 299, actual = result)
    }
}