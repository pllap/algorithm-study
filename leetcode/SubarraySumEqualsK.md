# 560. Subarray Sum Equals K
[문제 링크](https://leetcode.com/problems/subarray-sum-equals-k/)  
[풀이 링크](SubarraySumEqualsK.java)  

## 문제 설명
정수 배열 `nums`와 정수 `k`가 주어진다.  
구간의 합이 `k`가 되는 모든 부분 배열의 개수를 구하라.  

**제한사항**
* `1 <= nums.length <= 20,000`  
* `-1,000 <= nums[i] <= 1,000`  
* `-10,000,000 <= k <= 10,000,000`  

## 풀이
문제를 보면 투 포인터부터 떠오를 텐데, [`nums`의 요소에 음의 정수도 포함되기 때문에](https://leetcode.com/problems/subarray-sum-equals-k/discuss/301242/General-summary-of-what-kind-of-problem-can-cannot-solved-by-Two-Pointers) 투 포인터로는 해결할 수 없다.  

`i`번째 인덱스까지의 합을 저장하는 `sums` 배열을 만든다.  
`sums[i] - sums[j]`는 `j`부터 `i`까지의 구간의 합과 같으므로, 구간의 합이 `k`와 같은 경우의 개수를 세면 된다.  
