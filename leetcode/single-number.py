from typing import List


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # # set을 이용한 풀이
        # num_set = set()
        # for num in nums:
        #     if num in num_set:
        #         num_set.discard(num)
        #     else:
        #         num_set.add(num)
        # return num_set.pop()

        # XOR을 이용한 풀이
        answer = 0
        for num in nums:
            answer = answer ^ num
        return answer


if __name__ == '__main__':
    print(Solution().singleNumber([2,2,1]))
    print(Solution().singleNumber([4,1,2,1,2]))
    print(Solution().singleNumber([1]))
