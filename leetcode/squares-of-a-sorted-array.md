# squares-of-a-sorted-array
[문제 링크](https://leetcode.com/problems/squares-of-a-sorted-array/ )   
[풀이 링크](squares-of-a-sorted-array.py )  

## 문제 설명
인자로 **내림차순이 아니게 정렬된** 배열 `nums`가 들어온다.  
`nums`의 **각 원소의 제곱이 오름차순으로 정렬된 배열**을 리턴하는 함수를 작성하라.   

입력 범위:  
`1 <= nums.length <= 10^4`  
`-10^4 <= nums[i] <= 10^4`

## 풀이
절대값을 기준으로 배열을 다시 정렬한 뒤 각 원소를 제곱한다.  
또는 각 원소를 제곱한 뒤 다시 정렬하는 방법도 있겠다.  
그런데 문제에서 `non-decreasing order`라고 했는데... 그냥 `increasing order`라고 부르면 안 되는 건가?  
