package snorochevskiy.codility.lessons.lesson3;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int diff = Y - X;
        int numberOfJumps = diff / D;
        if ( (diff % D) > 0) {
            numberOfJumps ++;
        }
        return numberOfJumps;
    }
}
