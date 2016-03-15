package snorochevskiy.codility.lessons.lesson2;

public class OddOccurrencesInArray {

    /**
     * Return value of an element that does not have a pair (element with same value).
     *
     * @param A array with odd number of elements. Array should have all elements with a pair (same value), except one element.
     * @return value of an element without pair
     */
    public int solution(int[] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }

        return result;
    }
}
