# flood-fill
[문제 링크](https://leetcode.com/problems/flood-fill/ )   
[풀이 링크](flood-fill.py )  

## 문제 설명
[Flood Fill 알고리즘에 대한 설명](https://ko.wikipedia.org/wiki/%ED%94%8C%EB%9F%AC%EB%93%9C_%ED%95%84)  

인자로 이미지를 나타내는 2차원 배열 `image`, 시작 좌표를 나타내는 `sr`, `sc`, 바꿀 색상을 나타내는 `newColor`가 주어진다.  
주어진 인자에 맞게 Flood Fill을 적용한 상태의 이미지를 리턴하라.  

입력 범위:  
`m == images.length`  
`n == images[i].length`  
`1 <= m, n <= 50`  
`0 <= images[i][j], newColor <= 2^16`  
`0 <= sr < m`  
`0 <= sc < m`  

## 풀이
dfs 또는 bfs를 이용하여 구현한다.  
