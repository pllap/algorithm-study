from collections import deque
from typing import List


class Solution:
    # BFS를 이용한 풀이 (비효율적)
    def searchMatrixBFS(self, matrix: List[List[int]], target: int) -> bool:
        num_r = len(matrix)
        num_c = len(matrix[0])
        visited = [[False for i in range(num_c)] for j in range(num_r)]
        queue = deque()
        queue.append((0, 0))
        while len(queue) > 0:
            (r, c) = queue.popleft()
            if matrix[r][c] == target:
                return True
            if r + 1 < num_r and matrix[r + 1][c] <= target and not visited[r + 1][c]:
                visited[r + 1][c] = True
                queue.append((r + 1, c))
            if c + 1 < num_c and matrix[r][c + 1] <= target and not visited[r][c + 1]:
                visited[r][c + 1] = True
                queue.append((r, c + 1))
        return False

    # O(m + n) 풀이
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        num_r = len(matrix)
        num_c = len(matrix[0])
        r = 0
        c = num_c - 1
        while c >= 0 and r < num_r:
            if matrix[r][c] > target:
                c -= 1
            elif matrix[r][c] < target:
                r += 1
            else:
                break
        if r > num_r - 1 or c < 0:
            return False
        return matrix[r][c] == target


if __name__ == '__main__':
    MATRIX = [[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]]
    TARGET = 5
    print(Solution().searchMatrix(MATRIX, TARGET))
    MATRIX = [[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]]
    TARGET = 20
    print(Solution().searchMatrix(MATRIX, TARGET))
    MATRIX = [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19, 20], [21, 22, 23, 24, 25]]
    TARGET = 19
    print(Solution().searchMatrix(MATRIX, TARGET))
    MATRIX = [[-1, 3]]
    TARGET = -1
    print(Solution().searchMatrix(MATRIX, TARGET))
