class Solution:
    def tribonacci(self, n: int) -> int:
        # # 메모이제이션을 이용한 풀이
        # tribo = [0, 1, 1]
        # for i in range(n - 2):
        #     tribo.append(tribo[-1] + tribo[-2] + tribo[-3])
        # return tribo[-1]
        # 튜플을 이용한 풀이
        tribo = (0, 1, 1)
        for i in range(n - 2):
            tribo = (tribo[1], tribo[2], tribo[0] + tribo[1] + tribo[2])
        if n == 0:
            return 0
        elif n == 1:
            return 1
        else:
            return tribo[2]


if __name__ == '__main__':
    print(Solution().tribonacci(0))
    print(Solution().tribonacci(1))
    print(Solution().tribonacci(2))
    print(Solution().tribonacci(3))
    print(Solution().tribonacci(4))
