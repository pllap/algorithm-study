from typing import List


class Solution:
    def findJudge(self, n: int, trusts: List[List[int]]) -> int:
        trust = [0 for i in range(n + 1)]
        sum_trusted = [0 for i in range(n + 1)]
        for t in trusts:
            trust[t[0]] += 1
            sum_trusted[t[1]] += 1

        for i in range(n):
            if sum_trusted[i + 1] == n - 1 and trust[i + 1] == 0:
                return i + 1

        return -1


if __name__ == '__main__':
    N = 2
    TRUST = [[1, 2]]
    print(Solution().findJudge(N, TRUST))
    N = 3
    TRUST = [[1, 3], [2, 3]]
    print(Solution().findJudge(N, TRUST))
    N = 3
    TRUST = [[1, 3], [2, 3], [3, 1]]
    print(Solution().findJudge(N, TRUST))
    N = 4
    TRUST = [[1, 3], [1, 4], [2, 3], [2, 4], [4, 3]]
    print(Solution().findJudge(N, TRUST))
