# max-area-of-island
[문제 링크](https://leetcode.com/problems/max-area-of-island/ )   
[풀이 링크](max-area-of-island.py )  

## 문제 설명
`m * n` 크기의 이진 행렬이 주어진다.  
위/아래/왼쪽/오른쪽의 네 가지 방향으로 연결된 1들을 하나의 섬으로, 0은 바다로 정의한다.  
가장 넓은 섬의 넓이를 리턴하는 함수를 작성하라.  

입력 범위:  
`m == grid.length`  
`n == grid[i].length`  
`1 <= m, n <= 50`  

## 풀이
dfs 또는 bfs를 이용하여 구현한다.  
