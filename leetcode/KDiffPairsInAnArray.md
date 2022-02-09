# 532. K-diff Pairs in an Array
[문제 링크](https://leetcode.com/problems/k-diff-pairs-in-an-array/ )  
[풀이 링크](KDiffPairsInAnArray.java )  

## 문제 설명
정수 배열 `nums`와 정수 `k`가 주어진다.  
차가 `k`인 두 원소의 쌍의 개수를 구하라. 중복되는 쌍이 있다면 하나로 친다.  

**제한사항**
* `abs(nums[i] - nums[j]) == k`  
* `0 <= i < j < nums.length <= 10,000`  
* `-10,000,000 <= nums[i] <= 10,000,000`  
* `0 <= k <= 10,000,000`

## 풀이

### O(n^2)
`i`와 `j`로 이중 반복문을 돌려서, 차가 `k`가 되는 쌍을 set에 넣는다.  
set의 길이가 답이 된다.  

### O(n)
`i - j = k`이면 `i = j + k`인 것을 이용한다.  
`k`가 0인 경우에는 두 번 이상 등장하는 원소가 있는지만 찾으면 되므로, 먼저 걸러 준다.  
이후 `nums`를 순회하며 set에 `i`를 넣어 주고, 다시 한 번 순회하며 `i`와 같은 `j + k`가 있는지 찾는다.  
