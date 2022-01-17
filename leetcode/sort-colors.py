from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        n_nums = [0, 0, 0]
        for num in nums:
            n_nums[num] += 1
        nums[:n_nums[0]] = [0 for i in range(n_nums[0])]
        nums[n_nums[0]:n_nums[0] + n_nums[1]] = [1 for i in range(n_nums[1])]
        nums[n_nums[0] + n_nums[1]:] = [2 for i in range(n_nums[2])]


if __name__ == '__main__':
    NUMS = [2, 0, 2, 1, 1, 0]
    Solution().sortColors(NUMS)
    print(NUMS)
