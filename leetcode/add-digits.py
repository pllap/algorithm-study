class Solution:
    def addDigits(self, num: int) -> int:
        while num > 9:
            result = 0
            temp = num
            while temp > 0:
                result += temp % 10
                temp //= 10
            num = result
        return num


if __name__ == '__main__':
    print(Solution().addDigits(38))
    print(Solution().addDigits(0))
    print(Solution().addDigits(10))
