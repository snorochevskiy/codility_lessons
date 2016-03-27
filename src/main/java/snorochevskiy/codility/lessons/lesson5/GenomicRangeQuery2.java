package snorochevskiy.codility.lessons.lesson5;

// Time - O(N+M)
// Pace - O(4N)
public class GenomicRangeQuery2 {

    public int[] solution(String S, int[] P, int[] Q) {

        int[][] counts = new int[4][S.length()];

        for(int i = 0; i < S.length(); i++) {
            int val = getVal(S.charAt(i));
            for (int j = 0; j < 4; j++) {
                counts[j][i] = (j == val ? 1 : 0) + (i == 0 ? 0 : counts[j][i - 1]);
            }
        }

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int p = P[i];
            int q = Q[i];

            for (int j = 0; j < 4; j++) {
                if (counts[j][q] - (p == 0 ? 0 : counts[j][p-1]) > 0) {
                    result[i] = j + 1;
                    break;
                }
            }
        }

        return result;

    }

    private int getVal(char c) {
        switch(c) {
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            default: return 3;
        }
    }
}
