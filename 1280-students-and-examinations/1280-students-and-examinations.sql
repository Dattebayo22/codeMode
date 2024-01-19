/* Write your T-SQL query statement below */
select  temp. student_id, temp.student_name, temp.subject_name,
        count(e.subject_name) as attended_exams
    from
    (
        select st.student_id, st.student_name, s.subject_name
        from Students as st
        cross join Subjects as s
    )
    as temp
    left join Examinations as e
    on e.student_id= temp.student_id and e.subject_name=temp.subject_name
    group by temp. student_id, temp.student_name, temp.subject_name
;