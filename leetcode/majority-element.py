from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        majority = {}
        len_nums = len(nums)
        if len_nums == 1:
            return nums[0]
        for num in nums:
            if num in majority:
                majority[num] += 1
                if majority[num] > len_nums // 2:
                    return num
            else:
                majority[num] = 1

        # 한 줄 풀이 (nlogn)
        return sorted(nums)[len(nums) // 2]


if __name__ == '__main__':
    NUMS = [3, 2, 3]
    print(Solution().majorityElement(NUMS))
    NUMS = [1, 1, 1, 2]
    print(Solution().majorityElement(NUMS))
