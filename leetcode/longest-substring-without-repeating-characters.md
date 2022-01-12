# longest-substring-without-repeating-characters
[문제 링크](https://leetcode.com/problems/longest-substring-without-repeating-characters/ )   
[풀이 링크](longest-substring-without-repeating-characters.py )  

## 문제 설명
문자열 `s`에서, 같은 글자가 두 번 이상 쓰이지 않는 가장 긴 부분 문자열의 길이를 계산해서 리턴하는 함수를 작성하라.  

입력 범위:  
`0 <= s.length <= 5 * 10^4`  

## 풀이
부분 문자열의 왼쪽과 오른쪽을 가리키는 변수를 만든다. 초기값은 각각 0, 1로 한다.  
오른쪽이 문자열의 끝을 가리킬 때까지 다음 두 줄을 반복한다.  
부분 문자열의 길이가 지금까지 나온 부분 문자열의 길이 중 최대인지 체크한다.  
현재 상태의 부분 문자열에 두 번 이상 등장하는 문자가 없으면 오른쪽을, 있으면 왼쪽을 오른쪽으로 한 칸 움직인다.  
