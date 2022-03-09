public class LC26 {

    public int removeDuplicates(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i == nums.length - 1) {
                nums[idx++] = nums[i];
                break;
            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                ++i;
            }
            nums[idx++] = nums[i];
        }

        return idx;
    }

    public static void main(String[] args) {
        System.out.println(new LC26().removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(new LC26().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
