package snorochevskiy.codility.lessons.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class FrogRiverOneTest {

    private FrogRiverOne sut = new FrogRiverOne();

    @Test
    public void testSimple() {
        Assert.assertEquals(6, sut.solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4} ));
    }
}
