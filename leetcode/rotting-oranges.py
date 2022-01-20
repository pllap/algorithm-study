import copy
from collections import deque
from typing import List


class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])

        enqueued = set()
        # 썩은 과일들을 찾는다
        rottens = []
        num_fresh = 0
        for r in range(m):
            for c in range(n):
                if grid[r][c] == 1:
                    num_fresh += 1
                elif grid[r][c] == 2:
                    rottens.append((r, c, 0))
                    enqueued.add((r, c))

        # 썩은 과일이 없으면 과일이 썩을 수 없다
        if len(rottens) == 0 and num_fresh > 0:
            return -1
        # 신선한 과일이 없으면 이미 다 썩은 것
        if num_fresh == 0:
            return 0

        min_minutes = m * n
        for rotten in rottens:
            num_rotten = -len(rottens)
            _grid = copy.deepcopy(grid)
            queue = deque(rottens)
            r, c, elapsed = rotten
            while len(queue) > 0:
                r, c, elapsed = queue.popleft()
                _grid[r][c] = 2
                num_rotten += 1
                # 각 방향으로 썩힌다
                if r + 1 < m and _grid[r + 1][c] == 1 and (r + 1, c) not in enqueued:
                    queue.append((r + 1, c, elapsed + 1))
                    enqueued.add((r + 1, c))
                if r - 1 >= 0 and _grid[r - 1][c] == 1 and (r - 1, c) not in enqueued:
                    queue.append((r - 1, c, elapsed + 1))
                    enqueued.add((r - 1, c))
                if c + 1 < n and _grid[r][c + 1] == 1 and (r, c + 1) not in enqueued:
                    queue.append((r, c + 1, elapsed + 1))
                    enqueued.add((r, c + 1))
                if c - 1 >= 0 and _grid[r][c - 1] == 1 and (r, c - 1) not in enqueued:
                    queue.append((r, c - 1, elapsed + 1))
                    enqueued.add((r, c - 1))
            if num_rotten == num_fresh:
                min_minutes = min(min_minutes, elapsed)

        if min_minutes == m * n:
            return -1
        return min_minutes


if __name__ == '__main__':
    # print(Solution().orangesRotting([[2, 1, 1], [1, 1, 0], [0, 1, 1]]))
    # print(Solution().orangesRotting([[2, 1, 1], [0, 1, 1], [1, 0, 1]]))
    # print(Solution().orangesRotting([[1]]))
    # print(Solution().orangesRotting([[2, 1, 1], [1, 1, 1], [0, 1, 2]]))
    print(Solution().orangesRotting([[1, 2, 1, 1, 2, 1, 1]]))
    # print(Solution().orangesRotting([[2, 1, 1], [1, 1, 0], [0, 1, 1]]))
    # print(Solution().orangesRotting(
    #     [[2, 0, 1, 1, 1, 1, 1, 1, 1, 1],
    #      [1, 0, 1, 0, 0, 0, 0, 0, 0, 1],
    #      [1, 0, 1, 0, 1, 1, 1, 1, 0, 1],
    #      [1, 0, 1, 0, 1, 0, 0, 1, 0, 1],
    #      [1, 0, 1, 0, 1, 0, 0, 1, 0, 1],
    #      [1, 0, 1, 0, 1, 1, 0, 1, 0, 1],
    #      [1, 0, 1, 0, 0, 0, 0, 1, 0, 1],
    #      [1, 0, 1, 1, 1, 1, 1, 1, 0, 1],
    #      [1, 0, 0, 0, 0, 0, 0, 0, 0, 1],
    #      [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]]))
