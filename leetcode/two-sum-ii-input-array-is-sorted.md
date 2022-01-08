# two-sum-ii-input-array-is-sorted
[문제 링크](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/ )   
[풀이 링크](two-sum-ii-input-array-is-sorted.py )  

## 문제 설명
인자로 오름차순으로 정렬된 정수형 배열 `numbers`이 주어진다. 합이 `target`이 되는 두 원소가 각각 몇 번째 숫자인지 리스트에 담아서 리턴하는 함수를 구현하라.  
`numbers`에서 합이 `target`이 되는 `number1`, `number2`의 쌍은 **유일하다.**  

입력 범위:  
`2 <= numbers.length <= 3 * 10^4`  
`-1000 <= numbers[i] <= 1000`  
`-1000 <= target <= 1000`  
`1 <= index1 < index2 <= numbers.length`  

## 풀이
혹시나 하고 `O(n^2)`로 풀었더니 역시나 시간 초과가 떴다.  
`numbers`가 정렬되어 있다는 것에서 착안, 투 포인터를 이용해서 풀었다.  
합이 `target`보다 커질 때까지 두 인덱스를 함께 붙여서 뒤로 늘리고, `target`에 맞춰서 간격을 조절한다.  
