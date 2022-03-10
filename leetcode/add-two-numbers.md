# add-two-numbers
[문제 링크](https://leetcode.com/problems/add-two-numbers/ )  
풀이 링크  
* [Python](add-two-numbers.py )  
* [Java](LC2.java )  

## 문제 설명
두 개의 단일 연결 리스트가 주어진다.  
리스트에는 양의 정수의 각 자릿수가 역순으로 저장되어 있다.  
두 양의 정수의 합의 각 자릿수가 역순으로 저장된 연결 리스트를 만들어 리턴하는 함수를 작성하라.  

## python 풀이  
주어진 연결 리스트들을 역순으로 읽어서 정수로 만들고, 계산한 결과를 새로운 연결 리스트에 역순으로 넣는다.  

## java 풀이
python과 달리 정수로 변환해서 풀면 오버플로우가 발생해서 풀 수 없으므로 한 자리씩 더해 가면서 구한다.  
