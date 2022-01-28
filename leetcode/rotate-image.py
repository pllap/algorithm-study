from typing import List


class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        num_rows = len(matrix)
        depth = len(matrix) - 1
        for i in range(depth):
            if num_rows == 1:
                break
            # 위를 빼 두고
            temp = matrix[i][i:num_rows + i]
            # 왼쪽에서 위로 가져오고
            for j in range(num_rows):
                matrix[i][num_rows + i - j - 1] = matrix[i + j][i]
            # 아래쪽에서 왼쪽으로 가져오고
            for j in range(num_rows):
                matrix[i + j][i] = matrix[num_rows + i - 1][i + j]
            # 오른쪽에서 아래쪽으로 가져오고
            for j in range(num_rows):
                matrix[num_rows + i - 1][i + j] = matrix[num_rows + i - j - 1][num_rows + i - 1]
            # 빼 둔 위를 오른쪽으로 가져간다
            for j in range(num_rows):
                matrix[i + j][num_rows + i - 1] = temp[j]
            num_rows -= 2


if __name__ == '__main__':
    MATRIX = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    Solution().rotate(MATRIX)
    print(MATRIX)
    MATRIX = [[5, 1, 9, 11], [2, 4, 8, 10], [13, 3, 6, 7], [15, 14, 12, 16]]
    Solution().rotate(MATRIX)
    print(MATRIX)
    MATRIX = [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19, 20], [21, 22, 23, 24, 25]]
    Solution().rotate(MATRIX)
    print(MATRIX)
    MATRIX = [[2, 29, 20, 26, 16, 28], [12, 27, 9, 25, 13, 21], [32, 33, 32, 2, 28, 14], [13, 14, 32, 27, 22, 26], [33, 1, 20, 7, 21, 7], [4, 24, 1, 6, 32, 34]]
    Solution().rotate(MATRIX)
    print(MATRIX)
