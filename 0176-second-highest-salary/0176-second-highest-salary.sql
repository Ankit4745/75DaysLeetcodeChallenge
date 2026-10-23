# Write your MySQL query statement below
 select MAX(e.salary) as SecondHighestSalary from Employee e where salary < (Select MAX(e.salary) from Employee e);