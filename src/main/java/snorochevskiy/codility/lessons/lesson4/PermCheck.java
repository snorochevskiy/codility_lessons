package snorochevskiy.codility.lessons.lesson4;

public class PermCheck {

    public int solution(int[] A) {

        // Create sorted version of array
        int[] sorted = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 1 || A[i] > A.length) {
                return 0;
            }
            sorted[A[i] - 1] = A[i];
        }

        // Search for gap
        for (int i =0; i < sorted.length; i++) {
            if (sorted[i] == 0 ) {
                return 0;
            }
        }
        return 1;
    }
}
