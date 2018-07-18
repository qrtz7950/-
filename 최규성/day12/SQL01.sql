/*
 �Խ��� ���̺�� : t_board
  - �۹�ȣ : no        number(5)
  - ����  : title     varchar2(200)
  - ����  : content   varchar2(4000)
  - ��ȸ��: view_cnt   number(5)
  - �����: reg_date   date
*/
create table t_board(       --���̺� ����
    no          number(5),
    title       varchar2(200),
    content     varchar2(4000),
    view_cnt    number(5),
    reg_date    date
);

select * from tab;          --���̺� Ȯ��

describe t_board;           --���̺� ���

desc t_board;

drop table t_board;

select * from tab;

/*
     �Խ��� ���̺� : t_board
        -�۹�ȣ     no         number(5)   �ݵ������ �ߺ����X
        -����      title      varchar2(200) �ݵ������
        -����     content     varchar2(4000)
        -��ȸ��    view_cnt    number(5)     0���� �ʱ�ȭ
        -�����    reg_date    date        ����� �ð����� �ʱ�ȭ
        
        not null + unique(�ʼ� + �ߺ�x) = primary key 
        sysdate = ���� �ð�(����Ͻú��� �ٵ�)
*/

create table t_board(
    no      number(5)   primary key
    , title varchar2(200) not null --�ʼ��׸�
    , content varchar2(4000)
    , view_cnt number(5)    default 0
    , reg_date  date        default sysdate 

);

desc t_board;

rename t_board to t_board_ch;

rename t_board_ch to t_board;

desc t_board;
/*--------------------------------------------------------------------*/
create table t_test(
    col_01 varchar2(10)
    ,col_02 number
);

desc t_test;

alter table t_test
    add col_03 varchar2(20);
    
alter table t_test
    add (
        col_04 date
        ,col_04 number(2)
    );
    
alter table t_test
    modify col_03 varchar2(10);
    
desc t_test;

alter table t_test
    drop column col_04;


alter table t_test
    rename column col_05 to col_04;
    
/*
    �Խ��� INSERT ����
    ��ȣ: 1
    ����: ����1
    ����: ����1
    ��ȸ��: 0
    �����: ���糯¥
*/
insert into t_board(no,title,content,view_cnt,reg_date)
    values(1,'����1','����1',0,sysdate);
/*
    insert ����2
    ��ȣ: 2
    ����: ����2
    ����: �����Դϴ�
    ��ȸ��: 0
    �����: ���糯¥
*/

insert into t_board(no, title, content)
    values(2,'����2','�����Դϴ�');

insert into t_board(content, no, title)
    values('����Ʈ���� ���ϴ�',3,'����Ʈ����');
desc t_board;

insert into t_board
    values(4,'����4','�÷������',10,sysdate);



--��� �Խù��� ��ȸ���� 100���� ����
update t_board
    set view_cnt  = 100;
    
--�۹�ȣ�� 2�� �Խù��� ��ȸ���� 0���� ����
update t_board
    set view_cnt = 0
  where no = 2;
  
--�۹�ȣ�� 3�� �Խù����� ������ ����Ʈ���� -> ����� �������� ����
update t_board
    set title = '����� ����'
  where no = 3;
  
  
/*
    �۹�ȣ�� 4�� �Խñۿ���
    ������'������ ����', ������ '������ ����'���� ����
*/

update t_board
    set title = '������ ����', content = '������ ����';
  where no = 4;
  
  select * from tab t_board;
  
  /*
    �۹�ȣ�� 2�� �Խñ� ����
    */
 --delete from t_board
-- where no =2;
 
 --��ü �Խñ� ����
 --delete t_board;


-- ��ü �Խù� ��ȸ
select * from t_board;

select no, title
    from t_board;
    
select no as �۹�ȣ title ����, content "��    ��"       --�Ǿ� �÷��� as������ �׵��� �÷����� as��������
    from t_board;
    
select no,view_cnt
    from t_board;
    
update t_board
    set view_cnt = no *10;
    
--��ȸ���� 100�� ���� "hit��ȸ��"�÷� ��ȸ

select no,view_cnt, view+100
    from t_board;
    
select no,view_cnt ||'ȸ'
    from t_board;
    
select '������ '|| 7 || '�� ' || 18 ||'���Դϴ�.' as ���糯¥
    from dual;


select '��¥���� : ' || sysdate as ��¥����
    from dual;
    
select * from tab;

select * from employees;

/*
    employees ���̺��� ��� ����� ������ ���� ��ȸ
    King ����� �����ȣ�� 100���̰�, ������ 24000�Դϴ�.
    Kochhar ����� �����ȣ�� 101���̰�, ������ 17000�Դϴ�.
    ....
    Gietz ����� ����ȣ�� 107���̰� , ������ 8300�Դϴ�.
*/

select last_name || '����� �����ȣ��' || employee_id ||'���̰�, ������' || salary || '�Դϴ�.' as �������
    from employees;
    
desc employees;

--employees ���̺��� ���� 5000�̻��� ��� ��ȸ

select * from employees
    where salary >= 5000;
    
--employees ���̺��� �μ���ȣ�� (department_id) 80�� ��������ȸ

select * from employees
    where department_id = 80;
    
--employees ���̺��� �μ���ȣ�� 80�� �ƴ� ������ ��ȸ
select * from employees
    where department_id != 80;
    
--employees ���̺��� ������ 10000~20000 �� ����� ��ȸ
select * from employees
    where salary >= 10000 and salary <=20000;
    
select * from employees
    where salary between 10000 and 20000;
    
--employees ���̺��� ������ 15000�̻��̰ų� �μ���ȣ�� 80�� ������ ��ȸ

select * from employees
    where salary >= 15000 or employee_id = 80;
    
--employees ���̺��� �μ���ȣ�� 80,90,100 �λ���� ��ȸ
select * from employees
    where employee_id = 80 or employee_id = 90 or employee_id = 100;
    
select * from employees
    where department_id in (80,90,100);
    
select employees.department_id, employees.employee_id, employees.last_name,employees.salary
    from employees
    where department_id in (80,90,100);
    
select employees.department_id as �μ���,employees. *     --�μ���ȣ�� �Ǿհ� �ڿ� 2�� ���´�
    from employees
    where department_id in (80,90,100);
    
select e.department_id ,e. * from employees e
    where e.department_id in (80,90,100);
    
    
--employees ���̺��� first_name�� 'Peter'�� ����� ��ȸ
select * from employees
    where first_name = 'Peter';
    
--employees ���̺��� first_name�� �ձ��ڰ� 'P'�� ����� ��ȸ
select * from employees
    where first_name like 'P%';         --P�ν����ϰ� �ڿ� 0���̻��� ���ڸ� ���� ���ڿ�
    
--employees ���̺��� forst_name�� �ձ��ڰ� 'P'�̸鼭 �ټ������� ������ ��ȸ
select * from employees
    where first_name like 'P____';      --�����1���� 1���ڸ� �ǹ�
    
--first_name�� �ι�° ���ڰ� 'e'�� ������ ��ȸ
select * from employees
    where first_name like '_e%';
    
--first_name�� 't'�� ���Ե� ������ ��ȸ
select * from employees
    where first_name like '%t%';    --DB �˻��� ���� �Ǿտ� %�� �ִ°��� �����ʴ�.
    
--commission_pct�� ���� ������ ��ȸ
select * from employees
    where commission_pct  is null;
    
--commission_pct�� ������ ������ ��ȸ
select * from employees
    where commission_pct is not null;
    
/*
    Ŀ�̼��� �����ϴ� ����鿡 ����, �����ȣ,����,Ŀ�̼�,���ʽ� ��ȸ
    ���ʽ� = ���� * Ŀ�̼�
*/
select employee_id, salary, commission_pct, salary * commission_pct as BONUS from employees
    where commission_pct is not null;
    
--������� �����ȣ, ����, Ŀ�̼�, ���ʽ� ��ȸ
--Ŀ�̼��� ���� ����� Ŀ�̼�, ���ʽ��� null ���� 0���� ��ȯ -> nvl(�÷���,��) :null���� ������ ������ �����ϴ� �Լ�
select employee_id, salary, nvl(commission_pct,0) commission_pct, salary * nvl(commission_pct,0) as BONUS from employees
    where employees;