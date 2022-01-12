from typing import List


class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        def get_area(grid: List[List[int]], r: int, c: int, num_r: int, num_c: int) -> int:
            sum = 0
            grid[r][c] = 0
            if r - 1 >= 0 and grid[r - 1][c] == 1:
                sum += get_area(grid, r - 1, c, num_r, num_c)
            if r + 1 < num_r and grid[r + 1][c] == 1:
                sum += get_area(grid, r + 1, c, num_r, num_c)
            if c - 1 >= 0 and grid[r][c - 1] == 1:
                sum += get_area(grid, r, c - 1, num_r, num_c)
            if c + 1 < num_c and grid[r][c + 1] == 1:
                sum += get_area(grid, r, c + 1, num_r, num_c)

            return sum + 1

        num_row = len(grid)
        num_col = len(grid[0])
        max_area = 0
        for r in range(num_row):
            for c in range(num_col):
                if grid[r][c] == 1:
                    max_area = max(max_area, get_area(grid, r, c, num_row, num_col))
        return max_area


if __name__ == '__main__':
    print(Solution().maxAreaOfIsland([[0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0],
                                      [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0],
                                      [0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0],
                                      [0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0],
                                      [0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0],
                                      [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0],
                                      [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0],
                                      [0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0]]))
