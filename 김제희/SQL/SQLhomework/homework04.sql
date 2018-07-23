/*
1.	EMPLOYEES ���̺��� �޿��� ���� �޴� ������� ��ȸ���� �� ���ó�� 
6��°���� 10��°���� 5���� last_name, first_name, salary�� ��ȸ�ϴ� sql������ �ۼ��Ͻÿ�.
*/

select RANKING
      , last_name 
      , first_name
      , salary
     from (
             select e.*
                  , row_number() over( order by salary desc) as rnum
                  , rank() over(order by salary desc) as RANKING
                from employees e
          )
where rnum between 6 and 10;

/*2.	����� �μ��� ���� ����(city)�� ��Seattle���� ����� �̸�, �ش� ����� �Ŵ��� �̸�, ����� �μ��̸��� ����Ͻÿ�
. �̶� ����� �Ŵ����� ���� ��� ��<����>���̶�� ����Ͻÿ�. �̸��� last_name�� ����ϸ�, 
����� �̸��� ������������ �����Ͻÿ�.
*/

select e.last_name ����̸�
     , nvl(m.last_name, '<����>') �Ŵ����̸�
     , d.department_name �μ��̸�
  from employees e left outer join employees m
    on e.manager_id = m.employee_id left outer join departments d
    on e.department_id = d.department_id left outer join locations l
    on d.location_id = l.location_id
  where l.city = 'Seattle'
  order by 1 asc;


/*  3.
    �� ����( job) ���� ����(salary)�� ������ ���ϰ��� �Ѵ�. ���� ������ ���� ����
    �������� ������(job_title)�� ���� ������ ��ȸ
    ��, ���������� 30,000���� ū ������ ���
*/
select j.job_title, sum(e.salary)
    from employees e left outer join jobs j
      on e.job_id = j.job_id
group by j.job_title
  having sum(e.salary) > 30000;
  
/*
4.	�� ���(employee)�� ���ؼ� ���(employee_id), �̸�(first_name), ������(job_title), �μ���(department_name)�� ��ȸ�Ͻÿ�.
�� ���ø�(city)�� ��Seattle���� ����(location)�� �μ�(department)�� �ٹ��ϴ� ������ �����ȣ �������������� ����Ͻÿ�.
*/

select e.employee_id as �����ȣ
     , e.first_name as �̸�
     , j.job_title as ������
     , d.department_name as �μ��̸�
  from employees e left outer join employees m
    on e.manager_id = m.employee_id left outer join departments d
    on e.department_id = d.department_id left outer join locations l
    on d.location_id = l.location_id left outer join jobs j
    on j.job_id = e.job_id
  where l.city = 'Seattle'
  order by 1 asc;

/*
5.	2001~2003����̿� �Ի��� ������
�̸�(first_name), �Ի���(hire_date), �����ڻ��(employee_id), ������ �̸�(fist_name)�� ��ȸ�մϴ�.
��, �����ڰ� ���� ��������� ��°���� ���Խ��� ����Ѵ�.
*/

select e.first_name as �̸�,to_char(e.hire_date, 'yyyy-mm-dd AM hh12:mi:ss') as �Ի���, nvl(to_char(ee.employee_id),'�����ڹ�ȣ����') as �����ڻ��, nvl(to_char(ee.first_name),'�����ھ���') as "������ �̸�"
    from employees e left outer join employees ee
      on e.manager_id = ee.employee_id
  where to_number(to_char(e.hire_date, 'yyyy'),'9999') between 2001 and 2003;

/*  6.
    ��Sales�� �μ��� ���� ������ �̸�(first_name), �޿�(salary), �μ��̸�(department_name)��
    ��ȸ/ ��, �޿��� 100�� �μ��� ��պ��� ���� �޴� ���� ������ ��µǾ�� �Ѵ�
*/

select e.first_name, e.salary, d.department_name
    from employees e left outer join departments d
      on e.department_id = d.department_id
   where to_char(department_name) = 'Sales'
     and (
          select avg(salary)
            from employees ee
           where ee.department_id = 100
        group by ee.department_id
         )>e.salary
       