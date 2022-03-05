package com.pllap.leetcode.dp;

public class LC740 {
    public int deleteAndEarn(int[] nums) {

        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] valNums = new int[max + 1];
        for (int num : nums) {
            valNums[num] += num;
        }

        int[] mem = new int[max + 1];
        mem[0] = valNums[0];
        mem[1] = valNums[1];
        for (int i = 2; i < max + 1; ++i) {
            mem[i] = Math.max(mem[i - 2] + valNums[i], mem[i - 1]);
        }

        return mem[max];
    }

    public static void main(String[] args) {
        int[] nums;

        nums = new int[]{3, 4, 2};
        System.out.println(new LC740().deleteAndEarn(nums));

        nums = new int[]{2, 2, 3, 3, 3, 4};
        System.out.println(new LC740().deleteAndEarn(nums));

        nums = new int[]{3, 1};
        System.out.println(new LC740().deleteAndEarn(nums));

        nums = new int[]{1, 1, 1, 2, 4, 5, 5, 5, 6};
        System.out.println(new LC740().deleteAndEarn(nums));

        nums = new int[]{1, 6, 3, 3, 8, 4, 8, 10, 1, 3};
        System.out.println(new LC740().deleteAndEarn(nums));
    }
}
