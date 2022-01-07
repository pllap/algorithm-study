from typing import List


class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        len_nums = len(nums)
        k = k % len_nums
        # 배열의 뒷부분을 k칸 복사해 둔다.
        temp = nums[-k:]
        # 뒤에서부터 k칸 앞의 원소를 복사해가며 채운다.
        for i in range(len_nums - 1, k - 1, -1):
            nums[i] = nums[i - k]
        # 복사해 둔 뒷부분의 배열을 앞에 넣는다.
        len_temp = len(temp)
        for i in range(len_temp):
            nums[i] = temp[i]


if __name__ == '__main__':
    s = Solution()
    NUMS = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    K = 3
    s.rotate(NUMS, K)
    print(NUMS)
    NUMS = [-1, -100, 3, 99]
    K = 2
    s.rotate(NUMS, K)
    print(NUMS)
