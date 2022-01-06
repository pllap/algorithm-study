# first-bad-version
[문제 링크](https://leetcode.com/problems/first-bad-version/ )   
[풀이 링크](first-bad-version.py)  

## 문제 설명
`n`개의 버전 중 `r`번째 버전이 `bad`하면 이후의 버전도 모두 `bad`한 버전이다.  
최초의 `bad`한 버전을 찾는 함수를 작성해라.  
버전 `n`이 `bad`한지 판단하는 함수 `isBadVersion(n: int) -> bool`이 주어진다.  
이 함수가 가능한 한 적게 호출되어야 한다.  

입력 범위: `1 <= bad <= n <= 2^31 - 1`  

## 풀이
대체 어떤 괴물 같은 PM이 버전을 21억 개나 릴리즈하지...?  
입력 범위가 크기 때문에 `O(n)`으로 풀려고 하면 시간 초과가 뜬다.  
따라서 이분 탐색을 이용해서 찾는다.  
