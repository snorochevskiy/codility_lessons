package snorochevskiy.codility.lessons.lesson1;

import org.junit.Assert;
import org.junit.Test;

public class BinaryGapTest {

    BinaryGap sut = new BinaryGap();

    @Test
    public void simpleTest() {
        Assert.assertEquals(5, sut.solution(1041));
    }

    @Test
    public void testAllOnes() {
        Assert.assertEquals(0, sut.solution(Integer.MIN_VALUE));
    }

    @Test
    public void testAllZeros() {
        Assert.assertEquals(0, sut.solution(0));
    }

    @Test
    public void testNoSurroundedZeros() {
        // 6 binary representation is 00000000 00000000 00000000 00000110
        Assert.assertEquals(0, sut.solution(6));
    }
}
