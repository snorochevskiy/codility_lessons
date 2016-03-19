package snorochevskiy.codility.lessons.lesson3;

public class TapeEquilibrium {
    public int solution(int[] A) {

        if (A.length == 1) {
            return 0;
        }
        // find sum of all elements
        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        // find equilibrium point
        long leftSum = A[0];
        long rightSum = sum - leftSum;
        long minDiff = Math.abs(leftSum - rightSum);
        for (int i = 2; i < A.length; i++) {
            leftSum += A[i-1];
            rightSum -= A[i-1];
            long diff = Math.abs(leftSum - rightSum);

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return (int)minDiff;
    }
}
