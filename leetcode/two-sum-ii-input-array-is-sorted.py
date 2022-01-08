from typing import List


class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        len_numbers = len(numbers)
        start = 0
        end = 1
        while end < len_numbers - 1 and numbers[start] + numbers[end] < target:
            start += 1
            end += 1
        while numbers[start] + numbers[end] != target:
            if numbers[start] + numbers[end] > target:
                start -= 1
            else:
                end += 1
        return [start + 1, end + 1]


if __name__ == '__main__':
    s: Solution = Solution()
    NUMBERS = [2, 7, 11, 15]
    TARGET = 9
    print(s.twoSum(NUMBERS, TARGET))
    NUMBERS = [2, 3, 4]
    TARGET = 6
    print(s.twoSum(NUMBERS, TARGET))
    NUMBERS = [12, 13, 23, 28, 43, 44, 59, 60, 61, 68, 70, 86, 88, 92, 124, 125, 136, 168, 173, 173, 180, 199, 212, 221,
               227, 230, 277, 282, 306, 314, 316, 321, 325, 328, 336, 337, 363, 365, 368, 370, 370, 371, 375, 384, 387,
               394, 400, 404, 414, 422, 422, 427, 430, 435, 457, 493, 506, 527, 531, 538, 541, 546, 568, 583, 585, 587,
               650, 652, 677, 691, 730, 737, 740, 751, 755, 764, 778, 783, 785, 789, 794, 803, 809, 815, 847, 858, 863,
               863, 874, 887, 896, 916, 920, 926, 927, 930, 933, 957, 981, 997]
    TARGET = 542
    print(s.twoSum(NUMBERS, TARGET))
