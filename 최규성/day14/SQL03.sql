--�μ��� �޿��� ���� ������ ������ ��ȸ
select department_id, salary, employee_id, first_name
        , (
            select count(*) + 1
              from employees e2
            where e1.department_id = e2.department_id
                and e1.salary < e2.salary
        ) as rank
    from employees e1
    order by department_id, salary desc;
    
select department_id, salary,employee_id,first_name
        ,rank() over(
                    partition by department_id 
                    order by salary desc
                    ) as rank
    from employees;
    
    
--------------------------------------------------------------------

select count(*) from employees; --107
select count(*) from departments; --27

--full outer join , cross join
select count(*)
    from employees,departments;     --2889 = 107 * 27
    
--����� �ٹ� �μ��� ��ȸ
select e.employee_id, e.first_name, e.salary, e.department_id, d.department_name
    from employees e,departments d
    where e.department_id = d.department_id --Inner Join�� ���(�ΰ��� ���̺��� ���������� ���� �÷� ���)
    order by 1;

select count(*)                                    --�μ��� null�� ����� ����
    from employees e, departments d                 --106
    where e.department_id = d.department_id;
    
----------------------------------------------------------------------------------
--left outer join (107��)
select e.employee_id, e.first_name, e.salary, e.department_id, d.department_name
    from employees e,departments d
    where e.department_id = d.department_id(+);
    
--right outer join (107��)
select e.employee_id, e.first_name, e.salary, e.department_id, d.department_name
    from employees e,departments d
    where d.department_id(+) = e.department_id ;
    
    
--ANSI cross join
select count(*)
    from employees cross join departments;
    
--ansi inner join
select e.employee_id, e.first_name, e.salary, d.department_id
    from employees e inner join departments d
        on e.department_id = d.department_id; 
    
--ansi left outer join
select e.employee_id, e.first_name, e.salary, d.department_id
    from employees e left outer join departments d
        on e.department_id = d.department_id;
        
--ansi right outer join
select e.employee_id, e.first_name, e.salary, d.department_id
    from departments d right outer join employees e
        on e.department_id = d.department_id;
        
-- 80�� �μ��� �ٹ��ϴ� ����� ��ȣ, �̸�, �μ����� ��ȸ
select  e.employee_id, e.first_name, d.department_name
    from employees e, departments d
    where e.department_id = d.department_id
        and e.department_id = 80;
            --ansi ���
select e.employee_id, e.first_name, d.department_name
    from employees e inner join departments d
        on e.department_id = d.department_id
    where e.department_id = 80;
    
/* ��å(job title)�� Sales Manager�� ������� �Ի�⵵�� �Ի�⵵(hire_date)��
    ��� �޿��� ����Ͻÿ�. ��½� �⵵�� �������� ������������
    */
select j.job_title,to_char(e.hire_date, 'yyyy'),avg(e.salary)
    from jobs j inner join employees e
        on j.job_id = e.job_id
    where  j.job_title = 'Sales Manager'
    group by j.job_title,to_char(e.hire_date,'yyyy')
    order by 2 asc;

/* public Accountant�� ��å(job_title)���� ���ſ� �ٹ��������ִ� ��� ����� ����� �̸��� ����Ͻÿ�
    (���� 'public account'�� ��å���� �ٹ��ϴ� ����� ��������ʴ´�.)
    �̸��� first_name, last_name�� �� �÷��� ���ļ� ����Ѵ�.*/

select e.employee_id, e.first_name || ' ' || e.last_name �̸�
    from employees e, jobs j,job_history jh
    where j.job_id = jh.job_id
        and jh.employee_id = e.employee_id
        and j.job_title = 'Public Accountant';
        
    --ansi���
select e.employee_id, e.first_name || ' ' || e.last_name �̸�
    from employees e  inner join job_history jh
        on e.employee_id = jh.employee_id
        inner join jobs j on j.job_id = jh.job_id
    where j.job_title = 'Public Accountant';

--2007�� �Ի��� ����� ����̸����μ��� ��� �μ��������� ���ٰ� ���
select e.employee_id ���, e.first_name �̸�, e.last_name ��, nvl(d.department_name,'<Not Assigned>') �μ���
    from employees e , departments d
    where to_char(e.hire_date,'yyyy') = '2007'
      and e.department_id = d.department_id(+);
    
--�ڽ��� �Ŵ������� ������ ���� �޴� �������� ���� ������ ����Ͻÿ�
select e.last_name, e.salary
    from employees e, employees m           --self join
    where e.salary > m.salary
        and e.manager_id = m.employee_id;    
        
/*���μ����� ������ �Ѹ��ִ� �μ��� ��ȸ�Ͻÿ� ��, ������ ���� �μ��� ���� '<�Ż��μ�>'
��� ���ڿ��� ��µǵ��� �ϰ�, ��� ����� ������ ���� �μ����� ������������ ���ĵǾ�� �Ѵ�.
*/
select nvl(
            (
                 select d.department_name
                      from departments d
                      where e.department_id = d.department_id
            ),'<�Ż��μ�>'
        ) �μ���, count(*) ������
    from employees e
    group by department_id
    having count(*) =1
    order by 1 desc;
    
 select nvl(d.department_name,'�Ż��μ�'),count(*) ������
 from employees e, departments d
 where e.department_id = d.department_id(+)
 group by d.department_name
 having count(*) =1
 order by 1 desc 