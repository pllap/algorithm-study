from typing import List


class Solution:
    # 투 포인터 (시간 초과)
    def fourSumCount1(self, nums1: List[int], nums2: List[int], nums3: List[int], nums4: List[int]) -> int:

        # 3, 4만 정렬한다
        nums3.sort()
        nums4.sort()

        count = 0
        len_nums = len(nums1)
        for i in range(len_nums):
            for j in range(len_nums):
                # 1, 2를 고정해 두고 3, 4는 투포인터로 탐색한다
                two_sum = nums1[i] + nums2[j]
                i_nums3 = 0
                i_nums4 = len_nums - 1
                while i_nums3 < len_nums and i_nums4 > -1:
                    four_sum = two_sum + nums3[i_nums3] + nums4[i_nums4]
                    if four_sum > 0:
                        i_nums4 -= 1
                    elif four_sum < 0:
                        i_nums3 += 1
                    else:
                        # 겹치는 인덱스들이 있으면 한 번에 센다
                        dup_nums3 = 0
                        dup_nums4 = 0
                        while i_nums3 + dup_nums3 < len_nums and nums3[i_nums3 + dup_nums3] == nums3[i_nums3]:
                            dup_nums3 += 1
                        while i_nums4 - dup_nums4 > -1 and nums4[i_nums4 - dup_nums4] == nums4[i_nums4]:
                            dup_nums4 += 1
                        count += dup_nums3 * dup_nums4
                        i_nums3 += dup_nums3
                        i_nums4 -= dup_nums4
        return count

    # map, O(n^2)
    def fourSumCount(self, nums1: List[int], nums2: List[int], nums3: List[int], nums4: List[int]) -> int:
        from collections import defaultdict
        sums = defaultdict(int)
        for num1 in nums1:
            for num2 in nums2:
                sums[-num1 - num2] += 1
        count = 0
        for num3 in nums3:
            for num4 in nums4:
                count += sums[num3 + num4]
        return count


if __name__ == '__main__':
    NUMS1 = [1, 2]
    NUMS2 = [-2, -1]
    NUMS3 = [-1, 2]
    NUMS4 = [0, 2]
    print(Solution().fourSumCount(NUMS1, NUMS2, NUMS3, NUMS4))

    NUMS1 = [0, 1, -1]
    NUMS2 = [-1, 1, 0]
    NUMS3 = [0, 0, 1]
    NUMS4 = [-1, 1, 1]
    print(Solution().fourSumCount(NUMS1, NUMS2, NUMS3, NUMS4))

    NUMS1 = [-1, -1]
    NUMS2 = [-1, 1]
    NUMS3 = [-1, 1]
    NUMS4 = [1, -1]
    print(Solution().fourSumCount(NUMS1, NUMS2, NUMS3, NUMS4))
