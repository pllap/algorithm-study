from typing import List


class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        # 먼저 앞 원소 기준으로 정렬한다
        intervals.sort(key=lambda x: x[0])
        len_intervals = len(intervals)
        answers = []
        # start와 end를 잡는다
        i = 0
        while i < len_intervals:
            start = intervals[i][0]
            end = intervals[i][1]
            # 다음 칸의 start가 현재 칸의 end보다 작으면 겹치는 것
            while i + 1 < len_intervals and intervals[i + 1][0] <= end:
                i += 1
                end = max(end, intervals[i][1])
            answers.append([start, end])
            i += 1
        return answers


if __name__ == '__main__':
    print(Solution().merge([[1, 3], [2, 6], [8, 10], [15, 18]]))
    print(Solution().merge([[1, 4], [4, 5]]))
    print(Solution().merge([[1, 4], [2, 3]]))
    print(Solution().merge([[1, 4], [0, 4]]))
