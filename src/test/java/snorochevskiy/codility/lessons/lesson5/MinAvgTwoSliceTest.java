package snorochevskiy.codility.lessons.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class MinAvgTwoSliceTest {

    private MinAvgTwoSlice sut = new MinAvgTwoSlice();

    @Test
    public void testSimple() {
        Assert.assertEquals(1, sut.solution(new int[] {4, 2, 2, 5, 1, 5, 8}));
    }

    @Test
    public void test1() {
        Assert.assertEquals(5, sut.solution(new int[] {4, 5, 7, 1, 9, 1, 4, 5, 4, 7}));
    }
}
