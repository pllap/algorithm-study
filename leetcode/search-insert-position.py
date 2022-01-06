from typing import List


class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        while left <= right:
            if right - left <= 1:
                if target <= nums[left]:
                    return left
                elif target > nums[right]:
                    return right + 1
                else:
                    return right
            mid = left + (right - left) // 2
            if target == nums[mid]:
                return mid
            if target > nums[mid]:
                left = mid
            elif target < nums[mid]:
                right = mid


if __name__ == '__main__':
    sol = Solution()
    print(sol.searchInsert([1, 3, 5, 7, 9], 0))
    print(sol.searchInsert([1, 3, 5, 7, 9], 4))
    print(sol.searchInsert([1, 3, 5, 7, 9], 5))
    print(sol.searchInsert([1, 3, 5, 7, 9], 9))
    print(sol.searchInsert([1, 3, 5, 7, 9], 11))
    print(sol.searchInsert([1, 3], 0))
    print(sol.searchInsert([1, 3], 1))
    print(sol.searchInsert([1, 3], 2))
    print(sol.searchInsert([1, 3], 3))
    print(sol.searchInsert([1, 3], 4))
    print(sol.searchInsert([1], 0))
    print(sol.searchInsert([1], 1))
    print(sol.searchInsert([1], 2))
