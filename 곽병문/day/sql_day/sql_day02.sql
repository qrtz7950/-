/*
    employees���̺��� �����ȣ, ����̸�, �Ŵ��� ��ȣ ��ȸ
    ��, manager�� ���� ���� 0���� ���
*/
select employee_id �����ȣ, first_name ����̸�, nvl(manager_id, 0) �Ŵ�����ȣ
    from employees;

/*
    employees���̺��� �����ȣ, ����̸�, �Ŵ��� ��ȣ ��ȸ
    ��, manager�� ���� ���� '�Ŵ�������'dmfh cnffur
*/
select employee_id �����ȣ, first_name ����̸�, nvl(to_char(manager_id), '�Ŵ�������') �Ŵ�����ȣ
    from employees;
    
-- �μ���ȣ�� 80, 90, 100�� �ش����� �ʴ� ��� ��� ��ȸ
select *
    from employees
   where department_id != 80
     and department_id ^= 90
     and department_id <> 100;
     
-- ������ ���� ������� ��� ����
select employees.salary, employees.*
    from employees
    order by employees.salary desc;
    
select e.salary ����, e.*
     from employees e
    order by ���� desc;
    
select e.salary ����, e.*
     from employees e
    order by 1 desc;    -- �÷�����
    
/*
    ������ ���� ��������� ��ȸ
    ��, ������ ������� last_name�� �������� ���������� ��ȸ
*/
select e.salary, e.last_name, e.*
     from employees e
    order by e.salary, e.last_name;
--  order by 1 desc, 2 asc;

/*
    to_char() : ������, ��¥���� ���������� ����
       
    to_char(��¥, '���˹���')     yy(��), m(��), d(��)
                                h(��), mi(��), s(��)
    to_char(����, '���˹���')     9(�ڸ���)  0(����ִ� �ڸ��� 0 ä��)
                                ,(�׼�ǥ���� 3�ڸ����� ,ǥ��)
                                .(�Ǽ� �Ҽ��� �ڸ��� ǥ��)
*/
select sysdate
    , to_char(sysdate, 'yy/mm/dd') ���糯¥
    , to_char(sysdate, 'hh:mi:ss') ����ð�
    , to_char(sysdate, 'hh24:mi:ss') "����ð�(24h)"
    from dual;

/*
    ��ü������ ��ȸ
    ��, �Ի�⵵ ��½� 18/07/20 => 18.07.20 ���� ��ȸ
*/
select employee_id, last_name, to_char(sysdate, 'yy.mm.dd') hire_date
    from employees;
    
-- ����� 2005�� 9���� �Ի��� ��� ��ȸ
select *
    from employees
    where to_char(employees.hire_date, 'yyyymm') = '200509';
    
-- �������� ���ڸ����� , ǥ��
select employee_id, last_name, to_char(salary, '999,999') salary
    from employees;
    
-- �Ի�⵵�� 2001, 2002, 2003�� ������ ��ȸ
select hire_date, employees.*
    from employees
    where to_char(hire_date, 'yyyy') = '2001'
       or to_char(hire_date, 'yyyy') = '2002'
       or to_char(hire_date, 'yyyy') = '2003';
       
select hire_date, employees.*
    from employees
    where to_char(hire_date, 'yyyy') in ('2001', '2002', '2003');
    
create table t_year(
    year number(4)
);
insert into t_year values(2001);
insert into t_year values(2002);
insert into t_year values(2003);

select * from t_year;

select e.hire_date, e.*
    from employees e
    where to_char(e.hire_date, 'yyyy')
       in (
            select year from t_year         -- subquery
          );
          
-- �Ի�⵵�� 2011, 2002, 2003�� ��� �߿� �μ���ȣ�� 90�� ������ ��ȸ
select *
  from employees e
 where to_char(e.hire_date, 'yyyy') in ('2001','2002','2003')
   and e.department_id =90;

select 'Hello World'
        , upper('Hello World')
        , lower('Hello World')
        , length('Hello World')
    from dual;
    
select substr('2018�� 7�� 20��', 1, 5)
       , substr('2018�� 7�� 20��', 7, 3)
  from dual;

-- last_name �� 'en'�� ���Ե� ������ ��ȸ
select last_name
  from employees
 where instr(lower(last_name), 'en') != 0;      -- instr Ư������ ��ġ Ȯ�� , ������ 0

select sysdate from dual;

-- ������� ������ ���� ����?
select to_char(sysdate, 'mm') || '���� ���������� '
       || to_char(last_day(sysdate), 'dd') || '�� �Դϴ�' "������ ��"
  from dual;
  
select to_char(sysdate, 'yyyy-mm-dd') ���糯¥
       , to_char(add_months(sysdate, 1)) "���糯¥ + �Ѵ�"
       , to_char(add_months(sysdate, 6)) "���糯¥ + 6����"
  from dual;
  
--���糯¥���� ���� ����� �������� ��¥ ��ȸ
select next_day(sysdate, '������') from dual;

select to_number('1234') from dual;

select to_date('20170411')
       , to_date('20170411', 'yyyymmdd') ��¥��ȯ1
       , to_date('20170411', 'yyyyddmm') ��¥��ȯ2
       , to_char(to_date('20170411', 'yyyymmdd'), 'yyyy-mm-dd') ��¥��ȯ3
  from dual;
  
/*
    salary 20000 �̻�         '��׿�����'
           10000~20000 ����   '���뿬����'
           10000 �̸�         '���׿�����'
*/
select employee_id, last_name, salary
       , case when salary >= 20000 then '��׿�����'
              when salary >= 10000 then '���뿬����'
              else '���׿�����'
         end as "salary type"
  from employees;

-- employees ���̺� �� ����� ��ȸ
select count(*) "�� �����"
  from employees;
  
-- �μ���ȣ�� 80�� �����
select count(*)
  from employees
 where department_id = 80;
 
-- employees���̺� job_id ��ȸ(��, �ߺ�����)
select distinct job_id                     -- distinct : �ߺ��Ȱ� ����
  from employees;
  
select count(distinct job_id)                      -- distinct : �ߺ��Ȱ� ����
  from employees;
  
-- employees ���̺��� �ִ�޿�, �ּұ޿�
select max(salary) �ִ�޿�
       , min(salary) �ּұ޿�
       , sum(salary) �޿��Ѿ�
       , round(avg(salary), 2) �޿����
  from employees;
  

------------------------------------------------------------------
-- ������
create sequence seq_01;

select seq_01.nextval from dual;        
select seq_01.currval from dual;        -- nextval ���������� ��밡��

create sequence seq_02
    start with 20180700001;
    
select seq_02.nextval from dual;

create sequence seq_03
    increment by 5;
    
select seq_03.nextval from dual;

alter sequence seq_03
    increment by 3;
    
select * from t_board;

insert into t_board(no, title, content)
    values(3, '���Կ���', '���Ծȵ�');  -- no(primary key �Ἥ �ߺ��Ұ�)

create sequence seq_t_board_no;

delete from t_board;
truncate table t_board;

insert into t_board(no, title, content)
    values(seq_t_board_no.nextval, '����1', '�������� ���� ����');

select * from t_board;

--------------------------------------------------------------
-- rownum
select *
  from employees
 where rownum <=5;      --select ���� rownum�� �� �� ���� ���� ���� ���
    /* 
        �ؼ����� 
            from => where => select => order by
    */

-- �޿��� ���� ��������� ���� 5�� ��ȸ
/*
select *                    -- �ؼ������� ���� �ùٸ��� ���� �� ����
  from employees
 where rownum <= 5
 order by salary desc;
 
select *
  from employees
 order by salary desc;
 */
 select *
   from (                   -- ���� �������� �����Ͽ� ��������
         select *
           from employees
          order by salary desc
        )
  where rownum <= 5;        -- ������ 5�� �̾Ƴ�
  

-----------------------------------------------------------------
-- Group By

-- �ߺ����� �ʴ� �μ���ȣ ��ȸ
/*
select distinct department_id
  from employees
 order by department_id desc;
 */
 
 select department_id           -- �����Լ��� ���õ� �͸� ��� ����(�ش�׷쿡�� ����ؼ�)
   from employees
  group by department_id;       -- ���� ���� �׷�ȭ
  
-- �μ��� ����� ��ȸ
select department_id || '�� �μ� : ' || count(department_id) || '��' as "�μ��� ������"
  from employees
 group by department_id;
 
-- �μ��� �ִ�޿�, �ּұ޿�, ��ձ޿� ��ȸ
select department_id, max(salary) �ִ�޿�, min(salary) �ּұ޿�
       , round(avg(salary),1) ��ձ޿�
  from employees
 group by department_id;

  
-------------------------------------------------------------------
-- Having : �׷쿡 ������ �� �� ���, �׷�

      -- ����  
      -- from => where => group by => having => select => order by

 /*
    �μ��� ��ձ޿� ��ȸ
    ��, ��ձ޿��� 5000�̻��� �μ��� ��ȸ
*/
select *
  from (
        select department_id as di, round(avg(salary),1) as asalary
          from employees
         group by department_id
        )
  where asalary>=5000;

select department_id, round(avg(salary),1) avg_salary
  from employees
 group by department_id
  having avg(salary) >= 5000;
  
/*
    �μ���ȣ�� ������ �μ� �� ������� 5�� �̻��� �μ� ��ȸ
    ��, �μ��� �μ���ȣ �������� ����
*/
select department_id, count(department_id) �����
  from employees
 where department_id is not null
 group by department_id
 having count(department_id)>=5
 order by department_id asc;
 
 /*
    ��ȭ�鿡 ����� 5�� ����Ѵ� �������� ����
    ù��° �������� ����� ������ ��ȸ
*/
select *
  from employees
 where rownum <= 5;
 
 -- �ι�° �������� ����� ������ ��ȸ
 select *
   from (
         select e.*, rownum as rn
           from employees e
        )
  where rn >= 6 and rn <=10;
 
 /* 
    �޿��� ������������ �������� ���� �ι�° �������� ��ȸ�� ������
*/
select eee.*
  from (
        select ee.*, rownum rn
          from (
             select e.*
               from employees e
              order by salary desc
            )ee
        )eee
 where rn >5 and rn <= 10;
 
 select employee_id, first_name, department_id, rownum
   from employees;

/*
    rownum_number() �Լ�
    rownum_number() over ([partition by �÷���] order by �÷���)
    
    rank() �Լ�
    rank() over ([partition by �÷���] order by �÷���)
    
    partition by : ������ �÷��� �ش��ϴ� �׷켳��
    order by : ������ �÷��� ���� ��ġ/���� ����
*/
select employee_id, first_name, department_id
       , row_number() over( order by first_name asc) rnum
  from employees;

 select employee_id, first_name, department_id, salary
        , row_number() over(order by salary desc) rnum
   from employees;

select e.*, rownum
  from(
        select employee_id, first_name, department_id, salary
          from employees
         order by salary desc
      ) e;
      
 select employee_id, first_name, department_id, salary
        , rank() over(order by salary desc) rnum
   from employees;