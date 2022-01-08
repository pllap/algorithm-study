class Solution:
    def reverseWords(self, s: str) -> str:
        stack = []

        left = 0
        right = 0
        len_s = len(s)
        # 단어를 찾아 스택에 넣는다.
        while right < len_s:
            while left < len_s and s[left] == ' ':
                left += 1
            if left == len_s:
                break
            right = left + 1
            while right < len_s and s[right] != ' ':
                right += 1
            stack.append(s[left:right])
            left = right

        # 스택에서 문자열을 꺼내 공백 문자와 함께 덧붙인다.
        result = ''
        while len(stack) > 1:
            result = result + stack.pop() + ' '
        if len(stack) == 1:
            result = result + stack.pop()

        return result


if __name__ == '__main__':
    sol = Solution()
    S = "the sky is blue"
    print(sol.reverseWords(S))
    S = "  hello world  "
    print(sol.reverseWords(S))
    S = "a good   example"
    print(sol.reverseWords(S))
