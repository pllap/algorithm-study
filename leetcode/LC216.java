import java.util.*;

public class LC216 {

    private boolean[] visited;

    public List<List<Integer>> combinationSum3(int k, int n) {

        this.visited = new boolean[10];

        int[] combination = new int[k];
        List<List<Integer>> combinations = new ArrayList<>();

        backtracking(combinations, combination, 0, 0, n);
        return combinations;
    }

    private void backtracking(List<List<Integer>> combinations, int[] combination, int index, int sum, int target) {

        if (index == combination.length) {
            if (sum == target) {
                combinations.add(asList(combination));
            }
            return;
        }

        for (int i = 1; i < 10; ++i) {
            if (!visited[i] && (index == 0 || combination[index - 1] < i)) {
                visited[i] = true;
                combination[index] = i;
                backtracking(combinations, combination, index + 1, sum + i, target);
                visited[i] = false;
            }
        }
    }

    List<Integer> asList(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LC216().combinationSum3(3, 7));
        System.out.println(new LC216().combinationSum3(3, 9));
    }
}
