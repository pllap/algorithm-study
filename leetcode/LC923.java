public class LC923 {

    public int threeSumMulti(int[] arr, int target) {

        int MOD = 1000000007;
        long answer = 0L;

        // arr의 각 숫자의 등장 횟수를 저장한다
        long[] counts = new long[101];
        for (int a : arr) {
            ++counts[a];
        }

        // target을 만드는 네 가지 경우를 고려한다
        // i i i (같은 수 3개)
        // i i j (같은 수 2개 + 다른 수 1개)
        // i j j (다른 수 1개 + 같은 수 2개)
        // i j k (다른 수 3개)
        for (int i = 0; i < 101; ++i) {
            if (i * 3 == target) {
                answer += counts[i] * (counts[i] - 1) * (counts[i] - 2) / 6;
            }
            int j = i + 1;
            int k = target - i - j;
            while (j < 101) {
                if (i * 2 + j == target) {
                    answer += counts[i] * (counts[i] - 1) * counts[j] / 2;
                }
                if (i + j * 2 == target) {
                    answer += counts[i] * counts[j] * (counts[j] - 1) / 2;
                }
                if (k > j && k < 101) {
                    answer += counts[i] * counts[j] * counts[k];
                }
                ++j;
                --k;
            }
        }

        return (int) (answer % MOD);
    }

    public static void main(String[] args) {
        System.out.println(new LC923().threeSumMulti(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8));
        System.out.println(new LC923().threeSumMulti(new int[]{1, 1, 2, 2, 2, 2}, 5));
        System.out.println(new LC923().threeSumMulti(new int[]{1, 1, 2, 2, 2, 2}, 5));
    }
}
