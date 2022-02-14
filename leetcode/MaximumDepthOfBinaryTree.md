# 104. Maximum Depth of Binary Tree
[문제 링크](https://leetcode.com/problems/maximum-depth-of-binary-tree/ )   
[풀이 링크](MaximumDepthOfBinaryTree.java )  

## 문제 설명
이진 트리의 루트 노드 `root`가 주어진다. 트리의 최대 깊이를 구하라.  

**예시**
```
Input:  root = [3,9,20,null,null,15,7]
Output: 3

Input:  root = [1,null,2]
Output: 2
```

입력 범위:  
`0 <= 노드의 수 <= 10,000`  
`-100 <= node.val <= 100`  

## 풀이
bfs를 이용해, 큐가 빌 때까지의 단계 수를 구한다.  
