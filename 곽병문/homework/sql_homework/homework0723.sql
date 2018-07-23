/*  1.
    EMPLOYEES ���̺��� �޿��� ���� �޴� ������� ��ȸ���� �� ���ó�� 6��°����
    10��°���� 5���� last_name, first_name, salary�� ��ȸ
*/
select ee.RANKING, ee.last_name, ee.first_name, ee.salary
  from (
        select e.*, rank() over(order by e.salary desc) RANKING
          from employees e
        )ee
  where ee.RANKING between 6 and 10;
/*  2.
    ����� �μ��� ���� ����(city)�� ��Seattle���� ����� �̸�, �ش� ����� �Ŵ��� �̸�,
    ����� �μ� �̸��� ����Ͻÿ�. �̶� ����� �Ŵ����� ���� ��� ��<����>���̶�� ���
    �̸��� last_name�� ����ϸ�, ����� �̸��� ������������ ����
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
select j.job_title ������, sum(e.salary)
  from employees e inner join jobs j
    on e.job_id = j.job_id
  group by j.job_title
  having sum(e.salary) > 30000
  order by sum(e.salary) desc;

/*  4.
    �� ���(employee)�� ���ؼ� ���(employee_id), �̸�(first_name), ������(job_title),
    �μ���(department_name)�� ��ȸ/ ��, ���ø�(city)�� ��Seattle���� ����(location)��
    �μ�(department)�� �ٹ��ϴ� ������ �����ȣ �������������� ���
*/
select e.employee_id, e.first_name, j.job_title, d.department_name
  from employees e inner join jobs j
    on e.job_id = j.job_id left outer join departments d
    on e.department_id = d.department_id left outer join locations l
    on d.location_id = l.location_id
  where l.city = 'Seattle'
  order by 1 asc;

/*  5.
    2001~2003����̿� �Ի��� ������ �̸�(first_name), �Ի���(hire_date), �����ڻ��
    (employee_id), ������ �̸�(fist_name)�� ��ȸ�մϴ�. ��, �����ڰ� ���� ���������
    ��°���� ���Խ��� ����Ѵ�
*/
select e.first_name �����̸�
     , to_char(e.hire_date, 'yyyy-mm-dd AM hh12:mi:ss') �Ի���
     , m.employee_id �����ڻ��
     , nvl(m.first_name, e.first_name)
  from employees e left outer join employees m
    on e.manager_id = m.employee_id
  where to_number(to_char(e.hire_date, 'yyyy'), '9999') between 2001 and 2003;

/*  6.
    ��Sales�� �μ��� ���� ������ �̸�(first_name), �޿�(salary), �μ��̸�(department_name)��
    ��ȸ/ ��, �޿��� 100�� �μ��� ��պ��� ���� �޴� ���� ������ ��µǾ�� �Ѵ�
*/
select e.first_name, e.salary, d.department_name
  from employees e inner join departments d
    on e.department_id = d.department_id
  where (
        select avg(salary)
          from employees ee
          where ee.department_id = 100
          group by ee.department_id
        )>e.salary
        and d.department_name = 'Sales';