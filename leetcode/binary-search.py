from typing import List


class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        while left <= right:
            # 종료 조건
            if right - left <= 1:
                if nums[left] == target:
                    return left
                elif nums[right] == target:
                    return right
                else:
                    return -1

            mid = left + (right - left) // 2
            if target > nums[mid]:
                left = mid
            elif target < nums[mid]:
                right = mid
            else:
                return mid


        # 470ms 걸린 코드

        # len_nums = len(nums)
        # if len_nums == 1:
        #     if nums[0] == target:
        #         return 0
        #     return -1
        # while left < right:
        #     mid = left + (right - left) // 2
        #     if nums[mid] == target:
        #         return mid
        #     elif nums[mid] < target:
        #         left = mid
        #     elif nums[mid] > target:
        #         right = mid
        #
        #     if left == right or left + 1 == right:
        #         if nums[left] == target:
        #             return left
        #         elif nums[right] == target:
        #             return right
        #         else:
        #             return -1


if __name__ == '__main__':
    sol = Solution()

    NUMS = [-1,0,3,5,9,12]
    TARGET = 9
    print(sol.search(NUMS, TARGET))

    NUMS = [-1,0,3,5,9,12]
    TARGET = 2
    print(sol.search(NUMS, TARGET))

    NUMS = [-1,0,3,5,9,12]
    TARGET = 13
    print(sol.search(NUMS, TARGET))

    NUMS = [5]
    TARGET = -5
    print(sol.search(NUMS, TARGET))

    NUMS = [2, 5]
    TARGET = 0
    print(sol.search(NUMS, TARGET))

    NUMS = [2, 5]
    TARGET = 2
    print(sol.search(NUMS, TARGET))

    NUMS = [2, 5]
    TARGET = 5
    print(sol.search(NUMS, TARGET))
