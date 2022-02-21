package leetcode;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums;

        nums = new int[]{3, 2, 3};
        System.out.println(new MajorityElement().majorityElement(nums));
    }
}
