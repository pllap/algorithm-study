# H-Index
[문제 링크](https://programmers.co.kr/learn/courses/30/lessons/42747 )  
[풀이 링크](h-index.py )  

## 문제 설명
과학자의 논문 `n`편 중 `h`번 이상 인용된 논문이 `h`편 이상이면 `h`의 최댓값을 이 과학자의 h-index라고 한다.  
각 논문의 인용 회수가 주어질 때, h-index를 구하라.  
[위키백과 h-index 문서](https://ko.wikipedia.org/wiki/H_%EC%A7%80%EC%88%98)

입력 범위:  
`1 <= 논문의 수 <= 1000`  
`0 <= 인용 횟수 <= 10000`  

## 풀이  
먼저 주어진 배열을 정렬하고, h를 배열의 최댓값으로 두고 시작해서 인용 수가 h편 이상인 논문의 수가 h보다 많아질 때까지 h를 줄여 나간다.  
문제를 보고 낚여서 고생을 좀 했는데, **h-index는 배열의 인덱스일 필요가 없다.**  