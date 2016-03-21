package snorochevskiy.codility.lessons.lesson4;


public class MaxCounters {

    public int[] solution(int N, int[] A) {

        int[] counters = new int[N];

        int maxCounterIndex = 0;
        int upperBound = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {

                if (counters[A[i] - 1] < upperBound) {
                    counters[A[i] - 1] = upperBound + 1;
                } else {
                    counters[A[i] - 1]++;
                }

                if (counters[A[i] - 1] > counters[maxCounterIndex]) {
                    maxCounterIndex = A[i] - 1;
                }

            } else if (A[i] > N) {
                upperBound = counters[maxCounterIndex];
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < upperBound) {
                counters[i] = upperBound;
            }
        }

        return counters;
    }
}
