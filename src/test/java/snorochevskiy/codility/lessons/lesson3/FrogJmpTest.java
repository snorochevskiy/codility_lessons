package snorochevskiy.codility.lessons.lesson3;

import org.junit.Assert;
import org.junit.Test;

public class FrogJmpTest {

    private FrogJmp sut = new FrogJmp();

    @Test
    public void simpleTest() {
        Assert.assertEquals(3, sut.solution(10, 85, 30));
    }
}
