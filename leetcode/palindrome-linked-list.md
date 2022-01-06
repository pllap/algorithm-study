# palindrome-linked-list
[문제 링크](https://leetcode.com/problems/palindrome-linked-list/)   
[풀이 링크](two-sum.py)  

## 문제 설명
인자로 주어진 단방향 Linked List가 회문인지 검사한다.

## 풀이
문제를 읽자마자 스택이랑 큐가 생각났다. 반가운 얼굴들...  
진짜 큐로 푼 건 아니고, 스택이랑 똑같이 데이터를 쌓은 다음에 뒤집어서 데이터를 큐에 집어넣은 것처럼 만들었다.  
원래 `queue.reverse()` 하는 식으로 리스트를 뒤집어서 비교했었는데 속도가 이상하게 느렸다(1130ms). 왜 이런 걸까 생각하다가 [전 문제](palindrome-number.md)에서 사용했던 `queue[::-1]` 을 쓰면 속도가 더 빨라질까 궁금해서 해 봤는데 무려 300ms나 빠른 결과가 나왔다(807ms).
