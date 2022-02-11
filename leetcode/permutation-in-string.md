# 567. Permutation in String
[문제 링크](https://leetcode.com/problems/permutation-in-string/ )   
풀이 링크  
* [Python](permutation-in-string.py )  
* [Java](PermutationInString.java )  

## 문제 설명
문자열 `s1`과 `s2`가 주어진다. `s2` 안에 `s1`의 순열이 포함되면 `true`를, 아니면 `false`를 반환하는 함수를 작성하라.  


입력 범위:  
`1 <= s1.length, s2.length <= 10^4`  

## 풀이
s1의 순열을 일일이 구할 필요는 없는 문제다.  
s1의 길이만큼의 간격으로 s2를 잘라서, 글자의 개수가 일치하는지 확인한다.  
일치하는 게 나오면 true를, 끝까지 일치하는 게 나오지 않으면 false를 리턴한다.  
