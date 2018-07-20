select employee_id as �����ȣ, first_name ����̸�, nvl (to_char(manager_id),'�Ŵ�������') �Ŵ�����ȣ
    from employees;
    
--�μ���ȣ�� 80,90,100���� �ش������ʴ� ������ ��ȸ

select * from employees
    where department_id != 80
    and department_id ^= 90
    and department_id <> 100;
    
select * from employees
    --where department_id not in (80,90,100); or
    where not department_id in (80,90,100);
    
    
    -------------------------------------------------------
    
    
--������ ���� ��������� ��ȸ
select * from employees
    order by salary DESC;
    
    --SALARY �÷��� �Ǿ�(1��°)���� �����ϰ� �������� ���
    select employees.salary ����, employees.* from employees
        --order by ���� desc;
         order by 1 desc;
    --employees �� �ʹ����
    select e.salary, e.* from employees e
        order by e.salary desc;
        
--������ ���� ��������� ��ȸ. ��, ������ ���� ���� last_name�� �������� ���������� ��ȸ
select e.salary, e.last_name , e.* from employees e
    order by e.salary DESC, e.last_name asc;
    
/*
    to_char() : ������, ��¥���� ���������� ����
    
    to_char(��¥, '���˹���')      yy(��), m(��), d(��)
                                h(��), mi(��) , s(��)
                            
    to_char(����, '���˹���')     9(�ڸ���)   0(����ִ� �ڸ����� 0���� ä��)
                                ,(�׼� ǥ���� 3�ڸ����� ','ǥ��)
                                .(�Ǽ� �Ҽ��� �ڸ��� ǥ��)
    
    to_char(hire_date, 'yyyy')
*/

select sysdate 
    , to_char(sysdate, 'yy/mm/dd')���糯¥ 
    , to_char(sysdate, 'hh:mi:ss')����ð�
    , to_char(sysdate, 'hh24:mi:ss') "����ð�(24h)"
    from dual;

/*
    ��ü������ ��ȸ. ��, �Ի翬�� ��½� 18/07/20 => 18.07.20 ���� ��ȸ
*/
select employee_id, last_name
    , to_char(hire_date, 'yy.mm.dd') hire_date
    from employees;

/*
    ����� 2005�� 9���� �Ի��� ��� ��ȸ
*/
select *
    from employees
    where to_char(hire_date, 'yyyymm') = '200509';
    
--������ ���ڸ����� ','�� ǥ��
select employee_id, last_name, to_char(salary,'900,000') "salary(����0ǥ��)"
    from employees;
    
--�Ի�⵵�� 2001, 2002, 2003�� ��� �����ȸ
select employee_id, last_name, hire_date
    from employees
    where to_char(hire_date, 'yyyy') = '2001' 
    or to_char(hire_date, 'yyyy') = '2002'
    or to_char(hire_date, 'yyyy') = '2003';
    ----------------------------------------
select employee_id, last_name, hire_date
    from employees
    where to_char(hire_date, 'yyyy') in ('2001', '2002', '2003');
    --------------------------------------------

create table t_year(
    year number(4)
    );
    
insert into t_year values(2001);
insert into t_year values(2002);
insert into t_year values(2003);

select * from t_year;
--�ϳ��� ����Ʈ�� �ȿ� ����Ʈ���� ���� ��츦 '��������'��� �θ���.
select employee_id, last_name, hire_date
    from employees
    where to_char(hire_date,'yyyy')
        in (
                select year from t_year
            );
            
------------------------------------------------------
--�Ի�⵵�� 2001,2,3 �� ��� �߿� �μ���ȣ�� 90�� ������ ��ȸ

select * from employees
    where (to_char(hire_date, 'yyyy') = '2001'
        or to_char(hire_date, 'yyyy') = '2002'
        or to_char(hire_date, 'yyyy') = '2003')
        and department_id = 90;
    ---------------------------------------------------
select employee_id, last_name, hire_date, department_id
    from employees
    where to_char(hire_date, 'yyyy') in ('2001','2002','2003')
        and department_id = 90;
        
        
    -----------------------------------------------------

select 'Hello World', upper('hello world'), lower('HELLO WORLD'), length('Hello World')
    from dual;
    
select substr('2018�� 07�� 20��', 1,5)
     , substr('2018�� 07�� 20��', 7,2)
    from dual;
    
select '        trim��        ' , length('        trim��        ')
     ,trim('        trim��        '),length(trim('        trim��        '))
     ,ltrim('        ltrim��        ')
     ,rtrim('        rtrim��        ')
    from dual;
    
select replace('�����ٶ󸶹ٻ�', '�ٶ�', '����')
        , instr('�����ٶ󸶹ٻ�', '�ٶ�')
        , instr('�����ٶ󸶹ٻ�', '�ٹ�')
    from dual;

-- last_name�� 'en'�� ���Ե� ������ ��ȸ

select last_name from employees
    --where lower(last_name) like '%en%'; %�� �տ� ������ �������� ����
    where instr(lower(last_name), 'en') <> 0;
    
-----------------------------------------------------------------

select sysdate from dual;

--������� ���������� �����ΰ�
select to_char(sysdate,'mm') || '���� ���������� ' || 
        to_char(last_day(sysdate),'dd')|| '�� �Դϴ�'
    from dual;
--����İ� �ñ���
select sysdate ���糯¥ 
    , add_months(sysdate, 1) "���糯¥ + 1��"
    , add_months(sysdate, 6) "���糯¥ + 6��"
    from dual;
    
--���糯¥���� ���� ����� �������� ��¥ ��ȸ
select next_day(sysdate,'������') from dual;
-------------------------------------------------
select to_number('1234') from dual;
select 100+200, '100' +200 from dual;   --������ �ö󰡸鼭 to_number�� �߾Ⱦ��Ե�

select '20170411'
    , to_date('20170411', 'yyyymmdd') ��¥��ȯ1
    , to_date('20170411', 'yyyyddmm') ��¥��ȯ2
    , to_char(to_date('20170411', 'yyyymmdd'), 'yyyy-mm-dd') ��¥��ȯ3
    from dual;
    
----------------------------------------------

/*
    salary�� 20000�̻��̸�  '��׿�����'
             10000~19999�� '���뿬����'
             00000~ 9999�� '���׿�����'
 */          
select employee_id, last_name, salary
        ,case when salary >= 20000 then '��׿�����'
              when salary >= 10000 then '���뿬����'
              else '���׿�����'
        end as "salary type"
    from employees;
    
--�ѻ�� �� ��ȸ
select count(*) �ѻ����
    from employees;
    
--�μ���ȣ�� 80�� ����� ��ȸ
select count(*)
    from employees
    where department_id = 80;

--������� job_id ��ȸ (�ߺ�����) --distinct : �ߺ��� ����
select distinct job_id
    from employees;

--job_id ������
select count(distinct job_id)
    from employees;
    
--�ִ�޿�, �ּұ޿�,�Ѿ�,���(�Ҽ��� 3�ڸ����� �ݿø�) ��ȸ
select max(salary) �ִ�޿� , min(salary) �ּұ޿�
        ,sum(salary) �޿��Ѿ�
        ,round(avg(salary),2) �޿����
    from employees
    order by salary desc;
    
------������----------------------------------------------------
create sequence seq_01;

select seq_01.nextval from dual;
select seq_01.currval from dual;

create sequence seq_02
    start with 201807000001;
    
select seq_02.nextval from dual;

create sequence seq_03
    increment by 5;

select seq_03.nextval from dual;

alter sequence seq_03
    increment by 3;
    
----------------------------------------------------------------
select * from t_board;

insert into t_board(no, title, content)
    values(3, '���Կ���', '���Ծȵ�');
    
create sequence seq_t_board_no;

delete from t_board;
truncate table t_board;

insert into t_board(no,title,content)
    values(seq_t_board_no.nextval,'����1', '�������� ���� ����');
    
select * from t_board;

--------------------žN����--------------------------------

select * from employees
    where rownum <= 5;
    
select * from employees
    where rownum = 1;
    
select * from employees
    where rownum = 5;
    
--�޿��� ���� ��� ������ ���� 5�� ��ȸ
select * from employees
    where rownum <=5
    order by salary desc;
---------------�ؼ������� from -> where -> select -> order by-------------
    
select *
    from(
    select * from employees             
        order by salary desc
    )
    where rownum < = 5;
    
--�ߺ������ʴ� �μ���ȣ ��ȸ
select distinct department_id
    from employees;

--�μ��� �μ���ȣ ��ȸ
select department_id
    from employees
    group by department_id;
    
-- �μ��� ����� ����ȸ
select department_id, count(department_id)
    from employees
    group by department_id;

--�μ��� �ִ�޿�, �ּұ޿�, ��ձ޿� ��ȸ
select department_id , max(salary) �ִ�޿�,min(salary) �ּұ޿�
        , round(avg(salary),1) ��ձ޿�
    from employees
    group by department_id;
    
/*
    �μ��� ��ձ޿� ��ȸ
    ��, ��ձ޿��� 5000�̻��� �μ��� ��ȸ
    where -> group by ��
*/
select department_id, round(avg(salary),1) avg
    from employees
    group by department_id
    having avg(salary) >= 5000;


select  avg_salary
    from(
        select department_id, round (avg(salary),1) as avg_salary
            from employees
            group by department_id
        )
   where avg_salary >= 5000;
   
/*
    �μ���ȣ�� ������ �μ� �� ������� 5���̻��� �μ���ȸ
    ��, �μ��� �μ���ȣ �������� ����
*/
select department_id, count(*) as depart_count
    from employees
    where department_id is not null
    group by department_id
    having count(*) >= 5
    order by department_id asc;
    
/*
    ��ȭ�鿡 ����� 5�� ����Ѵ� �������� ���� 
    ù��° �������� ����� ������ ��ȸ
*/

select * from employees
    where rownum <= 5;
    
/*
    �ι�° �������� ����� ������ ��ȸ
*/

select *    
    from (
            select e.*, rownum as rn
                from employees e
         )    
    where rn >= 6 and rn <= 10;
    
--�޿��� �������������� ������������ �ι�° �������� ��ȸ�� ������
select *
    from(
        select e.* , rownum rn
            from (
                    select *
                     from employees
                    order by salary desc
                ) e
        )
where rn >= 6 and rn <= 10;


-------------------------------------------------------------
select  employee_id, first_name, department_id, rownum
    from employees;
    
/*
    rownum_number() �Լ�
    rownum_number() over([partition by �÷���] order by �÷���)
    
    rank() �Լ�
    rank() over([partition by �÷���] order by �÷���)
    
    partition by :  ������ �÷��� �ش��ϴ� �׷켳��
    order by : ������ �÷��� ���� ��ġ/���� ����
*/
--�޿� ���� (������(row_number)�� ���� ���������� ���ص� ��)

select employee_id, first_name, department_id, salary
    , row_number() over(order by salary desc) rnum
    from employees;
    

select e.*, rownum
    from(
        select employee_id, first_name, department_id, salary
            from employees
            order by salary desc
        ) e;
          
--�޿� ���� (���� ä��, �������� �߻�)
select employee_id, first_name, department_id, salary
    , rank() over(order by salary desc) rrank
    from employees;
    
--�޿� ���� (���� ä��, �������� �̹߻�)
select employee_id, first_name, department_id, salary
    , dense_rank() over(order by salary desc) rrank
    from employees;
    
--========================����02===================================
--1. �μ���ȣ�� ������ �μ� �� ������� 5���̻��� �μ��� ��ȸ�Ͻÿ�
select department_id, count(*) as depart_count
    from employees
    where department_id is not null
    group by department_id
    having count(*) >= 5;

    
--2. Employees ���̺��� �Ի��� �޺��� �ο����� ��ȸ�Ͻÿ�
select e.*
    from(
        select to_char(hire_date,'mm') �� , count(*) as ������
            from employees
            group by to_char(hire_date, 'mm')
            order by to_char(hire_date,'mm') asc
        ) e;
        
/* 
 3.Ŀ�̼�(commission_pct)�� �������� ��ȸ�Ͻÿ�. Ŀ�̼��� �Ʒ�������ó�� 0.2, 0.25��
��� .2��, 0.3, 0.35�� .3 ���·� ��µǾ�� �Ѵ�. ��, Ŀ�̼� ������ ���� �����鵵 �ִ�
�� Ŀ�̼��� ���� ���� �׷��� ��<Ŀ�̼� ����>���� ��µǰ� �Ѵ�.
*/

select trunc(to_char(nvl(commission_pct,0),1)) Ŀ�̼� ,  count(trunc(commission_pct,1),1) ������
    from employees;
    group by 
    