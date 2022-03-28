public class LC81 {
    public boolean search(int[] nums, int target) {

        if (nums.length == 1) {
            return nums[0] == target;
        }

        // 배열을 회전 이전 상태로 돌린다
        // 작아지는 순간을 포착
        int pivot = 1;
        while (pivot < nums.length && nums[pivot] >= nums[pivot - 1]) {
            ++pivot;
        }
        if (pivot != nums.length) {
            int[] original = new int[nums.length];
            int originalIdx = -1;
            for (int i = pivot; i < nums.length; ++i) {
                original[++originalIdx] = nums[i];
            }
            for (int i = 0; i < pivot; ++i) {
                original[++originalIdx] = nums[i];
            }
            nums = original;
        }

        // 이분 탐색으로 찾는다
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                return true;
            }
            if (left + 1 == right) {
                return nums[left] == target || nums[right] == target;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums;

        nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        System.out.println(new LC81().search(nums, 0));
        System.out.println(new LC81().search(nums, 3));

        nums = new int[]{1, 1};
        System.out.println(new LC81().search(nums, 2));
    }
}
