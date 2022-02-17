# 39. Combination Sum
[문제 링크](https://leetcode.com/problems/combination-sum/ )  
[풀이 링크](CombinationSum.java )  

## 문제 설명
모든 원소가 독립적인 정수 배열 `candidates`와 정수 `target`이 주어진다.  
`candidates`의 원소들 중 합이 `target`이 되는 모든 조합을 구하라.  

**예시**
```
Input:  nums = [2, 3, 6, 7], target = 7
Output: [[2, 2, 3], [7]]

Input: nums = [2, 3, 5], target = 8
Output: [[2, 2, 2, 2], [2, 3, 3], [3, 5]]
```

## 풀이  
백트래킹을 이용해 구한다.  
좀 더 효율적으로 구하기 위해 `nums`를 정렬한 뒤 dfs를 이용해 탐사하고, 합이 `target`보다 커지는 경우 바로 나오도록 하면 좀 더 빠르게 동작하게 만들 수 있다.  
