# 171. Excel Sheet Column Number
[문제 링크](https://leetcode.com/problems/excel-sheet-column-number/ )  
[풀이 링크](ExcelSheetColumnNumber.java )  

## 문제 설명
액셀에서는 각 행을 `A`, `B`, `C`, ..., `Z`, `AA`, `AB`, ... 로 표현한다.  
각 행의 이름을 나타내는 문자열 `columnTitle`이 주어질 때, 이 행의 번호를 구하라.  
`columnTitle`은 알파벳 대문자로 이루어져 있다.  

**예시**
```
A -> 1  
B -> 2  
C -> 3  
...  
Z -> 26  
AA -> 27  
AB -> 28  
...
```

입력 범위:  
`1 <= columnTitle.length <= 7`  
`["A", "FXSHRXW"]의 범위 내에서 주어진다.`  

## 풀이
각 자릿수마다 26이 곱해지는 것을 이용해 푼다.  
