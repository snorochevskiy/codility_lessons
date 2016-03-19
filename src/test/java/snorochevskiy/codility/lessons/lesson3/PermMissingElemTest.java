package snorochevskiy.codility.lessons.lesson3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class PermMissingElemTest {

    private PermMissingElem sut = new PermMissingElem();

    @Test
    public void testSimple() {
        Assert.assertEquals(4, sut.solution(new int[] {2, 3, 1, 5}));
    }

    @Test
    public void testFirst() {
        Assert.assertEquals(1, sut.solution(new int[] {2, 3, 5, 4}));
    }

    @Test
    public void testLast() {
        Assert.assertEquals(5, sut.solution(new int[] {2, 3, 1, 4}));
    }

    @Test
    public void tesе13ElementsArray() {
        Assert.assertEquals(10, sut.solution(new int[] {2, 3, 1, 4, 7, 5, 6, 11, 14, 8, 12, 9, 13}));
    }

    @Test
    public void test20ElementsArray() {
        int[] arr = new int[] {15, 13, 9, 20, 7, 17, 11, 19, 14, 10, 2, 5, 12, 3, 8, 16, 6, 4, 18, 1};
        Assert.assertEquals(21, sut.solution(arr));
    }

    @Test
    public void testTwoElements() {
        Assert.assertEquals(2, sut.solution(new int[] {1, 3}));
    }

    @Test
    public void testOneElement() {
        Assert.assertEquals(2, sut.solution(new int[] {1}));
    }

    @Test
    public void testNineElement() {
        Assert.assertEquals(7, sut.solution(new int[] {1, 2, 3, 4, 5, 6, 8, 9}));
    }

    @Test
    public void testReverseElement() {
        Assert.assertEquals(11, sut.solution(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }

    @Test
    public void testHugeArray() {

        int[] array = generateOrderedArray(1000, 456);

        reorder(array);

        Assert.assertEquals(456, sut.solution(array));
    }

    private int[] generateOrderedArray(int numberOfElements, int absentElement) {
        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements + 1; i++) {
            if (i < absentElement - 1) {
                array[i]=i + 1;
            } else if (i > absentElement - 1) {
                array[i-1]=i+1;
            }
        }
        return array;
    }

    private void reorder(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length * 10; i++) {
            int ind1 = rand.nextInt(arr.length);
            int ind2 = rand.nextInt(arr.length);
            int tmp = arr[ind2];
            arr[ind2] = arr[ind1];
            arr[ind1] = tmp;
        }
    }

}
