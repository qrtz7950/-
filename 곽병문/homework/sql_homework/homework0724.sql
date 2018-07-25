/*  2.
    �� ����(city)�� �ִ� ��� �μ� �������� ��ձ޿��� ��ȸ�ϰ��� �Ѵ�. ��ձ޿���
    ���� ���� ���ú��� ���ø�(city)�� ��տ���, �ش� ������ �������� ����Ͻÿ�. ��,
    ���ÿ� �ٹ��ϴ� ������ 10�� �̻��� ���� �����ϰ� ��ȸ�Ͻÿ�.
*/
select l.city �����̸�, avg(salary) ��ձ޿�, count(l.city) ������
  from employees e inner join departments d
    on e.department_id = d.department_id inner join locations l
    on d.location_id = l.location_id
  group by l.city
  having count(l.city) < 10
  order by 3 desc;
  
/*  6.
    ������(job_title)�� ��Sales Representative���� ���� �߿��� ����(salary)�� 9,000�̻�,
    10,000 ������ �������� �̸�(first_name), ��(last_name)�� ����(salary)�� ����Ͻÿ�
*/
select e.first_name, e.last_name, e.salary
  from employees e inner join jobs j
    on e.job_id = j.job_id
  where j.job_title = 'Sales Representative'
        and e.salary between 9000 and 10000;
        
/*  7.
    �μ����� ���� ���� �޿��� �ް� �ִ� ������ �̸�, �μ��̸�, �޿��� ����Ͻÿ�. �̸���
    last_name�� ����ϸ�, �μ��̸����� �������� �����ϰ�, �μ��� ���� ��� �̸��� ����
    ���� �������� �����Ͽ� ����մϴ�
*/
select e.last_name �̸�, d.department_name �μ��̸�, e.salary �޿�
  from employees e left outer join departments d
    on e.department_id = d.department_id
  where (d.department_name, e.salary)
        in
        (
        select d2.department_name, min(e2.salary)
          from employees e2 inner join departments d2
            on e2.department_id = d2.department_id
          group by d2.department_name
        )
        or d.department_id is null
  order by d.department_name asc, e.last_name asc;
  
/*  14.
    Employees ���̺��� �Ի��Ѵ�(hire_date)���� �ο����� ��ȸ�Ͻÿ�
*/
select to_char(e.hire_date, 'mm')||'��' ��, count(e.hire_date) ������
  from employees e
  group by to_char(e.hire_date, 'mm')
  order by 1 asc;
  
/*  15.
    �μ��� �������� �ִ�, �ּ�, ��ձ޿��� ��ȸ�ϵ�, ��ձ޿��� ��IT�� �μ��� ��ձ޿�����
    ����, ��Sales�� �μ��� ��պ��� ���� �μ� ������ ����Ͻÿ�.
*/
select d.department_name �μ���, trunc(max(e.salary), -2) �ִ�޿�
     , trunc(min(e.salary),-2) �ּұ޿�, trunc(avg(e.salary), -2) ��ձ޿�
  from employees e inner join departments d
    on e.department_id = d.department_id
  group by d.department_name
  having avg(e.salary) > (
                         select avg(salary)
                         from employees e2 inner join departments d2
                           on e2.department_id = d2.department_id
                         group by d2.department_name
                         having d2.department_name = 'IT'
                         )
    and  avg(e.salary) < (
                         select avg(salary)
                         from employees e3 inner join departments d3
                           on e3.department_id = d3.department_id
                         group by d3.department_name
                         having d3.department_name = 'Sales'
                         );

/*  17.
    �μ��� �Ի���� �������� ����Ͻÿ�. ��, �������� 5�� �̻��� �μ��� ��µǾ�� �ϸ�
    ��°���� �μ��̸� ������ �Ѵ�
*/
select d.department_name �μ���, to_char(e.hire_date, 'mon') �Ի��
     , count(to_char(e.hire_date, 'mon')) ������
  from employees e inner join departments d
    on e.department_id = d.department_id
  group by d.department_name, to_char(e.hire_date, 'mon')
  having count(to_char(e.hire_date, 'mon')) >= 5
  order by d.department_name asc;
  
/*  18.
    ����(country_name) �� ����(city)�� �������� ��ȸ�Ͻÿ�. ��, �μ��� �������� ���� ����
    �� �ֱ� ������ 106���� ������ ����� �ȴ�. �μ������� ���� ������ ������� ���ø�
    ��ſ� ��<�μ�����>���� ��µǵ��� �Ͽ� 107�� ��� ��µǰ� �Ѵ�.
*/
select nvl(c.country_name, '<�μ�����>') ������, nvl(l.city, '<�μ�����>') ���ø�
     , count(l.city) ������
  from employees e left outer join departments d
    on e.department_id = d.department_id left outer join locations l
    on d.location_id = l.location_id left outer join countries c
    on l.country_id = c.country_id
  group by c.country_name, l.city
  order by c.country_name, l.city asc;
  
/*  19.
    �� �μ��� �ִ� �޿����� ���̵�(employee_id), �̸�(first_name), �޿�(salary)�� ���
    �Ͻÿ�. ��, �ִ� �޿��ڰ� ���� �μ��� ��ձ޿��� ���������� ����Ͽ� ��ձ޿��� ���� ��
    �ְ� �� ��.
*/
select e.employee_id �������̵�, e.first_name �̸�, e.salary �޿�
     ,  �μ����
  from employees e left outer join (
                                    select round(avg(ee.salary), 2) �μ����
                                         , ee.department_id eedi
                                         , max(ee.salary) mes
                                      from employees ee
                                      group by ee.department_id
                                    )
    on e.department_id = eedi
  where e.salary = mes
  order by e.employee_id asc;

/*  21.
    Ŀ�̼�(commission_pct)�� ���� ���� ���� ���� 4���� �μ���(department_name), ������
    (first_name), �޿�(salary), Ŀ�̼�(commission_pct) ������ ��ȸ�Ͻÿ�. ��°����
    Ŀ�̼��� ���� �޴� ������ ����ϵ� ������ Ŀ�̼ǿ� ���ؼ��� �޿��� ���� ������ ���� ���
    �ǰ� �Ѵ�
*/
select d.department_name, e.first_name, e.salary, e.commission_pct
  from (
        select ee.*, rownum
          from employees ee
          where ee.commission_pct is not null
          order by ee.commission_pct desc, ee.salary desc
        )e inner join departments d
    on e.department_id = d.department_id
  where rownum <= 4;
        