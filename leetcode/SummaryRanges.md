# 228. Summary Ranges
[문제 링크](https://leetcode.com/problems/summary-ranges/ )   
[풀이 링크](SummaryRanges.java )  

## 문제 설명
오름차순으로 정렬된 정수 배열 `nums`가 주어진다.  
연속하는 숫자들을 다음과 같은 형식에 맞게 담아서 리턴하는 함수를 작성하라.  

**예시**
```
input:  nums = [0,1,2,4,5,7]
output: ["0->2","4->5","7"]
설명: 0,1,2가 연속하므로 0->2, 4,5가 연속하므로 4->5, 7은 혼자이므로 7

input:  nums = [0,2,3,4,6,8,9]
output: ["0","2->4","6","8->9"]
설명: 0은 혼자이므로 0, 2,3,4는 연속하므로 2->4, 6은 혼자이므로 6, 8,9는 연속하므로 8->9
```

**제한사항**
`0 <= nums.length <= 20`  
`-2^31 <= nums[i] <= 2^31 - 1`  
`nums` 의 모든 값은 독립적이다.  

## 풀이
리트코드 데일리 챌린지인데, 문제 번호를 날짜랑 맞췄나 보다.  
문제를 읽으면서 굉장히 불친절하다는 느낌을 받았다.  
문제 링크로 들어가서 원문을 읽어보면 무슨 말인지 알 것이라고 생각한다..  
문제를 이해한다면, 풀이는 굉장히 간단하다.  
연속하는 숫자들의 시작 숫자와 끝 숫자를 문자열에 넣어주고, 시작 숫자와 끝 숫자가 같다면 혼자 넣어주면 된다.  
