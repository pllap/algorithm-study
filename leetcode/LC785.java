public class LC785 {

    private int[][] graph;

    public boolean isBipartite(int[][] graph) {

        this.graph = graph;
        int numNode = graph.length;
        int[] colors = new int[numNode];

        // 각 점에서 dfs 하면서 검사하기
        for (int i = 0; i < numNode; ++i) {
            if (colors[i] == 0 && !isValid(i, colors, 1)) {
                return false;
            }
        }
        return true;
    }

    boolean isValid(int currentNode, int[] colors, int curColor) {

        if (colors[currentNode] != 0) {
            return colors[currentNode] == curColor;
        }

        colors[currentNode] = curColor;

        for (int nextNode : graph[currentNode]) {
            if (!isValid(nextNode, colors, -curColor)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] graph;

        graph = new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        System.out.println(new LC785().isBipartite(graph));

        graph = new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        System.out.println(new LC785().isBipartite(graph));
    }
}
