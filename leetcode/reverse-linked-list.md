# reverse-linked-list
[문제 링크](https://leetcode.com/problems/reverse-linked-list/ )  
[풀이 링크](reverse-linked-list.py )  

## 문제 설명
단방향 연결 리스트의 `head`가 주어진다. 리스트를 거꾸로 뒤집어서 리턴하는 함수를 작성하라.  

입력 범위:  
`-5000 <= Node.val <= 5000`  

## 풀이  
### 스택
리스트의 끝까지 가면서 스택에 쌓고, 스택에서 꺼내가면서 새로운 리스트를 생성한다.  
### 다른 방법
head를 한 칸씩 전진시켜 가면서 노드를 만든다.  
이전 노드를 기억해 가면서, 현재 head 값에 맞는 노드를 만들고 이전 노드를 가리키게 만든다.  
