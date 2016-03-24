package snorochevskiy.codility.lessons.lesson5;

public class CountDiv {

    public int solution(int A, int B, int K) {
        return (A % K == 0)
                ? (B - A) / K + 1
                : (B - (A - A % K )) / K ;
    }
}
