package snorochevskiy.codility.lessons.lesson2;

import org.junit.Assert;
import org.junit.Test;

public class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray sut = new OddOccurrencesInArray();

    @Test
    public void simpleTest() {
        int[] src = {9, 3, 9, 3, 9, 7, 9};

        Assert.assertEquals(7, sut.solution(src));
    }

    @Test
    public void testOneElementArray() {
        int[] src = {3};

        Assert.assertEquals(3, sut.solution(src));
    }
}
