package snorochevskiy.codility.lessons.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class CountDivTest {

    private CountDiv sut = new CountDiv();

    @Test
    public void testSimple() {
        Assert.assertEquals(3, sut.solution(6, 11, 2));
    }
}
