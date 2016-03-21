package snorochevskiy.codility.lessons.lesson4;

public class MissingInteger {

    public int solution(int[] A) {

        // Sort input array
        int[] sorted = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= A.length) {
                sorted[A[i] - 1] = A[i];
            }
        }

        // Find gap
        for (int i=0; i < sorted.length; i++) {
            if (sorted[i] == 0) {
                return i+1;
            }
        }

        return A.length + 1;
    }

}
