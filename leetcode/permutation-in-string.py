from typing import List


class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        len_s1 = len(s1)
        len_s2 = len(s2)

        def chars_s(s: str) -> List[int]:
            chars = [0 for i in range(26)]
            for c in s:
                chars[ord(c) - ord('a')] += 1
            return chars

        chars_s1 = chars_s(s1)

        for i in range(len_s2 - len_s1 + 1):
            chars_s2 = chars_s(s2[i:i+len_s1])
            if chars_s1 == chars_s2:
                return True

        return False


if __name__ == '__main__':
    print(Solution().checkInclusion('ab', 'eidbaooo'))
    print(Solution().checkInclusion('ab', 'eidboaoo'))
    print(Solution().checkInclusion('abcdxabcde', 'abcdeabcdx'))
    print(Solution().checkInclusion('adc', 'dcda'))
    print(Solution().checkInclusion('o', 'mbaqpdomzxyo'))
