class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        from collections import defaultdict
        s_count = defaultdict(int)
        for c in s:
            s_count[c] += 1
        for c in t:
            s_count[c] -= 1
            if s_count[c] == -1:
                return c


if __name__ == '__main__':
    print(Solution().findTheDifference("abcd", "abcde"))
