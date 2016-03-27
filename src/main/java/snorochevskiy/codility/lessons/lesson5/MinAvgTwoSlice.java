package snorochevskiy.codility.lessons.lesson5;

public class MinAvgTwoSlice {

    public int solution(int[] A) {

        if (A.length == 1) {
            return 0;
        }

        int minIndex = 0;

        // As we know that min slice should contain 2 or 3 elements,
        // to find slice with minimum average value, we'll
        // use (A[i]+A[i+1])*3 and (A[i]+A[i+1]+A[i+2])*2 instead of
        // (A[i]+A[i+1])/2 and (A[i]+A[i+1]+A[i+3])/3 because it's faster
        int minValue = (A[0] + A[1]) * 3;

        for (int i = 1; i < A.length - 1; i++) {
            int currentValue = (A[i] + A[i + 1]) * 3;
            if (currentValue < minValue) {
                minValue = currentValue;
                minIndex = i;
            }
        }

        if (A.length == 2) {
            return minIndex;
        }

        for (int i = 0; i < A.length - 2; i++) {
            int currentValue = (A[i] + A[i + 1] + A[i + 2]) * 2;
            if (currentValue < minValue) {
                minValue = currentValue;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
