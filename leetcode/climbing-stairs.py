class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 1:
            return 1
        elif n == 2:
            return 2

        steps = [1, 2, 3]
        for i in range(n - 3):
            steps[0] = steps[1]
            steps[1] = steps[2]
            steps[2] = steps[0] + steps[1]

        return steps[2]

    def climbStairs2(self, n: int) -> int:
        if n == 1:
            return 1
        elif n == 2:
            return 2

        steps = [0 for i in range(n)]
        steps[0] = 1
        steps[1] = 2
        for i in range(2, n):
            steps[i] = steps[i - 1] + steps[i - 2]

        return steps[n - 1]
