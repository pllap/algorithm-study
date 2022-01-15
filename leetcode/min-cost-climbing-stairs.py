from typing import List


class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        len_cost = len(cost)
        min_costs = [0 for i in range(len_cost)]
        min_costs[0] = cost[0]
        min_costs[1] = cost[1]
        for i in range(2, len_cost):
            min_costs[i] = min(min_costs[i - 1], min_costs[i - 2]) + cost[i]
        return min(min_costs[-1], min_costs[-2])


if __name__ == '__main__':
    print(Solution().minCostClimbingStairs([10, 15, 20]))
    print(Solution().minCostClimbingStairs([1, 100, 1, 1, 1, 100, 1, 1, 100, 1]))
