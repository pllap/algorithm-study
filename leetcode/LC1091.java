import java.util.*;

public class LC1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {

        // 첫 칸이 1이면 애초에 불가능
        if (grid[0][0] == 1) {
            return -1;
        }

        int numRow = grid.length;
        int numCol = grid[0].length;
        // 8방향으로 순회
        int[] dir = new int[]{-1, -1, 1, 1, -1, 0, 1, 0, -1};
        // 방문 처리할 배열
        boolean[][] visited = new boolean[numRow][numCol];
        // 큐에 첫 번째 칸을 넣어 둔다
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        int distance = 0;
        while (!queue.isEmpty()) {
            ++distance;
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; ++i) {
                // 큐에서 좌표를 꺼낸다
                int[] cur = queue.remove();
                // 도착했으면 거리 반환
                if (isArrived(cur, numRow, numCol)) {
                    return distance;
                }
                
                // 다음 8방향의 좌표로 이동한다
                for (int d = 0; d < 8; ++d) {
                    moveToNext(grid, numRow, numCol, dir, visited, queue, cur, d);
                }
            }
        }

        return -1;
    }

    private void moveToNext(int[][] grid, int numRow, int numCol, int[] dir, boolean[][] visited, Queue<int[]> queue, int[] cur, int d) {
        int nextRow = cur[0] + dir[d];
        int nextCol = cur[1] + dir[d + 1];
        if (nextRow >= 0 && nextRow < numRow && nextCol >= 0 && nextCol < numCol && grid[nextRow][nextCol] == 0 && !visited[nextRow][nextCol]) {
            queue.offer(new int[]{nextRow, nextCol});
            visited[nextRow][nextCol] = true;
        }
    }

    private boolean isArrived(int[] coordinate, int numRow, int numCol) {
        return coordinate[0] == numRow - 1 && coordinate[1] == numCol - 1;
    }

    public static void main(String[] args) {
        System.out.println(new LC1091().shortestPathBinaryMatrix(new int[][]{{0,1},{1,0}}));
    }
}
