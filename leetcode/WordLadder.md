# 127. Word Ladder
[문제 링크](https://leetcode.com/problems/permutation-in-string/ )   
[풀이 링크](WordLadder.java )  

## 문제 설명
프로그래머스의 [단어](../programmers/ ) [변환](https://programmers.co.kr/learn/courses/30/lessons/43163 )과 정확히 같은 문제다.  
두 개의 단어 `begin`과 `end`, 단어들이 들어 있는 배열 `wordList`가 주어진다.  
다음과 같은 규칙으로 `beginWord`를 `endWord`로 변환해야 한다.  
> 한 번의 한 개의 알파벳만 바꿀 수 있다.  
> `wordList`에 있는 단어로만 변환할 수 있다.  
`beginWord`를 `endWord`로 변환하는 가장 짧은 경로의 길이를 구하라. 경로가 존재하지 않으면 0을 리턴한다.  

**예시**
```
input:  beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]  
output: 5 ("hit" --> "hot" --> "dot" --> "dog" --> "cog")

input:  beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
output: 0
```

입력 범위:  
`1 <= beginWord.length <= 10`  
`beginWord.length == endWord.length == wordList[i].length`  
`1 <= wordList.length <= 5000`  
`wordList의 모든 단어는 소문자로 이루어져 있으며, 모든 단어는 유일하다.`  

## 풀이
bfs나 dfs를 이용해 변환한다.  
한 글자가 다른 단어를 wordList에서 찾아서, 방문하지 않았으면 방문하는 식으로 구현한다.  
