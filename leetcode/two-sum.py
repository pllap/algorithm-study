class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n_nums = len(nums)
        for i in range(n_nums):
            for j in range(i + 1, n_nums):
                if nums[i] + nums[j] == target:
                    return [i, j]