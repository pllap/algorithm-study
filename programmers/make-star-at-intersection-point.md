# 교점에 별 만들기
[문제 링크](https://programmers.co.kr/learn/courses/30/lessons/87377 )  
[풀이 링크](make-star-at-intersection-point.py )  

## 문제 설명
`ax + by + c = 0`으로 표현할 수 있는 직선 `n`개가 주어질 때, 교점 좌표 중 정수 좌표에 별을 그려라.  

## 풀이
서로 다른 두 직선을 고르고 정수 교점을 찾아 리스트에 넣는다. 찾는 방법은 문제의 제약 조건에 제공되어 있다.  
리스트의 각 좌표를 이용해 영역을 만들고, 별을 찍으면 된다.  
