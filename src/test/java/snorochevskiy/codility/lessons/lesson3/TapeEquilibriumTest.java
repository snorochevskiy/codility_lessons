package snorochevskiy.codility.lessons.lesson3;

import org.junit.Assert;
import org.junit.Test;

public class TapeEquilibriumTest {

    private TapeEquilibrium sut = new TapeEquilibrium();

    @Test
    public void testSimple() {
        Assert.assertEquals(1, sut.solution(new int[] {3, 1, 2, 4, 3}));
    }

    @Test
    public void testOneElement() {
        Assert.assertEquals(0, sut.solution(new int[] {1}));
    }

    @Test
    public void testTwoElements() {
        Assert.assertEquals(1, sut.solution(new int[] {1, 2}));
    }

    @Test
    public void testTwoSameElements() {
        Assert.assertEquals(0, sut.solution(new int[] {5, 5}));
    }

    @Test
    public void test10Elements() {
        Assert.assertEquals(1, sut.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void testWithNegativeElements() {
        Assert.assertEquals(1, sut.solution(new int[] {1, -2, 3, 4, 5, 6, -9, 8, 9, 10}));
    }
}
