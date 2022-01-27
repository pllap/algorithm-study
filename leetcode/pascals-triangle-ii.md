# 119. Pascal's Triangle II
[문제 링크](https://leetcode.com/problems/pascals-triangle-ii/ )  
[풀이 링크](pascals-triangle-ii.py )  

## 문제 설명
파스칼 삼각형에서 위에서 `rowIndex`번째의 줄을 리턴하라 (rowIndex는 0부터 시작한다).  

**예시**
```
    1      -->  rowIndex = 0
   1 1     -->  rowIndex = 1
  1 2 1    -->  rowIndex = 2
 1 3 3 1   -->  rowIndex = 3
1 4 6 4 1  -->  rowIndex = 4
```

## 풀이
rowIndex에 도달할 때까지 한 줄씩 파스칼 삼각형을 만든다.  
