# single-number
[문제 링크](https://leetcode.com/problems/https://leetcode.com/problems/single-number/ )   
[풀이 링크](single-number.py )  

## 문제 설명
하나를 제외하고 모든 원소가 두 번씩 등장하는 정수 배열 `nums`가 주어진다. 한 번만 등장하는 원소를 찾는 함수를 작성하라.  

입력 범위:  
`1 <= nums.length <= 3 * 10^4`  
`-3 * 10^4 <= nums[i] <= 3 * 10^4`

## 풀이
### set
set을 하나 만든다. 배열을 순회하며 set에 없는 원소이면 넣고, 있는 원소이면 뺀다.  
배열을 전부 순회한 뒤 set에 남아 있는 원소가 한 번만 등장한 원소이다.  
### xor
int형 변수를 만든다. 배열을 순회하며 변수에 대해 xor 연산을 한다.  
순회가 끝나면 변수에 한 번만 등장한 원소의 값이 담겨 있게 된다.  
