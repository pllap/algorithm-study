import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answers = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(answers, candidates, new ArrayList<>(), 0, target, 0);
        return answers;
    }

    void findCombination(List<List<Integer>> answers, int[] candidates, List<Integer> combination, int sum, int target, int startIndex) {
        if (sum == target) {
            List<Integer> answer = new ArrayList<>(combination);
            answers.add(answer);
            return;
        }

        for (int i = startIndex; i < candidates.length; ++i) {
            if (sum + candidates[i] > target) {
                return;
            }
            combination.add(candidates[i]);
            findCombination(answers, candidates, combination, sum + candidates[i], target, i);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates;
        int target;

        candidates = new int[]{2, 3, 6, 7};
        target = 7;
        System.out.println(new CombinationSum().combinationSum(candidates, target));

        candidates = new int[]{2, 3, 5};
        target = 8;
        System.out.println(new CombinationSum().combinationSum(candidates, target));

        candidates = new int[]{2, 7, 6, 3, 5, 1};
        target = 9;
        System.out.println(new CombinationSum().combinationSum(candidates, target));
    }
}
