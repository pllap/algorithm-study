package com.pllap.leetcode;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int answer = 0;

        // i번째 인덱스까지의 합계를 저장하는 배열
        int[] sums = new int[nums.length + 1];
        sums[1] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            sums[i + 1] = sums[i] + nums[i];
        }

        // (i번째까지의 합) - (j번째까지의 합) = (j-i 구간의 합)
        for (int i = 1; i < sums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (sums[i] - sums[j] == k) {
                    ++answer;
                }
            }
        }

        return answer;
    }
}
