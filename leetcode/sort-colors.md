# 3sum
[문제 링크](https://leetcode.com/problems/sort-colors/ )  
[풀이 링크](sort-colors.py )  

## 문제 설명
정수 배열 `nums`가 주어진다. `0`, `1`, `2`는 각각 red, white, blue의 색상을 나타낸다.  
red, white, blue의 순서로 같은 색상끼리 인접하도록 정렬하라.  
**라이브러리에서 제공되는 정렬 함수를 사용하지 않고 구현해야 한다.**

입력 범위:  
`1 <= nums.length <= 300`  
`nums[i] == 0 or 1 or 2`  

## 풀이  
0, 1, 2 각각의 개수를 센 뒤 각 개수만큼 원본 배열에 덮어씌운다.  
