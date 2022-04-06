import java.util.*;

public class LC15 {

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    --k;
                } else if (sum < 0) {
                    ++j;
                } else {
                    answer.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                    // 중복을 없앤다
                    while (j < k && nums[j] == nums[j - 1]) {
                        ++j;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        --k;
                    }
                }
            }
        }

        return answer;
    }

    // Set 이용 - 느림
    public List<List<Integer>> threeSum1(int[] nums) {

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
