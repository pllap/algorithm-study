# binary-search
[문제 링크](https://leetcode.com/problems/binary-search/ )   
[풀이 링크](binary-search.py)  

## 문제 설명
오름차순으로 정렬된 정수 배열 `nums`와 정수 `target`이 주어진다.  
`nums`에서 `target`을 찾는 함수를 작성해라. `target`을 찾을 수 없으면 `-1`을 반환한다.  
반드시 `O(log n)`을 만족해야 한다.

## 풀이
문제의 제목에 답이 있다. 값이 나을 때까지 이분 탐색으로 검사하면 된다.  
코드에서는 `left`, `right`, `mid`를 나누어 구현했다.

처음에는 첫 줄에 다음과 같이 예외 처리했다.  
```python
if target not in nums
```
하지만 파이썬의 `not in`은 `O(n)`으로 작동하는 기능이라, 지우고 다시 풀었다.  
잘 짜면 내 풀이보다 `if`문의 개수를 줄일 수 있겠다.
