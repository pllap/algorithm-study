# palindrome-number
[문제 링크](https://leetcode.com/problems/palindrome-number/)  
[풀이 링크](palindrome-number.py)

## 문제 설명
인자로 들어온 수가 [회문](https://ko.wikipedia.org/wiki/%ED%9A%8C%EB%AC%B8 )인지 검사한다.

## 풀이
문자열로 바꿔서 풀지, 그냥 풀지 고민하다가 둘 다 풀어 봤다.  
문자열로 바꿔서 풀려면, 문자열을 뒤집어서 원본과 비교한 결과를 리턴하면 된다.  
정수로 풀려면, 변수를 하나 만들고 일의 자리를 새로운 변수의 맨 앞으로 계속 밀어넣으면 된다.

![](../img/palindrome-number.png)  

위는 정수로 푼 결과, 아래는 문자열로 푼 결과다.  
정수로 푼 쪽이 더 빠를 줄 알았는데, 문자열로 바꿔서 푸는 게 더 빨라서 의외였다.
