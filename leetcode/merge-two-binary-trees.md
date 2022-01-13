# merge-two-binary-trees
[문제 링크](https://leetcode.com/problems/merge-two-binary-trees/ )  
[풀이 링크](merge-two-binary-trees.py )  

## 문제 설명
이진 트리 `root1`과 `root2`가 주어진다.  
두 트리의 각 노드의 값을 합친 트리를 리턴하는 함수를 작성하라.  

예시:
```
    1         2           3
  3   2  +  1   3   =   4   5
5            4   7     5 4   7
```

## 풀이
dfs를 이용해 두 트리를 동시에 순회하며 각 노드의 값을 더한다.
