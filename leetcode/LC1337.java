import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1137 {
    
    public int[] kWeakestRows(int[][] mat, int k) {

        // 각 row의 군인의 수와 그 인덱스 저장
        List<int[]> numSoldiersAndTheirIndex = new ArrayList<>();
        for (int i = 0; i < mat.length; ++i) {
            int numSoldier = 0;
            while (numSoldier < mat[0].length && mat[i][numSoldier] == 1) {
                ++numSoldier;
            }
            numSoldiersAndTheirIndex.add(new int[]{numSoldier, i});
        }

        // 정렬
        numSoldiersAndTheirIndex.sort((x, y) -> {
            // 군인 수가 같으면 인덱스가 앞서는 것 리턴
            if (x[0] == y[0]) {
                return x[1] - y[1];
            }
            // 군인 수가 다르면 군인 수 비교해서 리턴
            return x[0] - y[0];
        });

        int[] answer = new int[k];
        for (int i = 0; i < k; ++i) {
            answer[i] = numSoldiersAndTheirIndex.get(i)[1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] mat;
        int k;

        mat = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        k = 3;
        System.out.println(Arrays.toString(new LC1137().kWeakestRows(mat, k)));

        mat = new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 1}};
        k = 3;
        System.out.println(Arrays.toString(new LC1137().kWeakestRows(mat, k))); // 1 2 3
    }
}
