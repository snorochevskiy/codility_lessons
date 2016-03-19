package snorochevskiy.codility.lessons.lesson3;

public class PermMissingElem {

    public int solution(int[] A) {

        // sort
        for (int i = 0; i < A.length; i++) {
            // repositioning, until A[i] contains i+1 value
            while (A[i] - 1 != i && A[i] - 1 != A.length) {
                int tmp = A[A[i] - 1];
                A[A[i] - 1] = A[i];
                A[i] = tmp;
            }
        }

        // Search for absent element
        int prev = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] - prev > 1) {
                return prev + 1;
            }
            prev = A[i];
        }

        // Last element is absent
        return A.length + 1;
    }

}
