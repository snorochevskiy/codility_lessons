package snorochevskiy.codility.lessons.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class PermCheckTest {

    private PermCheck sut = new PermCheck();

    @Test
    public void testSimple() {
        Assert.assertEquals(1, sut.solution(new int[] {4, 1, 3, 2}));
    }

    @Test
    public void testOneElementArray() {
        Assert.assertEquals(1, sut.solution(new int[] {1}));
    }

    @Test
    public void testNoPermArray() {
        Assert.assertEquals(0, sut.solution(new int[] {4, 1, 3}));
    }
}
