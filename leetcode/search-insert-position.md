# search-insert-position
[문제 링크](https://leetcode.com/problems/search-insert-position/ )  
[풀이 링크](search-insert-position.py )  

## 문제 설명
인자로 정렬된 리스트와 목표값이 주어진다.  
리스트에 목표값이 존재하면 인덱스를 리턴하고, 존재하지 않으면 목표값이 들어갈 인덱스를 리턴한다.  
`O(log n)`의 시간복잡도를 가지는 알고리즘으로 구현하라.  

## 풀이
이분 탐색을 이용해서 구현한다. 단, 좌/우 인덱스 값의 처리에 유의해서 구현한다.  
