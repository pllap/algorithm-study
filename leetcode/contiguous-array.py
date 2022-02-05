from typing import List


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        max_length = 0
        graph = [0]
        # 각 합계의 등장 인덱스를 저장한다
        length = {0: [0]}
        for i, num in enumerate(nums):
            if num == 1:
                graph.append(graph[-1] + 1)
            else:
                graph.append(graph[-1] - 1)
            val = graph[-1]
            # 이미 나왔던 값이면 개수를 구한다
            if val in length:
                length[val].append(i + 1)
                max_length = max(max_length, length[val][-1] - length[val][0])
            else:
                length[val] = [i + 1]
        return max_length


if __name__ == '__main__':
    print(Solution().findMaxLength([0, 1]))
    print(Solution().findMaxLength([0, 1, 1, 1, 0, 0, 1]))
    print(Solution().findMaxLength([0, 1, 0, 1]))
