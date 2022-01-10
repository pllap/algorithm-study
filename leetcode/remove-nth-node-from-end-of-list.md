# remove-nth-node-from-end-of-list
[문제 링크](https://leetcode.com/problems/remove-nth-node-from-end-of-list/ )   
[풀이 링크](remove-nth-node-from-end-of-list.py )  

## 문제 설명
단일 연결 리스트의 `head`와 정수 `n`이 주어진다.  
연결 리스트의 뒤에서 `n`번째 값을 제거하고, 리스트의 `head`를 리턴하는 함수를 작성하라.    

입력 범위:  
`sz: 연결 리스트 길이`  
`1 <= sz <= 30`  
`0 <= Node.val <= 100`  
`1 <= n <= sz`

## 풀이
연결 리스트를 순회하며 만나는 node들을 새로운 리스트(이하 배열)에 넣는다.  
이후 배열을 이용하여 `-n-1`번째 인덱스의 노드의 `next` 값을 다음 노드로 연결한다.  
이때 예외 처리에 주의한다.  
