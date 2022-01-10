# middle-of-the-linked-list
[문제 링크](https://leetcode.com/problems/middle-of-the-linked-list/ )   
[풀이 링크](middle-of-the-linked-list.py )  

## 문제 설명
단일 연결 리스트의 `head`가 주어진다.  
연결 리스트의 중간 노드를 리턴하는 함수를 작성하라.  

입력 범위:  
`1 <= Node.val <= 100`  

## 풀이
### 공간 절약
길이를 기억하며 연결 리스트를 끝까지 탐색한 뒤, 길이의 절반만큼 다시 탐색해서 만나는 노드를 리턴한다.  
### 시간 절약
연결 리스트의 끝까지 탐색하며 만나는 모든 노드를 스택에 넣고, 스택의 중앙값을 리턴한다.  
