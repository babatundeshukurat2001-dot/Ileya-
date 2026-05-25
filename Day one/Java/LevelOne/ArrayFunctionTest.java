import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayFunctionTest {

    @Test
    void testSplitOddEven() {
        int[] input = {45, 60, 3, 10, 9, 22};
        int[][] actual = ArrayFunction.splitOddEven(input);

        int[] expectedOdd = {45, 3, 9};
        int[] expectedEven = {60, 10, 22};

        assertArrayEquals(expectedOdd, actual[0]);
        assertArrayEquals(expectedEven, actual[1]); 
    }

    @Test
    void testCheckPalindrome() {
        int[] input = {45, 0, 8, 0, 45};
        boolean actual = ArrayFunction.checkPalindrome(input);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void testFindPerfectSquares() {
        int[] input = {4, 7, 9, 10, 16, 18};
        int[] actual = ArrayFunction.findPerfectSquares(input);
        int[] expected = {4, 9, 16};

        assertArrayEquals(expected, actual);
    }

    @Test
    void testReplaceNonPerfectSquares() {
        int[] input = {4, 7, 9, 10, 49, 6};
        int[] actual = ArrayFunction.replaceNonPerfectSquares(input);
        int[] expected = {4, -1, 9, -1, 49, -1};

        assertArrayEquals(expected, actual);
    }

    @Test
    void testIsPerfectSquareHelper() {
        assertTrue(ArrayFunction.isPerfectSquare(4));
       assertTrue(ArrayFunction.isPerfectSquare(0));
        assertFalse(ArrayFunction.isPerfectSquare(7));
        assertFalse(ArrayFunction.isPerfectSquare(-4));
    }
}
