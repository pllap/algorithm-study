# 169. Majority Element
[문제 링크](https://leetcode.com/problems/majority-element/ )  
풀이 링크  
* [Python](majority-element.py )  
* [Java](MajorityElement.java )  
## 문제 설명
길이가 `n`인 리스트 `nums`가 주어진다. 리스트의 최빈값을 리턴하는 함수를 작성하라.  
최빈값은 반드시 `n/2`개보다 많이 들어 있다.

## 풀이
### 해시
리스트를 순회하며 해시에 넣고 카운트한다.  
카운트가 n/2를 넘는 순간 해당 값을 리턴한다.
### 정렬
최빈값은 `n/2`개보다 많이 있기 때문에, 정렬하면 반드시 리스트의 중앙에 위치하게 된다.  
정렬된 리스트의 중간 인덱스의 값을 리턴한다.  
