from typing import List


class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        from collections import deque
        answer = []
        queue = deque()
        queue.append(('(', 1, 0))
        while len(queue) > 0:
            cur_ps, num_open, num_close = queue.popleft()
            if len(cur_ps) == n * 2:
                answer.append(cur_ps)
                continue
            # num_open 이 n보다 작으면 여는 괄호를 큐에 넣는다
            if num_open < n:
                queue.append((cur_ps + '(', num_open + 1, num_close))
            # num_close가 num_open보다 작으면 닫는 괄호를 큐에 넣는다
            if num_close < num_open:
                queue.append((cur_ps + ')', num_open, num_close + 1))

        return answer


if __name__ == '__main__':
    print(Solution().generateParenthesis(3))
    print(Solution().generateParenthesis(1))
