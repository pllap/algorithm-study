from typing import List


class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        if n == 1:
            return [[1]]
        elif n == 2:
            return [[1, 2], [4, 3]]
        else:
            result = [[(i + 1) for i in range(n)] for i in range(n)]
            r = 0
            c = n - 1
            val = n
            sub = 1
            while True:
                # 아래로
                for i in range(n - sub):
                    r += 1
                    val += 1
                    result[r][c] = val
                # 왼쪽으로
                for i in range(n - sub):
                    c -= 1
                    val += 1
                    result[r][c] = val
                if val == n * n:
                    return result
                sub += 1
                # 위로
                for i in range(n - sub):
                    r -= 1
                    val += 1
                    result[r][c] = val
                # 오른쪽으로
                for i in range(n - sub):
                    c += 1
                    val += 1
                    result[r][c] = val
                if val == n * n:
                    return result
                sub += 1


if __name__ == '__main__':
    print(Solution().generateMatrix(3))
    print(Solution().generateMatrix(4))
