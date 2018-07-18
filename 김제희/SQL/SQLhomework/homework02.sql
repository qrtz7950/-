select * from s_emp;

select *
    from s_emp s;

select s.name,s.title,s.salary,s.dept_id
    from s_emp s
    where (dept_id = 118 or dept_id = 112)
      and (title like '%����' or title = '���')
      and salary between 1500 and 4000;

select s.name,s.title,s.salary,s.dept_id
    from s_emp s
    where manager_id is null;

select s.name,s.title,s.salary,s.dept_id
    from s_emp s
    where title like '%����'
      and salary >= 3000;

select s.name,s.title,s.salary,s.dept_id
    from s_emp s
    where (title like '%����' or title like '%����')
      and dept_id in (112, 113, 117, 118)
      and salary between 2300 and 3000;

select s.*,s.name,s.title,s.salary,s.dept_id
    from s_emp s
    where (title like '%����' or title like ('%����'))
      and to_char(start_date) like '__/03/__';

select s.name,s.title,s.salary * 16 + 1000 as ��������
    from s_emp s;
    
select s.name|| ' ' ||s.title || '�� �޿�' ||s.salary as �����޿�
    from s_emp s;

select *
    from s_emp s
    where commission_pct is not null
      and manager_id is not null
      and salary>2500;