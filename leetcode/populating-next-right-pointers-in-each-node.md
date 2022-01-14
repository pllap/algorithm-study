# populating-next-right-pointers-in-each-node
[문제 링크](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/ )  
[풀이 링크](populating-next-right-pointers-in-each-node.py )  

## 문제 설명
완전 이진 트리의 루트 `root`가 주어진다. 트리의 한 레벨의 다음 노드를 `next`에 담아서 리턴하라. 다음 노드가 없으면 `null`로 처리한다.

## 풀이
bfs를 이용해 큐에 옮긴 뒤, 레벨에 따라 처리한다.  
