class Solution:
    def reverseBits(self, n: int) -> int:
        result = 0
        for i in range(32):
            result = result << 1
            result += n & 1
            n = n >> 1
        return result


if __name__ == '__main__':
    print(Solution().reverseBits(0b00000010100101000001111010011100))
    print(Solution().reverseBits(0b11111111111111111111111111111101))
