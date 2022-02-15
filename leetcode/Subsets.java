import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backtracking(answer, new ArrayList<>(), nums, 0);
        return answer;
    }

    void backtracking(List<List<Integer>> answer, List<Integer> subset, int[] nums, int from) {
        answer.add(new ArrayList<>(subset));
        for (int i = from; i < nums.length; ++i) {
            subset.add(nums[i]);
            backtracking(answer, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums;

        nums = new int[]{1, 2, 3};
        System.out.println(new Subsets().subsets(nums));

        nums = new int[]{0};
        System.out.println(new Subsets().subsets(nums));
    }
}
