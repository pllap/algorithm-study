# 입국심사
[문제 링크](https://programmers.co.kr/learn/courses/30/lessons/43238 )  
[풀이 링크](immigration.py )  

## 문제 설명
`n`명이 입국심사를 위해 줄을 서서 기다린다. 각 심사관이 한 명을 심사하는 데 걸리는 시간이 담긴 배열 `times`가 주어진다.  
모든 사람이 심사를 받는 데 걸리는 최소 시간을 구하라.  

**제한사항**
* `1 <= n <= 1,000,000,000`  
* `1 <= times[i] <= 1,000,000,000`  
* `1 <= times.length <= 100000`  

## 풀이
문제를 보고, 이걸 어떻게 이분탐색으로 풀지? 하는 생각부터 들었다.  
처음에는 구현 문제처럼 매 심사대가 비는 시간을 일일이 계산해서 풀었는데, 어떻게 해도 시간 초과가 떴다...  
이분 탐색으로 구현하는 방법은 다음과 같다.  

`times`를 오름차순으로 정렬한다.  
심사하는 데 걸리는 총 시간의 최솟값 `min_time`을 `0`, 최댓값 `max_time`을 `times[-1] * n` 이라고 하자.  
이후 `min_time`이 `max_time`보다 커질 때까지 다음을 반복한다.  
> 중간값 `expected_time`을 적절히 두 값의 절반으로 두고, 각 심사대의 `time`으로 `expected_time`를 나눈 값의 합계를 `n`과 비교한다.  
> > `expected_time`이 `n`보다 작은 경우, 심사가 너무 빨리 끝난 것이다. 따라서 `min_time`을 `expected_time + 1`로 늘리고, `expected_time`을 새로운 `min_time`과 `max_time`의 중간값으로 둔다.  
> 
> > 그 외의 경우 (`expected_time`이 `n`보다 크거나 같은 경우), 심사에 너무 오랜 시간이 걸린 것이다. 따라서 `max_time`을 `expected_time - 1`로 줄이고, `expected_time`을 새로운 `min_time`과 `max_time`의 중간값으로 둔다.  

위 과정을 전부 마치고 반복문을 빠져나왔을 때 `min_time`이 문제의 답이 된다.  
