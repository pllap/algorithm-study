# 389. Find the Difference
[문제 링크](https://leetcode.com/problems/find-the-difference/ )  
[풀이 링크](find-the-difference.py )  

## 문제 설명
문자열 `s`와 `t`가 주어진다. `t`는 `s`에 문자 하나를 더한 문자열이다.  
`t`에 더해진 문자는 무엇인지 구하라.  

**제한사항**
* `s`와 `t`는 영어 소문자로 이루어진 문자열이다.  
* `0 <= s.length <= 1,000`  
* `t.length == s.length + 1`  

## 풀이
`s`의 각 문자의 개수와 `t`의 각 문자의 개수를 센다.  
개수가 서로 다른 문자를 찾아서 리턴한다.  
