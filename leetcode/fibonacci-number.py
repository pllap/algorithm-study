class Solution:
    def fib(self, n: int) -> int:
        fibo = [0, 1]
        for i in range(n - 1):
            fibo.append(fibo[-1] + fibo[-2])
        return fibo[n]


if __name__ == '__main__':
    sol = Solution()
    print(sol.fib(2))
    print(sol.fib(3))
    print(sol.fib(4))
    print(sol.fib(5))
    print(sol.fib(6))
    print(sol.fib(7))
