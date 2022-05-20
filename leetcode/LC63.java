public class LC63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // 로봇은 0,0부터 n-1,m-1까지 가야 함
        int numRow = obstacleGrid.length;
        int numCol = obstacleGrid[0].length;
        
        // 장애물을 피하며, 할 수 있는 모든 경로의 개수를 구하라
        int[][] numPath = new int[numRow][numCol];

        // 첫 줄 먼저 채워 둔다
        for (int r = 0; r < numRow; ++r) {
            if (obstacleGrid[r][0] == 1) {
                break;
            }
            numPath[r][0] = 1;
        }
        for (int c = 0; c < numCol; ++c) {
            if (obstacleGrid[0][c] == 1) {
                break;
            }
            numPath[0][c] = 1;
        }

        // 나머지 칸들의 가능한 경로의 개수를 구한다
        for (int r = 1; r < numRow; ++r) {
            for (int c = 1; c < numCol; ++c) {
                if (obstacleGrid[r][c] == 1) {
                    continue;
                }
                numPath[r][c] = numPath[r - 1][c] + numPath[r][c - 1];
            }
        }
        return numPath[numRow - 1][numCol - 1];
    }
}
