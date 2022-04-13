import java.util.Arrays;

public class LC59 {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n % 2 == 1) {
            matrix[n / 2][n / 2] = n * n;
        }

        // infiltrate from the outside
        int num = 1;
        for (int depth = 0; depth < n; ++depth) {
            int length = n - depth * 2;
            int r;
            int c;

            r = depth;
            c = depth;
            for (int i = 0; i < length - 1; ++i) {
                matrix[r][c++] = num++;
            }
            for (int i = 0; i < length - 1; ++i) {
                matrix[r++][c] = num++;
            }
            for (int i = 0; i < length - 1; ++i) {
                matrix[r][c--] = num++;
            }
            for (int i = 0; i < length - 1; ++i) {
                matrix[r--][c] = num++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new LC59().generateMatrix(1)));
        System.out.println(Arrays.deepToString(new LC59().generateMatrix(2)));
        System.out.println(Arrays.deepToString(new LC59().generateMatrix(3)));
        System.out.println(Arrays.deepToString(new LC59().generateMatrix(4)));
    }
}
