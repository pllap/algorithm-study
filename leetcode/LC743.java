import java.util.*;

public class LC743 {

    public int networkDelayTime(int[][] times, int n, int k) {

        // 연결 그래프를 만든다
        int[][] graph = new int[n + 1][n + 1];
        // 거리가 0인 간선도 있어서 -1로 초기화해 줘야 한다
        for (int r = 1; r < n + 1; ++r) {
            for (int c = 1; c < n + 1; ++c) {
                graph[r][c] = -1;
            }
        }
        for (int[] time : times) {
            graph[time[0]][time[1]] = time[2];
        }

        // 다익스트라 탐색 진행
        // k번째 노드부터 시작, 모든 노드를 방문할 때까지
        // pq: (노드, 지금까지의 거리)
        boolean[] visited = new boolean[n + 1];
        Queue<int[]> pq = new PriorityQueue<>((a,b)->(a[1]-b[1]));
        pq.offer(new int[]{k, 0});
        final int NODE = 0;
        final int DISTANCE = 1;

        while (!pq.isEmpty()) {
            int[] cur = pq.remove();
            if (visited[cur[NODE]]) {
                continue;
            }

            visited[cur[NODE]] = true;
            --n;
            if (n == 0) {
                return cur[DISTANCE];
            }

            for (int next = 1; next < graph.length; ++next) {
                int distanceToNext = graph[cur[NODE]][next];
                if (distanceToNext == -1) {
                    continue;
                }
                pq.offer(new int[]{next, cur[DISTANCE] + distanceToNext});
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[][] times;

        times = new int[][]{{2,1,1},{2,3,1},{3,4,1}};
        System.out.println(new LC743().networkDelayTime(times, 4, 2));

        times = new int[][]{{1, 2, 1}, {2, 1, 1}};
        System.out.println(new LC743().networkDelayTime(times, 2, 1));

        times = new int[][]{{1, 2, 1}, {2, 1, 1}};
        System.out.println(new LC743().networkDelayTime(times, 3, 1));
    }
}
