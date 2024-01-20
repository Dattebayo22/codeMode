/* Write your T-SQL query statement below */
select main.name
from
(
    select distinct e1.name, count(e2.managerId) as temp
    from Employee e1,Employee e2
    where e1.id=e2.managerId 
    group by e1.name
    having count(e2.managerId)>=5
)as main
left join Employee e
on e.name= main.name;