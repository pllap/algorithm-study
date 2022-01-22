import copy
from typing import List


class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        answer = []

        def backtracking(combined: List[int], num: int):
            if len(combined) == k:
                answer.append(combined[::])
                return
            for i in range(num, n + 1):
                combined.append(i)
                backtracking(combined, i + 1)
                combined.pop()

        backtracking([], 1)

        return answer

    # 더럽고 느리게 짰던 코드 (폐기)
    def combine1(self, n: int, k: int) -> List[List[int]]:
        answer = []

        if n == k:
            return [[i for i in range(1, n + 1)]]

        reverse = False
        if k > n // 2:
            reverse = True
            k = n - k

        def bt(combined: List[int], cur_k: int):
            if cur_k == k:
                combined.sort()
                if combined not in answer:
                    answer.append(combined)
                return
            for i in range(1, n + 1):
                if i not in combined:
                    next_combined = copy.deepcopy(combined)
                    next_combined.append(i)
                    bt(next_combined, cur_k + 1)

        bt([], 0)

        if reverse:
            for i in range(len(answer)):
                ans = [j for j in range(1, n + 1)]
                for j in range(len(answer[i]) - 1, -1, -1):
                    ans.pop(answer[i][j] - 1)
                answer[i] = ans

        return answer


if __name__ == '__main__':
    print(Solution().combine(1, 1))
    print(Solution().combine(4, 2))
    print(Solution().combine(13, 13))
    print(Solution().combine(13, 10))
