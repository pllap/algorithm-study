from typing import List


class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        answer = []
        len_nums = len(nums)

        def backtracking(left_nums: List[int], permutation: List[int], len_left_nums):
            if len(permutation) == len_nums:
                answer.append(permutation[::])
                return
            for i in range(len_left_nums):
                permutation.append(left_nums[i])
                backtracking(left_nums[:i] + left_nums[i + 1:], permutation, len_left_nums - 1)
                permutation.pop()

        backtracking(nums, [], len_nums)
        return answer


if __name__ == '__main__':
    print(Solution().permute([1, 2, 3]))
    print(Solution().permute([0, 1]))
    print(Solution().permute([1]))
