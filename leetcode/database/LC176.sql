/*
Employee
+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  | PK
| salary      | int  |
+-------------+------+

문제 주소: https://leetcode.com/problems/second-highest-salary/
두 번째로 높은 봉급을 구하는 쿼리를 작성하라. 두 번째로 높은 봉급이 존재하지 않으면 NULL로 표시한다.
*/

-- 방법 1
-- 최댓값보다 작은 값 중 최댓값을 찾는다.
SELECT MAX(`salary`) as `SecondHighestSalary`
FROM `Employee`
WHERE `salary` < (SELECT MAX(`salary`) FROM `Employee`);

-- 방법 2
-- 서브 쿼리와 LIMIT-OFFSET 구문, IFNULL을 이용한다.
SELECT IFNULL(
    (SELECT DISTINCT `Employee`.`salary`
    FROM `Employee`
    ORDER BY `salary` DESC
    LIMIT 1 OFFSET 1), NULL
) as `SecondHighestSalary`


-- SELECT IFNULL(salary, NULL) as SecondHighestSalary
-- FROM Employee
-- ORDER BY salary
-- LIMIT 1 OFFSET 1;

-- SELECT
--     CASE
--         WHEN (salary = '') THEN NULL
--     ELSE salary
--     END as SecondHighestSalary
-- FROM Employee
-- ORDER BY salary
-- LIMIT 1 OFFSET 1;

-- SELECT
--     IF (salary IS NULL or salary = '', NULL, salary) as SecondHighestSalary
-- FROM Employee
-- ORDER BY salary
-- LIMIT 1 OFFSET 1;

-- SELECT `salary` as `SecondHighestSalary`
-- FROM (
--     SELECT `Employee`.*, ROW_NUMBER() OVER(ORDER BY `salary`) `rowNum`
--     FROM `Employee`
-- ) `r`
-- WHERE `r`.rowNum = 2;
