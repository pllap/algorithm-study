# move-zeros
[문제 링크](https://leetcode.com/problems/move-zeroes/ )   
[풀이 링크](move-zeros.py )  

## 문제 설명
인자로 주어진 정수형 배열 `nums`에서, 0이 아닌 원소들의 순서를 유지하며 모든 0을 맨 뒤로 옮겨라.  
**배열의 복사본을 만들지 않고 구현하라.**  

입력 범위:  
`1 <= nums.length <= 10^4`  
`-2^31 <= nums[i] <= 2^31 - 1`  

## 풀이
배열의 맨 뒤에서부터 0을 찾아서 제거한다.  
제거한 0들을 원본 배열의 뒤에 덧붙인다.  
