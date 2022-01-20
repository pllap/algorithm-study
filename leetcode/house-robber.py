from typing import List


class Solution:
    def rob(self, nums: List[int]) -> int:
        len_nums = len(nums)
        if len_nums == 1:
            return nums[0]
        maxs = [0 for i in range(len_nums)]
        maxs[0], maxs[1] = nums[0], max(nums[0], nums[1])
        for i in range(2, len_nums):
            maxs[i] = max(maxs[i - 1], maxs[i - 2] + nums[i])
        return maxs[-1]


if __name__ == '__main__':
    print(Solution().rob([1, 2, 3, 1]))
    print(Solution().rob([2, 7, 9, 3, 1]))
    print(Solution().rob([2, 1, 1, 2]))
    print(Solution().rob([1, 2, 3, 1]))
