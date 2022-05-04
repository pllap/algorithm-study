import java.util.Arrays;

public class LC1679 {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;
        int left = 0;
        int right = n - 1;

        int count = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                ++left;
                --right;
                ++count;
                continue;
            }

            if (sum < k) {
                ++left;
            } else {
                --right;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new LC1679().maxOperations(new int[]{1,1,1,1}, 2));
    }
}
