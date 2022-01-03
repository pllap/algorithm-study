class Solution:
    # string으로 바꿔서 푼 버전
    def isPalindromeStr(self, x: int) -> bool:
        x_str = str(x)
        reverse = x_str[::-1]
        return x_str == reverse

    # int로 계산해서 푼 버전
    def isPalindromeInt(self, x: int) -> bool:
        original = x
        reverse = 0
        while x > 0:
            reverse = reverse * 10
            reverse = reverse + x % 10
            x = int(x / 10)
        return original == reverse
