from collections import deque
from typing import List


class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, newColor: int) -> List[List[int]]:
        queue = deque()
        queue.append((sr, sc))

        len_row = len(image)
        len_col = len(image[0])
        while len(queue) > 0:
            r, c = queue.popleft()
            if r + 1 < len_row and image[r + 1][c] == image[r][c] != newColor:
                queue.append((r + 1, c))
            if r - 1 >= 0 and image[r - 1][c] == image[r][c] != newColor:
                queue.append((r - 1, c))
            if c + 1 < len_col and image[r][c + 1] == image[r][c] != newColor:
                queue.append((r, c + 1))
            if c - 1 >= 0 and image[r][c - 1] == image[r][c] != newColor:
                queue.append((r, c - 1))
            image[r][c] = newColor

        return image


if __name__ == '__main__':
    IMAGE = [[0, 0, 0], [0, 0, 0]]
    SR = 0
    SC = 0
    NEW_COLOR = 2
    print(Solution().floodFill(IMAGE, SR, SC, NEW_COLOR))
    IMAGE = [[1, 1, 1], [1, 1, 0], [1, 0, 1]]
    SR = 1
    SC = 1
    NEW_COLOR = 2
    print(Solution().floodFill(IMAGE, SR, SC, NEW_COLOR))
