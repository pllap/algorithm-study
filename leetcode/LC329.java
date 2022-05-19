import java.util.Arrays;

public class LC329 {

    private int[][] matrix;
    private int[][] cache;
    private final int[] DIR = new int[]{-1,0,1,0,-1};
    private int numRow;
    private int numCol;

    public int longestIncreasingPath(int[][] matrix) {
        this.matrix = matrix;
        this.numRow = matrix.length;
        this.numCol = matrix[0].length;
        this.cache = new int[numRow][numCol];

        int max = 1;
        for (int r = 0; r < numRow; ++r) {
            for (int c = 0; c < numCol; ++c) {
                max = Math.max(max, dfs(r, c));
            }
        }

        System.out.println(Arrays.deepToString(cache));
        return max;
    }

    private int dfs(int row, int col) {

        if (cache[row][col] != 0) {
            return cache[row][col];
        }

        int max = 1;
        for (int d = 0; d < 4; ++d) {
            int nextRow = row + DIR[d];
            int nextCol = col + DIR[d + 1];
            if (nextRow < 0 || nextRow >= numRow || nextCol < 0 || nextCol >= numCol ||
                    matrix[nextRow][nextCol] <= matrix[row][col]) {
                continue;
            }

            max = Math.max(max, 1 + dfs(nextRow, nextCol));
        }

        cache[row][col] = max;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LC329().longestIncreasingPath(new int[][]{{9,9,4},{6,6,8},{2,1,1}}));
    }
}
