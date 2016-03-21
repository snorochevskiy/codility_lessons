package snorochevskiy.codility.lessons.lesson4;


import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerTest {

    private MissingInteger sut = new MissingInteger();

    @Test
    public void testSimple() {
        Assert.assertEquals(5, sut.solution(new int[] {1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void testSingleElement() {
        Assert.assertEquals(2, sut.solution(new int[] {1}));
    }
}
