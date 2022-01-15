# climbing-stairs
[문제 링크](https://leetcode.com/problems/min-cost-climbing-stairs/ )  
[풀이 링크](min-cost-climbing-stairs.py )  

## 문제 설명
`n`칸짜리 계단을 오른다고 하자. 각 칸을 오르는 데 드는 비용이 주어진다. 한번에 한 칸 또는 두 칸을 오를 수 있다.    
최소 비용으로 꼭대기까지 오르는 방법을 구하라.  

## 풀이  
n칸까지 가는 최소 비용은 n-1칸까지 가는 최소 비용과 n-2칸까지 가는 최소 비용의 최소값인 것을 이용해서 해결한다.  
