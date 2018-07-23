

select count(*) from employees; -- 107
select count(*) from departments; -- 27

select count(*)
  from employees,departments; -- 107 * 27 = 2889

select * 
  from employees,departments; 
  -- full outer join, cross join �̶���Ѵ�
  -- ����� �ִ� ��� ����� ���� ���� ��

select *
  from employees e,departments d
 where e.department_id = d.department_id;
-- ���� �������� �ֵ鸸 ������ ��µǴ� �̷� ������ ������
-- inner join�̶�� �Ѵ�
  
select *
  from employees e,departments d
 where e.department_id = d.department_id;
-- �������� �ƴ� row�� ����ϰ� �������� row�� �� �κи� Ȯ���Ͽ� ����ϴ°�
--�ϳ��� ���̺��� row�� ��� ����ϰ� �ٸ� ���̺��� �������� �����ϴ� row���� Ȯ���Ͽ� ����ϴ°�
-- ��� ���̺��� Ȯ��Ǵ����� �����Ͽ� left or right outer join�̶�� �� �� �մ�
-- outer join
--(left or right) outer join
-- �ΰ��� ���̺��� ��� Ȯ���Ͽ� ����ϸ� full outer join�̶���Ѵ�

-----------------------------------------------------------------------------

--����� �ٹ��μ����� ��ȸ
select e.employee_id, e.first_name, e.salary, e.department_id, d.department_name
    from employees e, departments d
   where d.department_id = e.department_id
order by e.employee_id;
  
select * 
  from employees,departments;  
----------------------------------------------------------------------------------------------------------------------
select count(*)
  from employees e,departments d
 where e.department_id = d.department_id;

--inner join
--107���ε� 106�� ���� �ֳĸ� ���ǿ� �������� ���ϴ� null���� �ֱ⶧��
--primaryŰ�� ����ũ�ϸ鼭 not null�ε� �ﶱ�� �׷����� �ճ�

--null���̶� ������ ������ null�� ������ ����Ҽ� �ְ� (+)�� �߰��Ѵ�
--left outer join
-- (+)�� ������ ���� (left or right) outer join�� �ȴ�
select e.employee_id, e.first_name, e.salary, e.department_id, d.department_name
    from employees e, departments d
   where d.department_id = e.department_id(+) 
order by e.employee_id;

--(+)�� ����Ŭ������ ���̴� �ƿ��� ���� ����̴�
-- ǥ�� �԰��� ansi join����̴�
--�� ����� � ������ �Ұ����� ����Ѵ�.

--ansi cross join
select count(*) 
  from employees cross join departments;

--ansi inner join
--����Ŭ���� where���� �Ŵ� ������ �Ƚô� on���� ǥ��
--��� ���̺��� Ȯ��Ǵ����� ������ �߿��ϴ�
select e.employee_id, e.first_name, e.salary, d.department_name
  from employees e inner join departments d
  on  e.department_id = d.department_id;

-- left outer join 
select e.employee_id, e.first_name, e.salary, d.department_name
  from employees e left outer join departments d
    on e.department_id = d.department_id;
    
-- right outer join 
select e.employee_id, e.first_name, e.salary, d.department_name
  from departments d right outer join employees e
    on e.department_id = d.department_id;

--on ������ ������ �߿������ʴ�
-- full outer join 
select e.employee_id, e.first_name, e.salary, d.department_name
  from departments d full outer join employees e
    on e.department_id = d.department_id;

--80�� �μ��� �ٹ��ϴ� ����� ��ȣ, �̸�(first_name), �μ��� ��ȸ
select e.employee_id, e.first_name, d.department_name
  from employees e,departments d
 where e.department_id = d.department_id
   and e.department_id = 80;
 
select e.employee_id, e.first_name, d.department_name
  from employees e inner join departments d
    on e.department_id = d.department_id
 where e.department_id = 80;

--��å�� sales manager �� ������� �Ի�⵵�� �Ի�⺰ ��� �޿��� ����ϼ��� ��½� �⵵�� �������� �������� ����

select to_char(hire_date, mm) as �⵵, avg(e.salary)
    from employees e inner join departments d
      on e.hire_date = d.hire_date
group by hire_date;

---------------------------------------------------------------------------------------

-- ��å�� (job_title)sales manager �� ����� �Ի�⵵�� ��� �޿� ���
select to_char(e.hire_date, 'yyyy') as �⵵, round(avg(e.salary),'.9') as ��ձ޿�
    from employees e inner join jobs j
      on j.job_id = e.job_id
   where j.job_title = 'Sales Manager'
group by to_char(e.hire_date, 'yyyy');

---------------------------------------------------------------------------------------
/*
    ��Public Accountant���� ��å(job_title)���� ���ſ� �ٹ��� ���� �ִ� 
    ��� ����� ����� �̸��� ����Ͻÿ�. 
    (���� ��Public Accountant���� ��å(job_title)���� �ٹ��ϴ� ����� ������� �ʴ´�.) 
    �̸��� first_name, last_name�� �Ʒ��� �������� ���� ����Ѵ�
*/
select e.employee_id, e.first_name || ' ' || e.last_name �̸�
  from employees e, jobs j, job_history jh
 where j.job_id = jh.job_id
   and jh.employee_id = e.employee_id
   and j.job_title = 'Public Accountant';
   
select e.employee_id, e.first_name || ' ' || e.last_name �̸�
  from employees e inner join job_history jh
    on jh.employee_id = e.employee_id
    inner join jobs j on j.job_id = jh.job_id
 where j.job_title = 'Public Accountant';   
---------------------------------------------------------------------------------------

--2007�� �Ի��� �������� ��� �̸� �� �μ����� ��ȸ�մϴ�
     --hire_date    employee_id first_name last_name department_name
     
select e.employee_id as ���, e.first_name as �̸�, e.last_name as ��, d.department_name as �μ���
     , nvl(d.department_name, 'Not assigned' )
  from employees e left outer join departments d
    on d.department_id = e.department_id
 where to_char(e.hire_date, 'yyyy') = '2007';


-------------------------------------------------------------

--�ڽ��� �Ŵ������� ������ ���� �޴� �������� ���� ������ ����Ͻÿ�
--���� ���̺��� �����ϴ� ���� ���� �����̶���Ѵ�
select e.first_name || ' ' || e.last_name as �̸� , e.salary
   from employees e, employees ee
  where e.salary > ee.salary
    and e.manager_id = ee.employee_id;

--�μ����� ������ �Ѹ� �ִ� �μ��� ��ȸ�Ͻÿ� �� ������ ���� �μ��� ���� �Ż��μ���� ���ڿ��� ��µǵ��� �ϰ� ��°���� �μ����� ��������

select e.department_id
   from (
         select nvl(to_char(e.department_id),'<�Ż��μ�>'), count(*)
           from employees e
       group by e.department_id
         ) e
  where count(*) = 1;


-- �� �μ����� ������ �Ѹ� �ִ� �μ��� ��ȸ �� �μ����� ���� �μ��� ���ؼ��� �ż��μ���� ���ڿ� ��� ��°���� �μ��� ��������

  select nvl(
             (select d.department_name
                from departments d
               where e.department_id = department_id) , '�Ż��μ�') as , count(*)
    from employees e 
group by e.department_id
  having count(*) = 1
order by department_id desc;


 
---------------------------------------------------------------------------------------
select * 
  from employees, departments;