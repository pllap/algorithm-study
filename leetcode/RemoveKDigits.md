# 525. Contiguous Array
[문제 링크](https://leetcode.com/problems/remove-k-digits/ )  
[풀이 링크](RemoveKDigits.java )  

## 문제 설명
0 이상의 정수를 나타내는 문자열 `num`과 정수 `k`가 주어진다.  
`num`에서 `k`개의 자릿수를 지웠을 때의 최소값을 구하라.  

**예시**
```
Input:  num = "1432219", k = 3
Output: "1219"

Input:  num = "10200", k = 1
Output: "200"

Input:  num = "10", k = 2
Output: "0"
```

## 풀이
현재 자릿수의 숫자보다 다음 자릿수의 숫자가 작을 때 현재 자릿수의 숫자를 버리는 게 가능한 최소값이 된다.  
k번 반복한 결과를 형식에 맞춰 리턴하면 된다.  
