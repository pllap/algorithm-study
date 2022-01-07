from typing import List


class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        len_nums = len(nums)
        nums.sort(key=lambda x: abs(x))
        for i in range(len_nums):
            nums[i] = nums[i] ** 2
        return nums


if __name__ == '__main__':
    s = Solution()
    NUMS = [-4, -1, 0, 3, 10]
    print(s.sortedSquares(NUMS))
    NUMS = [-7, -3, 2, 3, 11]
    print(s.sortedSquares(NUMS))
