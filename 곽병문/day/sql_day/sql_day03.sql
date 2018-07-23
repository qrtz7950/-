-- �μ��� �޿��� ���� ������ ������ ��ȸ
select department_id, salary, employee_id, first_name
       ,(
           select count(*) + 1
             from employees e2
             where e.department_id = e2.department_id
                   and e.salary < e2.salary
         ) as rank
  from employees e
  order by  department_id, salary desc;
  
select department_id, salary, employee_id, first_name
       , rank() over (
                      partition by department_id
                      order by salary desc
                     ) as rank
  from employees;
  
------------------------------------------------------------------
select count(*) from employees;  -- 107
select count(*) from departments; -- 27

select * from tab;

-- full outer join, cross join --
select count(*)
  from employees, departments;  -- 2889(107 * 27)

-- inner join --
select count(*)                 -- 106
  from employees, departments
  where employees.department_id = departments.department_id; 
  -- ������ ��� join�Ѱ�
  
-- ����� �ٹ��μ��� ��ȸ
select e.employee_id, e.first_name, e.salary
       , e.department_id, d.department_name
  from employees e, departments d
  where e.department_id = d.department_id
  order by 1 asc;

select * from employees where department_id is null;

----------------------------------------------------------------------
-- null���� ��ȸ
-- (+) ���
select e.employee_id, e.first_name, e.salary
       , e.department_id, d.department_name
  from employees e, departments d
  where e.department_id = d.department_id(+);   -- left outer join
--  where e.department_id(+) = e.department_id;   -- right outer join


-- ansi join -- ����� ǥ��
-- ansi cross join
select count(*)
  from employees cross join departments;

-- ansi inner join
select e.employee_id, e.first_name, e.salary
       , d.department_name
  from employees e inner join departments d
    on e.department_id = d.department_id;

-- ansi left outer join
select e.employee_id, e.first_name, e.salary
       , d.department_name
  from employees e left outer join departments d
    on e.department_id = d.department_id;

-- ansi right outer join
select e.employee_id, e.first_name, e.salary
       , d.department_name
  from employees e right outer join departments d
    on e.department_id = d.department_id;
    
-- ansi full outer join 
select e.employee_id, e.first_name, e.salary
       , d.department_name
  from employees e full outer join departments d
    on e.department_id = d.department_id;

-- 80�� �μ���  �ٹ��ϴ� ����� ��ȣ, �̸�, �μ��� ��ȸ
select e.employee_id, e.first_name, e.salary
       , e.department_id, d.department_name
  from employees e, departments d
  where e.department_id = d.department_id
    and e.department_id =80;

select e.employee_id, e.first_name, e.salary
       , e.department_id, d.department_name
  from employees e inner join departments d
    on e.department_id = d.department_id
  where e.department_id =80;
  
/*
    ��å(job title)�� Sales Manager�� ������� �Ի�⵵�� �Ի�⵵(hire_date)��
    ��� �޿��� ����Ͻÿ�. ��� ��  �⵵�� �������� �������� ����
*/
select to_char(e.hire_date, 'yyyy') �Ի�⵵
       , trunc(avg(e.salary),0) ��ձ޿�
  from employees e inner join jobs j
    on e.job_id = j.job_id
  where job_title = 'Sales Manager'
  group by to_char(e.hire_date, 'yyyy')
  order by 1 asc;
  
/*
    'Public Accountant'�� ��å(job_title)���� ���ſ� �ٹ��� ���� �ִ� ��� �����
    ����� �̸��� ���. (���� 'Public Accountant'�� ��å(job_title)���� �ٹ��ϴ�
    ����� ���x) �̸��� first_name, last_name�� �Ʒ��� �������� ���� ���
*/
select ���, �̸�
  from (
        select e.employee_id ���
               , e.first_name || ' ' || e.last_name �̸�
               , j.job_title ��å
          from employees e, job_history jh, jobs j
         where e.employee_id = jh.employee_id
               and j.job_id = jh.job_id
       )
  where ��å = 'Public Accountant';
  
select e.employee_id ���
        , e.first_name || ' ' || e.last_name �̸�
  from employees e inner join job_history jh
    on e.employee_id = jh.employee_id
    inner join jobs j on j.job_id = jh.job_id
  where j.job_title = 'Public Accountant';
  
/*
    2007�� �Ի�(hire_date)�� �������� ���(employee_id), �̸�(first_name),
    ��(last_name), �μ���(department_name)�� ��ȸ
    �̶�, �μ��� ��ġ���� ���� ������ ���, '<Not Assigned>'�� ���
*/
select e.employee_id ���, e.first_name �̸�, e.last_name ��
     , nvl(d.department_name, '<Not Assigned>') �μ���
  from employees e left outer join departments d
    on e.department_id = d.department_id
  where to_char(e.hire_date,'yyyy') = '2007'
  order by 1 asc;
  
/*
    �ڽ��� �Ŵ������� ����(salary)�� ���� �޴� �������� ��(last_name)��
    ����(salary)�� ���
*/
-- self join --
select e.last_name ��, e.salary ����
  from employees e inner join employees ee
    on e.manager_id = ee.employee_id
  where e.salary > ee.salary;

/*  
    �� �μ����� ������ �Ѹ� �ִ� �μ��� ��ȸ. ��, �μ����� ���� �μ��� ����
    '<�Ż��μ�>'��� ���ڿ��� ��µǵ��� �ϰ�, ��°���� �μ��� ��������
*/
select nvl((
        select d.department_name
          from departments d
          where e.department_id = d.department_id
       ), '<�Ż��μ�>') �μ���, count(*) ������
  from employees e
  group by department_id
  having count(*) = 1;
  order by 1 desc