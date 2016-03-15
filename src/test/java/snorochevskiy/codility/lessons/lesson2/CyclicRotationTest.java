package snorochevskiy.codility.lessons.lesson2;

import org.junit.Assert;
import org.junit.Test;

public class CyclicRotationTest {

    CyclicRotation sut = new CyclicRotation();

    @Test
    public void simpleTest() {
        int[] src = {3, 8, 9, 7, 6};
        int[] expected = {9, 7, 6, 3, 8};
        Assert.assertArrayEquals(expected, sut.solution(src, 3));
    }

    @Test
    public void testWithTooBigShiftFactor() {
        int[] src = {3, 8, 9, 7, 6};
        int[] expected = {9, 7, 6, 3, 8};
        Assert.assertArrayEquals(expected, sut.solution(src, 8));
    }

    @Test
    public void testOneElementShift() {
        int[] src = {1, 2, 3, 4, 5};
        int[] expected = {5, 1, 2, 3, 4};
        Assert.assertArrayEquals(expected, sut.solution(src, 1));
    }

    @Test
    public void testOneElementArray() {
        int[] src = {1};
        int[] expected = {1};
        Assert.assertArrayEquals(expected, sut.solution(src, 1));
    }

    @Test
    public void testEmptyArray() {
        int[] src = {};
        int[] expected = {};
        Assert.assertArrayEquals(expected, sut.solution(src, 5));
    }
}
