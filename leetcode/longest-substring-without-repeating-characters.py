class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        len_s = len(s)
        if len_s < 1:
            return 0

        max_length = 1
        left = 0
        right = 1
        while right <= len_s:
            if self.contains_duplicated(s[left:right]):
                if left + 1 == right:
                    right += 1
                left += 1
            else:
                max_length = max(max_length, right - left)
                right += 1
        return max_length

    def contains_duplicated(self, s: str) -> bool:
        _set = set()
        for c in s:
            if c in _set:
                return True
            else:
                _set.add(c)
        return False


if __name__ == '__main__':
    print(Solution().lengthOfLongestSubstring('bbbbb'))
    print(Solution().lengthOfLongestSubstring('abcabcbb'))
    print(Solution().lengthOfLongestSubstring('pwwkew'))
    print(Solution().lengthOfLongestSubstring('dvdf'))
