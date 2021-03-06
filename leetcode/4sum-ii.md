# 454. 4Sum II
[문제 링크](https://leetcode.com/problems/4sum-ii/ )   
[풀이 링크](4sum-ii.py )  

## 문제 설명
네 개의 정수 배열 `nums1`, `nums2`, `nums3`, `nums4`가 주어진다. 길이는 모두 `n`으로 동일하다.  
`0 <= i, j, k, l < n`인 `i`, `j`, `k`, `l`에 대해 `nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0` 이 되는 조합의 개수를 구하라.  

입력 범위:  
`1 <= n <= 200`  

## 풀이
### 투 포인터
`nums1`과 `nums2`의 값을 결정해 두고, `nums3`과 `nums4`에 대해서는 투 포인터를 돌린다.  
`nums3`과 `nums4`가 정렬된 상태에서, `nums3`은 앞에서부터, `nums4`는 뒤에서부터 진행한다.  
네 수의 합이 0보다 크다면 `nums4`에 대한 인덱스를 하나 줄인다.  
네 수의 합이 0보다 작다면 `nums3`에 대한 인텍스를 하나 늘린다.  
네 수의 합이 0과 같다면 count한다.  
`O(n^3)`. 아쉽게도 이 방법으로는 통과할 수 없었다. 파이썬이 아닌 다른 언어였다면 통과가 가능했을지도..?  

### 해시 테이블
`nums1`과 `nums2`을 이중 반복으로 순회하며, 둘을 더한 값을 해시 테이블에 넣는다.  
한 번 이상 등장한 값은 value에 등장 횟수를 기록한다.  
`nums3`과 `nums3`을 이중 반복으로 순회하며, 둘을 더한 값의 반대 부호의 값이 해시 테이블에 있는지 확인한다.  
있다면 count한다.  
