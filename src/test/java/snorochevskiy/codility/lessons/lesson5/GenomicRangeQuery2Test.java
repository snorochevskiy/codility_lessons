package snorochevskiy.codility.lessons.lesson5;


import org.junit.Assert;
import org.junit.Test;

public class GenomicRangeQuery2Test {


    private GenomicRangeQuery2 sut = new GenomicRangeQuery2();

    @Test
    public void testSimple() {
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] expected = {2, 4, 1};

        Assert.assertArrayEquals(expected, sut.solution("CAGCCTA", P, Q));
    }
}
