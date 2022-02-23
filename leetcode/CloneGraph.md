# 133. Clone Graph
[문제 링크](https://leetcode.com/problems/clone-graph/ )  
[풀이 링크](CloneGraph.java )  

## 문제 설명
양방향 경로를 가진 그래프를 나타내는 객체 `node`가 주어진다.  
각 `node`는 다음과 같은 구조를 가진다.
```java
class Node {
    public int val;
    public List<Node> neighbors;
}
```
그래프를 deep copy(clone)해서 리턴하라.  

입력 범위:  
`1 <= Node.val <= 100`  

**제한 사항**
* 그래프에서 노드의 개수는 최소 0개, 최대 100개이다.  
* 각 노드의 val은 유일하다.  
* 모든 노드는 다른 노드와 연결되어 있다.  

## 풀이
dfs 또는 bfs를 이용해 각 노드를 탐사하며 복사해 나간다.  
모든 노드의 `val`이 유일하다는 것을 이용해 `Map`을 이용해서 각 노드를 기록해 가며 진행할 수 있다.  
