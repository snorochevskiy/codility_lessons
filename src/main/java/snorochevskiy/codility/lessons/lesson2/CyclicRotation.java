package snorochevskiy.codility.lessons.lesson2;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {

        if (A == null || A.length == 0) {
            return A;
        }

        int shift = K % A.length;

        int[] buffer = new int[shift];

        // copy last elements to buffer
        for (int i = A.length - shift, j = 0; i < A.length; i++, j++) {
            buffer[j] = A[i];
        }

        // shifting elements
        for (int i = A.length - (shift + 1); i>=0; i--) {
            A[i + shift] = A[i];
        }

        // add element from buffer to start of array
        for (int i = 0; i < shift; i++) {
            A[i] = buffer[i];
        }

        return A;
    }
}
