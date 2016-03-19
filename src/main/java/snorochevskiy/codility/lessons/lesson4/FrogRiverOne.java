package snorochevskiy.codility.lessons.lesson4;

public class FrogRiverOne {

    public int solution(int X, int[] A) {

        // Path: indexes - positions, values - time when leaf falls to this position
        int[] path = new int[X];

        // Fill path
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X && (path[A[i] - 1] == 0) ) {
                // Increment time value to differ it from uninitialized elements
                path[A[i] - 1] = i + 1;
            }
        }

        // Calculate time
        int maxSecond = path[0];
        for (int i=0; i<path.length; i++){

            // Means element of path is not covered with leaf
            if (path[i] == 0) {
                return -1;
            }

            if (path[i] > maxSecond) {
                maxSecond = path[i];
            }
        }

        // Decrement time to get actual value
        return maxSecond - 1;
    }
}
