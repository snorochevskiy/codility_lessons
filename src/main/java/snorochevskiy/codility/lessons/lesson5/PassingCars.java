package snorochevskiy.codility.lessons.lesson5;


public class PassingCars {

    public int solution(int[] A) {
        // going from west to east - 0
        // going from east to west - 1
        int goingEast = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                goingEast ++;
            }
        }

        long passingBy = 0;
        for (int i = A.length - 1; i >=0; i--) {
            if (A[i] == 1) {
                passingBy += goingEast;
            } else {
                goingEast --;
            }

            if (passingBy > 1000000000L) {
                return -1;
            }
        }

        return passingBy > 1000000000L ? -1 : (int)passingBy;
    }
}
