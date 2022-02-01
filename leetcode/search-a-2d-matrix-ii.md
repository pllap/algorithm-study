# 240. Search a 2D Matrix II
[문제 링크](https://leetcode.com/problems/search-a-2d-matrix-ii/ )  
[풀이 링크](search-a-2d-matrix-ii.py )  

## 문제 설명
`m * n` 크기의 2차원 배열 `matrix`에서 `target`을 찾는 효율적인 알고리즘을 짜라.  

`matrix`는 다음과 같은 특성을 가진다.  
* 각 행의 정수는 왼쪽에서 오른쪽으로 갈수록 증가한다.  
* 각 열의 정수는 위에서 아래로 갈수록 증가한다.  

**제한사항**
* `1 <= n, m <= 300`  
* `-10^9 <= matrix[i][j] <= 10^9`  

## 풀이
### dfs/bfs
왼쪽 위부터 시작해, 현재 칸의 정수가 `target`보다 작다면 아래/오른쪽 칸으로 진행한다.  
현재 칸이 `target`보다 크다면 이 경로로는 더이상 진행하지 않는다.  
현재 칸이 `target`과 같다면 `True`를 리턴한다.  

### O(m + n)
오른쪽 위 칸에서 시작한다. 왼쪽 아래 칸에서 시작해도 되는데, 아래의 풀이와 반대 방향으로 진행해야 한다.  
현재 칸이 `target`보다 작다면 아래로 진행한다.  
현재 칸이 `target`보다 크다면 왼쪽으로 진행한다.  
현재 칸이 `target`과 같다면 `True`를 리턴한다.  
현재 칸이 `matrix`의 범위를 벗어났다면 `False`를 리턴한다.  