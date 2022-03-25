import java.util.Arrays;

public class LC1029 {
    public int twoCitySchedCost(int[][] costs) {

        int length = costs.length;
        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

        int sum = 0;
        for (int i = 0; i < length / 2; ++i) {
            sum += costs[i][0] + costs[length - i - 1][1];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] costs;

        costs = new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        System.out.println(new LC1029().twoCitySchedCost(costs));
    }
}
