package snorochevskiy.codility.lessons.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class MaxCountersTest {

    private MaxCounters sut = new MaxCounters();

    @Test
    public void testSimple() {
        Assert.assertArrayEquals(new int[] {3, 2, 2, 4, 2}, sut.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4} ));
    }

    @Test
    public void testOneCounter() {
        Assert.assertArrayEquals(new int[] {1}, sut.solution(1, new int[] {3, 4, 4, 6, 1, 4, 4} ));
    }
}
