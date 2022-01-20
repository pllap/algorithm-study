# 3sum
[문제 링크](https://leetcode.com/problems/3sum/ )  
[풀이 링크](3sum.py )  

## 문제 설명
정수 배열 `nums`가 주어진다.  
인덱스 `i`, `j`, `k`에 대해, `i != j != k` 이면서 `nums[i] + nums[j] + nums[k] == 0`인 모든 조합을 찾는 함수를 작성하라.  

입력 범위:  
`0 <= nums.length <= 3000`  
`-10^5 <= nums[i] <= 10^5`  

## 풀이  
반복해야 하는 인덱스가 세 가지라 시간 복잡도가 최소 O(n^3)이므로, 완전탐색으로는 못 푼다.  
인덱스 하나를 잡고 나머지 두 인덱스에 대해 투 포인터를 적용하면 된다.  