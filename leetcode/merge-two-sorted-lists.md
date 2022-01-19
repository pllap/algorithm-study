# merge-two-sorted-lists
[문제 링크](https://leetcode.com/problems/merge-two-sorted-lists/ )  
[풀이 링크](merge-two-sorted-lists.py )  

## 문제 설명
정렬된 두 개의 단방향 연결 리스트가 주어진다.  
정렬을 유지한 채로 병합한 리스트를 반환하는 함수를 작성하라.  

입력 범위:  
`-100 <= Node.val <= 100`  

## 풀이  
새로운 리스트를 만들어 어느 한 쪽이 빌 때까지 작은 쪽의 노드의 값을 넣어 간다.  
한 쪽이 비었으면 나머지 쪽의 남은 노드들을 그대로 복사해 온다.  
