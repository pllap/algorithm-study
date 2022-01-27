from typing import List


class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        rows = [[1], [1, 1]]
        if rowIndex < 2:
            return rows[rowIndex]
        for i in range(2, rowIndex + 2):
            rows[0] = rows[1]
            rows[1] = [1] * i
            for j in range(1, i - 1):
                rows[1][j] = rows[0][j - 1] + rows[0][j]
        return rows[1]


if __name__ == '__main__':
    print(Solution().getRow(3))
    print(Solution().getRow(4))
    print(Solution().getRow(5))
    print(Solution().getRow(33))
