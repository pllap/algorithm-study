class Solution:
    def isPalindrome(self, s: str) -> bool:
        len_s = len(s)
        low = [s[i].lower() for i in range(len_s) if s[i].isalnum()]
        len_low = len(low)
        for i in range(len_low // 2):
            if low[i] != low[-1 - i]:
                return False
        return True
