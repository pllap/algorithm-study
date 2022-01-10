# fibonacci-number
[문제 링크](https://leetcode.com/problems/fibonacci-number/ )   
[풀이 링크](fibonacci-number.py )  

## 문제 설명
피보나치 순열을 나타내는 F를 다음과 같이 정의한다.  
```
F(0) = 0, F(1) = 1
n > 1일 때, F(n) = F(n - 1) + F(n - 2)
```  
`n`이 주어질 때, `F(n)`을 리턴하는 함수를 작성하라.  

입력 범위:  
`0 <= n <= 30`  

## 풀이
[0, 1]로 채워져 있는 리스트를 한 칸씩 계산해서 n까지 채워나간다.  
