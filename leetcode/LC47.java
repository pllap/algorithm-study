import java.util.*;

public class LC47 {

    // set 사용 안 하는 방법
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        // 정렬 후 dfs 탐색
        Arrays.sort(nums);
        backtracking(result, new Stack<>(), nums, visited);

        return result;
    }

    private void backtracking(List<List<Integer>> result, Stack<Integer> stack, int[] nums, boolean[] visited) {
        if (stack.size() == nums.length) {
            result.add(new ArrayList<>(stack));
            return;
        }

        for (int i = 0; i < nums.length; ++i) {
            // 방문한 노드면 건너뛴다
            if (visited[i]) {
                continue;
            }
            // 앞 노드와 같은 경우 앞 노드도 사용한 경우에만 사용 가능
            // 이렇게 해야 앞뒤 노드의 순서가 뒤바뀌는 것을 방지할 수 있다
            if (i > 0 && nums[i - 1] == nums[i] && !visited[i - 1]) {
                continue;
            }
            visited[i] = true;
            stack.push(nums[i]);
            backtracking(result, stack, nums, visited);
            stack.pop();
            visited[i] = false;
        }
    }

    // 풀이 1 - 너무 느림
    public List<List<Integer>> permuteUnique1(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        boolean[] visited = new boolean[nums.length];

        backtracking1(result, new Stack<>(), nums, visited);

        return new ArrayList<>(result);
    }

    private void backtracking1(Set<List<Integer>> resultSet, Stack<Integer> currentList, int[] nums, boolean[] visited) {
        if (currentList.size() == nums.length) {
            List<Integer> result = new Stack<>();
            result.addAll(currentList);
            resultSet.add(result);
            return;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (visited[i]) {
                continue;
            }
            currentList.push(nums[i]);
            visited[i] = true;
            backtracking1(resultSet, currentList, nums, visited);
            currentList.pop();
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC47().permuteUnique(new int[]{1, 1, 2}));
    }
}
