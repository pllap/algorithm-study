# 5. Longest Palindromic Substring
[문제 링크](https://leetcode.com/problems/longest-palindromic-substring/ )  
[풀이 링크](LC5.java )  

## 문제 설명
문자열 `s`가 주어진다. 가장 긴 회문 부분 문자열을 구하라.  

**예시**
```
"babad" --> "bab", "aba"
"cbbd" --> "bb"
```

**제한 사항**  
* `1 <= s.length <= 1,000`  
* `s`에는 영문자와 숫자로만 구성되어 있다.  

## 풀이
각 인덱스에서 부분 문자열을 양쪽으로 확장하며 회문인지 검사한다.  
가장 긴 회문을 기억해 두었다가 반환한다.  
