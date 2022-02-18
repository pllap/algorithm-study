package programmers;

public class IntegerTriangle {
    public int solution(int[][] triangle) {
        for (int lineIndex = triangle.length - 2; lineIndex > -1; --lineIndex) {
            for (int i = 0; i < triangle[lineIndex].length; ++i) {
                triangle[lineIndex][i] += Math.max(triangle[lineIndex + 1][i], triangle[lineIndex + 1][i + 1]);
            }
        }

        return triangle[0][0];
    }

    public static void main(String[] args) {
        int[][] triangle;

        triangle = new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(new IntegerTriangle().solution(triangle));
    }
}
