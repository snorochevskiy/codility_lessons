package snorochevskiy.codility.lessons.lesson5;

// Solution with Segment Tree
// Time - O(N + M*LogN)
public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        Node tree = Node.buildSegmentTree(S);

        int[] results = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            results[i] = tree.queryMin(P[i], Q[i]);
        }
        return results;
    }

    static class Node {

        String src;

        int min;
        int leftIndex;
        int rightIndex;
        int middleIndex;

        Node leftNode;
        Node rightNode;

        public int queryMin(int lInd, int rInd) {
            if (this.leftIndex == lInd && this.rightIndex == rInd) {
                return this.min();
            }

            if (rInd <= this.middleIndex) {
                return this.leftNode.queryMin(lInd, rInd);
            } else if (lInd >= this.middleIndex + 1) {
                return this.rightNode.queryMin(lInd, rInd);
            } else {
                int leftMin = this.leftNode.queryMin(lInd, this.middleIndex);
                int rightMin = this.rightNode.queryMin(this.middleIndex + 1, rInd);
                return leftMin < rightMin ? leftMin : rightMin;
            }
        }

        private int min() {
            if (min == 0) {
                if (this.leftIndex == this.rightIndex) {
                    min = factorValueFromChar(src.charAt(leftIndex));
                } else {
                    min = leftNode.min() < rightNode.min() ? leftNode.min() : rightNode.min();
                }
            }
            return min;
        }

        public static Node buildSegmentTree(String S) {
            return buildLeftNode(S, 0, S.length() - 1);
        }

        private static Node buildLeftNode(String S, int leftIndex, int rightIndex) {
            Node node = new Node();
            node.src = S;
            node.leftIndex = leftIndex;
            node.rightIndex = rightIndex;

            if (leftIndex != rightIndex) {
                node.middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
                node.leftNode = buildLeftNode(S, leftIndex, node.middleIndex);
                node.rightNode = buildLeftNode(S, node.middleIndex + 1, rightIndex);
            }

            return node;
        }

    }

    public static int factorValueFromChar(char c) {
        switch (c) {
            case 'A': return 1;
            case 'C': return 2;
            case 'G': return 3;
            case 'T': return 4;
        }
        throw new RuntimeException("No such nucleotide");
    }
}
