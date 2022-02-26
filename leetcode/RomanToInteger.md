# 13. Roman to Integer
[문제 링크](https://leetcode.com/problems/roman-to-integer/ )   
[풀이 링크](RomanToInteger.java )  

## 문제 설명
로마 숫자를 표현한 문자열 `s`가 주어진다.  
주어진 로마 문자를 `int`형 정수로 변환하라.  
각 로마 문자가 의미하는 값은 다음과 같다.  
```
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```

**예시**
```
III --> 3
IV --> 4
IX --> 9
LVIII --> 58
MCMXCIV --> 1994
```

입력 범위:  
`1 <= s.length <= 15`  
`s는 무조건 valid한 형태로 제공된다.`  

## 풀이
문자열의 각 문자를 순회하며 정수값에 더한다.  
단, 뒤 문자보다 값이 작은 경우에는 뺀다.  
