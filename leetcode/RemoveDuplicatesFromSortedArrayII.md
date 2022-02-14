# 80. Remove Duplicates from Sorted Array II
[문제 링크](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/ )   
[풀이 링크](RemoveDuplicatesFromSortedArrayII.java )  

## 문제 설명
오름차순으로 정렬된 배열 `nums`가 주어진다.  
nums의 레퍼런스에서 중복되는 원소를 최대 두 개만 남기고 제거한 뒤, 남겨진 원소의 개수를 리턴하라.  

**예시**
```
Input:  nums = [1, 1, 1, 2, 2, 3]
Output: 5, nums = [1, 1, 2, 2, 3, _]

Input: nums = [0, 0, 1, 1, 1, 1, 2, 3, 3]
Output: 7, nums = [0, 0, 1, 1, 2, 3, 3, _, _]
```

입력 범위:  
`1 <= nums.length <= 30,000`  
`-10,000 <= nums[i] <= 10,000`  

## 풀이
한 번만 등장하는 원소가 있으면 인덱스를 한 칸 뒤로, 두 번 이상 등장하는 원소면 인덱스를 값이 달라질 때까지 뒤로 옮겨가며 `nums`를 조작한다.  
