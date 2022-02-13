# 78. Subsets
[문제 링크](https://leetcode.com/problems/subsets/ )   
[풀이 링크](Subsets.java )  

## 문제 설명
모든 원소가 독립적인 정수 배열 `nums`가 주어진다.  
배열의 가능한 모든 부분집합을 구하라.  

**예시**
```
input:  nums = [1, 2, 3]
output: [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]

input:  nums = [0]
output: [[], [0]]
```

입력 범위:  
`1 <= nums.length <= 10`  
`-10 <= nums[i] <= 10`  

## 풀이
백트래킹을 이용해, 만나는 모든 경우를 answer에 담는다.  
단 다음 반복은 현재 원소 바로 뒤의 원소부터 시작하게 만든다.  
