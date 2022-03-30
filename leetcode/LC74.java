public class LC74 {
    // O(logn)
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (true) {
            if (row == matrix.length || col == -1) {
                return false;
            }

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                --col;
            } else if (matrix[row][col] < target) {
                ++row;
            }
        }
    }

    // O(n)
    public boolean searchMatrix1(int[][] matrix, int target) {
        int numRow = matrix.length;
        int numCol = matrix[0].length;
        int row = 0;
        int col = 0;

        while (row + 1 < numRow && matrix[row + 1][col] <= target) {
            ++row;
        }
        while (col + 1 < numCol && matrix[row][col + 1] <= target) {
            ++col;
        }

        return matrix[row][col] == target;
    }

    public static void main(String[] args) {
        int[][] matrix;

        matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(new LC74().searchMatrix(matrix, 3));

        matrix = new int[][]{{1}};
        System.out.println(new LC74().searchMatrix(matrix, 0));
    }
}
