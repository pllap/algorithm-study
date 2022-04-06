import java.util.*;

public class LC15 {

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> answer = new HashSet<>();

        for (int i = 0; i < nums.length - 2; ++i) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    --k;
                    continue;
                }
                if (sum < 0) {
                    ++j;
                    continue;
                }
                answer.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
            }
        }

        return new ArrayList<>(answer);
    }

    public static void main(String[] args) {
        System.out.println(new LC15().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(new LC15().threeSum(new int[]{}));
        System.out.println(new LC15().threeSum(new int[]{0}));
    }
}
