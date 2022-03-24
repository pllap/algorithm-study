/*
Person
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| personId    | int     | PK
| lastName    | varchar |
| firstName   | varchar |
+-------------+---------+
Address
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| addressId   | int     | PK
| personId    | int     |
| city        | varchar |
| state       | varchar |
+-------------+---------+

문제 주소: https://leetcode.com/problems/combine-two-tables/
Person 테이블의 각 사람의 first name, last name, city, state를 조회하는 쿼리를 작성하라.  
Address 테이블에 personId 정보가 없는 경우, 해당 테이블의 데이터에 대해서는 null로 처리한다.  

풀이:
LEFT JOIN을 이용하면 간단하게 해결할 수 있다.
(A LEFT JOIN B ON A.id = B.id)
*/

SELECT Person.firstName, Person.lastName, Address.city, Address.state
FROM Person
LEFT JOIN Address
ON Person.personId = Address.personId;
