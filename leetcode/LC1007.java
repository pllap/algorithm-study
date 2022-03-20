public class LC1007 {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int numDomino = tops.length;
        // 먼저 돌면서 numDomino개 채우는 숫자가 있는지 본다
        // top과 bottom이 같은 경우 하나만 센다
        int[] count = new int[7];
        for (int i = 0; i < numDomino; ++i) {
            count[tops[i]]++;
            if (tops[i] != bottoms[i]) {
                count[bottoms[i]]++;
            }
        }

        // numDomino개 채우는 숫자에 대해
        // 배열을 돌면서 다른게 있으면 스왑 수에 더한다 (스왑하지 않고 스왑 효과 내기)
        boolean success = false;
        int minRotation = numDomino;
        for (int num = 1; num < 7; ++num) {
            if (count[num] == numDomino) {
                success = true;
                int numRotationWithTop = 0;
                int numRotationWithBottom = 0;
                for (int dominoIdx = 0; dominoIdx < numDomino; ++dominoIdx) {
                    if (tops[dominoIdx] != num) {
                        numRotationWithTop++;
                    }
                    if (bottoms[dominoIdx] != num) {
                        numRotationWithBottom++;
                    }
                }
                minRotation = Math.min(Math.min(minRotation, numRotationWithTop), numRotationWithBottom);
            }
        }

        if (!success) {
            return -1;
        }

        return minRotation;
    }

    public static void main(String[] args) {
        int[] tops;
        int[] bottoms;

        tops = new int[]{2, 1, 2, 4, 2, 2};
        bottoms = new int[]{5, 2, 6, 2, 3, 2};
        System.out.println(new LC1007().minDominoRotations(tops, bottoms));

        tops = new int[]{3, 5, 1, 2, 3};
        bottoms = new int[]{3, 6, 3, 3, 4};
        System.out.println(new LC1007().minDominoRotations(tops, bottoms));
    }
}
