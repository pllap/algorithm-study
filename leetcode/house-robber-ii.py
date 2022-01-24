from typing import List


class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) < 4:
            return max(nums)
        return max(self.simple_rob(nums[1:]), self.simple_rob(nums[:-1]))

    def simple_rob(self, nums: List[int]) -> int:
        len_nums = len(nums)
        amounts = [0 for i in range(len_nums)]
        amounts[0] = nums[0]
        amounts[1] = max(nums[0], nums[1])
        for i in range(2, len_nums):
            amounts[i] = max(amounts[i - 2] + nums[i], amounts[i - 1])
        return max(amounts[-1], amounts[-2])


if __name__ == '__main__':
    print(Solution().rob([2, 3, 2]))
    print(Solution().rob([1, 2, 3, 1]))
    print(Solution().rob([1, 2, 3]))
    print(Solution().rob([200, 3, 140, 20, 10]))
    print(Solution().rob([1, 3, 1, 3, 100]))
    print(Solution().rob([1, 2, 3, 4, 5, 1, 2, 3, 4, 5]))
