# median-of-two-sorted-arrays
[문제 링크](https://leetcode.com/problems/median-of-two-sorted-arrays/ )   
[풀이 링크](median-of-two-sorted-arrays.py )  

## 문제 설명
길이가 다를 수 있는 정렬된 두 배열 `nums1`와 `nums2`가 인자로 주어진다.  
두 배열의 중앙값을 리턴하는 함수를 작성하라.  
`O(log (m+n))`의 시간 복잡도로 작성하라.  

입력 범위:  
`nums1.length == m`  
`nums2.length == n`  
`0 <= m <= 1000`  
`0 <= n <= 1000`  
`1 <= m + n <= 2000`  
`-10^6 <= nums1[i], nums2[i] <= 10^6`  

## 풀이
merge sort에서 devide한 배열을 merge하는 방식을 이용해 구현한다.  
