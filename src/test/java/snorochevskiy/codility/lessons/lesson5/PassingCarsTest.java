package snorochevskiy.codility.lessons.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class PassingCarsTest {

    private PassingCars sut = new PassingCars();

    @Test
    public void testSimple() {
        Assert.assertEquals(5, sut.solution(new int[] {0, 1, 0, 1, 1}));
    }

    @Test
    public void testNoElements() {
        Assert.assertEquals(0, sut.solution(new int[] {}));
    }

    @Test
    public void testOneElements() {
        Assert.assertEquals(0, sut.solution(new int[] {1}));
    }
}
