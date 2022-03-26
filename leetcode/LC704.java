public class LC704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (left == mid) {
                return nums[left] == target ? left : -1;
            }
            if (right == mid) {
                return nums[right] == target ? right : -1;
            }
            if (target > nums[mid]) {
                left = mid;
            } else if (target < nums[mid]) {
                right = mid;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums;
        int target;

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = 2;
        System.out.println(new LC704().search(nums, target));
    }
}
