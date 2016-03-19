package snorochevskiy.codility.lessons.lesson3;

public class PermMissingElem {

    public int solution(int[] A) {

        // sort
        int lInd;
        for (int i = 0; i < A.length; i++) {
            lInd = i;
            // repositioning
            while (A[lInd] - 1 != lInd && A[lInd] - 1 != A.length) {
                int rInd = A[lInd] - 1;
                int tmp = A[rInd];
                A[rInd] = A[lInd];
                A[lInd] = tmp;
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
