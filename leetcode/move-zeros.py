import time
from typing import List


class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        len_nums = len(nums)
        count: int = 0
        for i in range(len_nums - 1, -1, -1):
            if nums[i] == 0:
                nums.pop(i)
                count += 1
        nums.extend([0 for i in range(count)])


if __name__ == '__main__':
    s: Solution = Solution()
    NUMS = [0, 1, 0, 3, 12]
    s.moveZeroes(NUMS)
    print(NUMS)
    NUMS = [0]
    s.moveZeroes(NUMS)
    print(NUMS)
    NUMS = [0 for i in range(10000)]
    start = time.time()
    s.moveZeroes(NUMS)
    end = time.time()
    print(NUMS)
    print(f'{end-start}')
