/*
    �ټ���
    ������
    �ּ�ó��
*/
-- ���� �ּ�ó��

/* 
    �Խ��� ���̺�� : t_board
    - �۹�ȣ   : no        number(5)
    - ����    : title      varchar2(200)
    - ����    : content    varchar2(4000)
    - ��ȸ��   : view_cnt  number(5)
    - �����   : reg_date  date
 */

create table t_board(
    no          number(5)
    , title       varchar2(200)
    , content     varchar2(4000)
    , view_cnt    number(5)
    , reg_date    date
);

select * from tab;

describe t_board;

desc t_board;

drop table t_board;

select * from t_board;

truncate table t_board;

/* 
    �Խ��� ���̺�� : t_board
    - �۹�ȣ   : no        number(5)       -- �ݵ�� ���� , �ߺ����X   
                                          -- not null + unique => primary key
    - ����    : title      varchar2(200)   -- �ݵ�� ����
    - ����    : content    varchar2(4000)
    - ��ȸ��   : view_cnt  number(5)       -- 0���� �ʱ�ȭ
    - �����   : reg_date  date            -- ���糯¥�� �ʱ�ȭ
 */
 
 create table t_board(
    no          number(5)       primary key    -- 
    , title     varchar2(200)   not null       -- �ʼ� �׸� ǥ��
    , content   varchar2(4000)
    , view_cnt  number(5)       default 0          -- �ʱⰪ ����
    , reg_date  date            default sysdate
 );
 
 desc t_board;
 
 rename t_board to t_boardd;
 
 desc t_boardd;
 
 rename t_boardd to t_board;
 
 create table t_test(
    col_01      varchar2(10)
    , col_02    number
);

desc t_test;

alter table t_test
    add col_03 varchar2(20);

ALTER TABLE T_TEST
    ADD (COL_04 DATE
         , COL_05 NUMBER(2)
    );
    
ALTER TABLE T_TEST
    MODIFY COL_01 VARCHAR2(20);

ALTER TABLE T_TEST
    DROP COLUMN COL_04;

ALTER TABLE T_TEST
    RENAME COLUMN COL_05 TO COL_04;
    
desc t_test;

/*
    INSERT ����
    ��ȣ : 1
    ���� : ����1
    ���� : ����1
    ��ȸ�� : 0
    ����� : ���糯¥
*/
insert into t_board(no, title, content, view_cnt, reg_date)
    values(1, '����1', '����1', 0, sysdate);

select * from t_board;

/*
    INSERT ����2
    ��ȣ : 2
    ���� : ����2
    ���� : �����Դϴ�
    ��ȸ�� : 0
    ����� : ���糯¥
*/
insert into t_board(no, title, content)
    values(2, '����2', '�����Դϴ�');
    
select * from t_board;

insert into t_board(content, no, title)
    values('����!!!', 3, '����');

insert into t_board
    values(4, 'ũũ', 'ũũ��', 0, sysdate);
    
select * from t_board;

-- UPDATE ����

update t_board set view_cnt = 100;

-- �۹�ȣ 2�� �Խù��� ��ȸ���� 0���� ����
update t_board
    set view_cnt = 0 where no = 2;

select * from t_board;

-- �۹�ȣ�� 3�� �Խù��� ������ ����Ʈ���� -> ����� ���� ����
update t_board
    set title = '����� ����' where no=3;
    
-- �۹�ȣ�� 4�� �Խñۿ��� ������ '������ ����', ���� '������ ����' ����
update t_board
    set title = '������ ����', content = '������ ����'
    where no=4;
    
select * from t_board;

-- �۹�ȣ�� 2�� �Խñ� ����
delete from t_board
    where no=2;

-- ��ü ����
delete from t_board;

-- ��ü �Խù� ��ȸ
select * from t_board;

select no, title
    from t_board;

select no as �۹�ȣ, title ����, content "��       ��", view_cnt ��ȸ��, reg_date �����
    from t_board;

select no, view_cnt
    from t_board;
    
update t_board
    set view_cnt = no * 10;

-- ��ȸ���� 100�� ���� "hit��ȸ��" �÷� ��ȸ
select no, view_cnt, view_cnt+100 as hit��ȸ��
    from t_board;

select no, view_cnt||'ȸ' as ��ȸ��
    from t_board;
    
-- ������ 7�� 18���Դϴ�
select '������ ' || 7 || '��' || 18 || '�� �Դϴ�' as "���� ��¥"
    from dual;

select '��¥���� : ' || sysdate as "��¥ ����"
    from dual;
    
/*
    employees ���̺��� ��� ����� ������ ���� ��ȸ
    King����� �����ȣ�� 100���̰�, ������ 24000�Դϴ�.
    Kochhar����� �����ȣ�� 101���̰�, ������ 17000�Դϴ�.
    ...
    Gietz����� �����ȣ�� 107���̰�, ������ 8300�Դϴ�.
*/

select last_name||'����� �����ȣ�� ' || employee_id
    ||'���̰�, ������ ' ||salary||'�Դϴ�.' as �������
    from employees;
    
desc employees;

-- employees���̺��� ������ 5000 �̻��� ��� ��ȸ
select * from employees
    where salary>=5000;
    
-- employees���̺��� �μ���ȣ��(department_id) 80�� ������ ��ȸ
select * from employees
    where department_id = 80;
    
-- employees���̺��� �μ���ȣ��(department_id) 80�� �ƴ� ������ ��ȸ
select * from employees
    where department_id != 80;

-- employees���̺��� ������ 10000~20000 ������ ������ ��ȸ
select * from employees
    where salary >= 10000 and salary <= 20000;

select * from employees
    where salary between 10000 and 20000;

-- employees���̺��� ������ 15000�̻��̰ų� �μ���ȣ�� 80�� ������ ��ȸ
select * from employees
    where salary >= 10000 or department_id = 80;

-- employees���̺��� �μ���ȣ�� 80, 90, 100�� ������ ��ȸ
select * from employees
    where department_id = 80 or department_id = 90
                             or department_id = 100;

select * from employees
    where department_id in(80, 90, 100);
    
select employees.department_id, employees.*
    from employees
    where department_id in(80, 90, 100);
    
select e.department_id, e.*
    from employees e            --���̺���� alias �Ⱦ��� �׳� ��
    where e.department_id in(80, 90, 100);
    
-- employees ���̺��� firts_name 'Peter'�� ������ ��ȸ
select *
    from employees
    where first_name = 'Peter';
    
-- employees ���̺��� firts_name �ձ��ڰ� 'P'�� ������ ��ȸ
select *
    from employees
    where first_name like 'P%';     -- like     % 0���̻��� ����

-- employees ���̺��� firts_name �ձ��ڰ� 'P'�̰� �ټ������� ������ ��ȸ
select *
    from employees
    where first_name like 'P____';     -- like  _ 1���� ����

-- employees ���̺��� firts_name �ι�° ���ڰ� 'e'�� ������ ��ȸ
select *
    from employees
    where first_name like '_e%';

-- employees ���̺��� firts_name 't' ���Ե� ������ ��ȸ
select *
    from employees
    where first_name like '%t%';    -- �� %������ �˻��ӵ� ����, ���ϴ°� ����

-- commissio_pct�� ���� ��� ��ȸ
select *
    from employees
    where commission_pct is null;      -- null�� ã��
    
-- commissio_pct�� ������ ��� ��ȸ
select *
    from employees
    where commission_pct is not null;   -- null�� ����
    
-- commissio_pct�� ������ ��� �� �����ȣ, ����, Ŀ�̼�, ���ʽ� ��ȸ
-- ���ʽ� = ���� * Ŀ�̼�
select employee_id, salary, commission_pct, salary * commission_pct as bonus
    from employees
    where commission_pct is not null;
/*
    ��� ��� �� �����ȣ, ����, Ŀ�̼�, ���ʽ� ��ȸ
    ���ʽ� = ���� * Ŀ�̼�
    Ŀ�̼� ������ Ŀ�̼�, ���ʽ� 0���� ��ȸ
    nvl(�÷���, value) : null���� ������ value�� �����ϴ� �Լ�
*/
select employee_id, salary, nvl(commission_pct, 0), salary * nvl(commission_pct, 0) as bonus
    from employees;