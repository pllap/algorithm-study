# 22. Generate Parentheses
[문제 링크](https://leetcode.com/problems/generate-parentheses/ )   
[풀이 링크](generate-parentheses.py )  

## 문제 설명
정수 `n`이 주어진다. `n`쌍의 모든 정상적인 괄호의 조합을 만들어라.  

## 풀이
bfs와 백트래킹 방식을 조합해서 푼다.  
여는 괄호의 개수와 닫는 괄호의 개수를 따로 세며, 여는 괄호와 닫는 괄호 모두 n개가 될 때까지 반복한다.  
닫는 괄호의 개수가 여는 괄호보다 작은 경우에만 닫는 괄호를 넣어서 잘못된 괄호가 들어가는 것을 방지하면서 푼다.  
