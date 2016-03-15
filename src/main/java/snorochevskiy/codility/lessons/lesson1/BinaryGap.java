package snorochevskiy.codility.lessons.lesson1;

public class BinaryGap {

    public int solution(int N) {

        //search for first non zero bit
        int start = 0;
        for (int i = 0; i< Integer.SIZE; i++) {
            if ( (N & (1 << (Integer.SIZE - i - 1))) != 0 ) {
                start = i;
                break;
            }
        }

        // Counting zero sequences
        int max = 0;
        int current = 0;
        for (int i = start; i< Integer.SIZE; i++) {
            if ( (N & (1 << (Integer.SIZE - i - 1))) == 0 ) {
                current++;
            } else {
                if (max < current) {
                    max = current;
                }
                current = 0;
            }
        }

        return max;
    }

}
