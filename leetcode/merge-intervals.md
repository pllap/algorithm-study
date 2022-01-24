# 56. Merge Intervals
[문제 링크](https://leetcode.com/problems/merge-intervals/ )  
[풀이 링크](merge-intervals.py )  

## 문제 설명
`[start, end]`의 구간이 여러 개 주어진 2차원 배열 `interval`이 주어진다.  
겹치는 구간들이 하나로 합쳐진 형태의 `interval`을 리턴하라.

## 풀이
먼저 `start` 기준으로 `intervals`를 정렬한다.  
현재 칸 기준으로 `start`와 `end`를 잡았을 때, 다음 칸의 `start`가 현재 구간의 `end`보다 작으면 구간이 서로 겹치는 것이다.  
구간이 겹치지 않을 때까지 다음 칸으로 이동, 겹치지 않는 구간을 만나면 지금까지의 구간을 하나의 배열로 만든다.  
