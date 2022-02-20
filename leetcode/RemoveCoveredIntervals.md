# 1288. Remove Covered Intervals
[문제 링크](https://leetcode.com/problems/remove-covered-intervals/ )  
[풀이 링크](RemoveCoveredIntervals.java )  

## 문제 설명
2차원에서의 구간 하나를 `[a, b)`라고 정의한다.  
여러 개의 구간이 들어 있는 2차원 배열 `intervals` 가 주어진다.  
다른 구간에 포함되는 모든 구간을 제거하고 남은 구간의 개수를 구하라.  

입력 범위:  
`1 <= intervals.length <= 1,000`  
`intervals[i].length == 2`  
`0 <= l <= r <= 100,000`  

## 풀이
`intervals` 배열을 구간의 시작점을 기준으로 정렬한 뒤, 현재 구간과 뒤 구간이 포함 관계에 있지 않은 경우에만 구간의 개수를 센다.  
