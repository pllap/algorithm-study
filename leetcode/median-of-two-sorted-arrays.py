from typing import List


class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        len_nums1 = len(nums1)
        len_nums2 = len(nums2)
        len_merged = len_nums1 + len_nums2
        idx1 = 0
        idx2 = 0
        merged = []
        while len(nums1) > 0 and len(nums2) > 0:
            if idx1 >= len_nums1 or idx2 >= len_nums2:
                break
            if nums1[idx1] <= nums2[idx2]:
                merged.append(nums1[idx1])
                idx1 += 1
            else:
                merged.append(nums2[idx2])
                idx2 += 1

        while idx1 < len_nums1:
            merged.append(nums1[idx1])
            idx1 += 1
        while idx2 < len_nums2:
            merged.append(nums2[idx2])
            idx2 += 1

        if len_merged % 2:
            return merged[len_merged // 2]
        else:
            return (merged[len_merged // 2 - 1] + merged[len_merged // 2]) / 2


if __name__ == '__main__':
    s = Solution()
    NUMS1 = [1, 3]
    NUMS2 = [2]
    print(s.findMedianSortedArrays(NUMS1, NUMS2))
    NUMS1 = [1, 2]
    NUMS2 = [3, 4]
    print(s.findMedianSortedArrays(NUMS1, NUMS2))
    NUMS1 = [5]
    NUMS2 = [-5]
    print(s.findMedianSortedArrays(NUMS1, NUMS2))
