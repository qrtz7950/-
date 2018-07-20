-- 1��
select name, title, dept_id 
    from s_emp
    where dept_id in(112, 118) 
      and title in('����', '���')
      and salary between 1500 and 4000;

-- 2��
select name, title, salary
    from s_emp
    where manager_id is null;
    
-- 3��
select name, title, salary
    from s_emp
    where title like '%����'
      and salary >= 3000;
    
-- 4��
select name, title, salary
    from s_emp
    where (title like '%����' or title = '����')
      and dept_id in(112,113,117,118)
      and salary between 2300 and 3000;

-- 5��
select name, title, salary, start_date
    from s_emp
    where (title like '%����' or title = '����')
      and to_char(start_date, 'MM') like '03';

-- 6��
select name, title, salary*16 as ��������
    from s_emp;
    
-- 7��
select name ||' '|| title ||'�� �޿�' || salary as "���� �޿�"
    from s_emp;
    
-- 8��
select name, title, salary
    from s_emp
    where commission_pct is not null
      and manager_id is not null
    order by salary asc;