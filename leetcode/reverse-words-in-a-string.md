# reverse-array-in-a-string
[문제 링크](https://leetcode.com/problems/reverse-words-in-a-string/ )   
[풀이 링크](reverse-words-in-a-string.py )  

## 문제 설명
인자로 문자열 `s`를 공백 하나 간격으로 역순으로 만들어 리턴하는 함수를 작성하라.  
`s`는 영어 대소문자, 숫자, 공백으로 이루어져 있다.  
`s`에는 최소 한 개의 단어가 있다.  

예시:
```
"the sky is blue" -> "blue is sky the"
"  hello world  " -> "world hello"
"a good   example" -> "example good a"
```

입력 범위:  
`1 <= s.length <= 10^4`  
`-2^31 <= nums[i] <= 2^31 - 1`  
`0 <= k <= 10^5`

## 풀이
공백을 기준으로 단어를 잘라 스택에 넣고, 하나씩 스택에서 꺼내 리턴할 문자열에 공백과 함께 덧붙인다.  
