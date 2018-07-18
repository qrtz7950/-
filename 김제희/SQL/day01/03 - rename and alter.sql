insert into t_board(no, title, content, view_cnt, reg_date) --�÷��� ������ �������
    values(1, '����1', '����1', 0, sysdate);        
    --���� ǥ���� ''
/*
    insert example
    ��ȣ  :  ��ȣ 2
    ����  : ����2
    ����  : �����Դϴ�
    ��ȸ��:  0
    �����: ���糯��
*/
insert into t_board(no, title, content) --����Ʈ�� �����Ȱ��� ���� �����ʾƵ� �ڵ����� ��
    values(2, '����2', '�����Դϴ�');      

insert into t_board(content, no, title) --�������ϸ� �������X
    values('�����尪��', 3, '����Ʈ��');
    
desc t_board;

insert into t_board  --���� �� �������������� ���̺��鶧 ������� �������� ������� �� �־����
    values(4, '����4', '����3', 0, sysdate);

select * from t_board;


-------------------������Ʈ----------------------------------------------

--��� �Խñ��� ��ȸ���� 100���� ����

update t_board
    set view_cnt = 100;
    
select * from t_board;

--�۹�ȣ�� 2�� �Խñ��� ��ȸ���� 0���� ����

update t_board
    set view_cnt = 0
    where no = 2;
    
select * from t_board;

--�۹�ȣ�� 3�� �Խñ��� ������ �����忡�� ������������� ����
update t_board
    set title = '����� ����'
    where no = 3;

select * from t_board;

--�۹�ȣ�� 4�� �Խñ��� ����� ������ �������������� ����

update t_board
    set title = '������ ����' ,content = '������ ����'
    where no = 4;
    
select * from t_board;

delete from t_board
    where no = 2;

delete from t_board;

--delete from t_board;

select * from t_board;

--select ����---------------------------------------------------

select no, title
    from t_board;

--�ݷ��� ���� ���� �����Ҽ� �ֵ��� ������� �ٿ��� �� �ִ�
select no as �۹�ȣ, title ����, content as "��     ��", view_cnt as ��ȸ��, reg_date as ��¥ --as��� �Ǵ� ��������
    from t_board;

select no, view_cnt
    from t_board;
    
update t_board
    set view_cnt = no * 10;

select * from t_board;

--�÷� ������, �÷� �� ����

select no, view_cnt, view_cnt + 100 as ��Ʈ����Ʈ
    from t_board;
    
select no, view_cnt || 'ȸ' as ��ȸ��
    from t_board;

--������ 7�� 18���Դϴ�
select '������ 0718' as ����!
    from dual; --�������̺� ���
    
select '������' || 0718 as ����! --���ڳ��� ���ϱ� ����
    from dual; --�������̺� ���    
    
select '��¥���� :  ' || sysdate as ��¥����
    from dual; --�������̺� ���    
    
select *from tab;

select * from employees;

/*
���÷��� ���̺��� ��� ����� ������ ���� ��ȸ
king ����� �����ȣ�� 100���̰� ������ 24000�Դϴ�
kochhar ����� �����ȣ�� 101���̰� ������ 1700�Դϴ�
...
Gietz����� �����ȣ�� 107���̰� ������ 8300�Դϴ�
*/

select LAST_NAME || '����� �����ȣ��' || employee_id || '�̰� ������' || SALARY || '�Դϴ�' as �������
    from employees
    where employee_id = 100;
    
select * from employees;    
    
-- employee���̺��� ������ 5000�̻��� ��� ��ȸ

select *
    from employees
    where salary >= 5000;
    
-- employees ���̺��� �μ���ȣ�� (department_id) 80�� ������ ��ȸ

select *
    from employees
    where department_id = 80;
    
-- employees ���̺��� �μ���ȣ�� (department_id) 80 �ƴ� ��� ����
    
select *
    from employees
    where department_id != 80;    

-- employee���̺��� ������ 10000~20000�̻��� ��� ��ȸ

select *
    from employees
    where salary >= 10000 and salary <= 20000;
    
--���� �ڵ�
select *
    from employees
    where salary between 10000 and 20000;
    
-- employees ���̺��� �μ���ȣ�� (department_id) 90�̰ų� ������ 15000�̻��� ��� ��ȸ
select *
    from employees
    where salary >= 15000 or department_id = 80;
    
-- employees ���̺��� �μ���ȣ�� (department_id) 80,90,100�� ��� ��ȸ
    
select *
    from employees
    where department_id = 80 
       or department_id = 90 
       or department_id = 100;

select *
    from employees
    where salary >= 15000 or department_id = 80;

select employees.department_id --�ùٸ��� � ���̺� � �÷����� ǥ���ϴ� ���
    from employees --����� �����ϴ� ���̺��� �Ѱ��⶧���� �����ص� �����ϴ�
    where department_id in (80,90,100);

select employees.department_id, employees.* --�������� ��� ������ֱ����� �� ���� � ���̺��� ����Ű���� ��Ī���ش�
    from employees                          --���� �÷��� ������ �� ���⶧���� �ǵڿ� department_id_1 ����� 1�� �ٴ´�
    where department_id in (80,90,100);
    
select e.department_id, e.*
    from employees e --���̺���� �ٸ�� �����ʴ´�, ��డ��
    where department_id in (80,90,100);
    
------------like-----------------------------

employee ���̺��� first_name 'peter'�� ������ ��ȸ
select *
    from employees
    where first_name = 'Peter';
    
--employee ���̺��� first_name�� �ձ��ڰ� 'P'�� ������ ��ȸ

select *
    from employees
    where first_name like 'P%';   --like�� ã������ ���ڴ��� ������ ���� �𸦶� %�� �ٿ��ش�
                                    --%�� 0�� �̻��̶�¶�
                                    
--employee ���̺��� first_name�� �ձ��ڰ� 'P'�̸鼭 �ټ������� ������ ��ȸ
select *
    from employees
    where first_name like 'P____'; 

--employee ���̺��� first_name�� �� ��° ���ڰ� 'e'�� ������ ��ȸ
select *
    from employees
    where first_name like '_e%';
    
--employee ���̺��� first_name�� 't'�� ���ԵǴ� ������ ��ȸ

select *
    from employees
    where first_name like '%t%'; 
--DB�� �˻��� ���� Ʈ������ ����� �ε����� ����ϳ� �˻��Ϸ��� ���ڿ��տ� %�� ������ �ε����� �����ϰԵǹǷ�
--�̴� �����ؾ��ϴ� ����̴�.

--commission_pct�� ���� ��������ȸ
select *
    from employees
    where commission_pct IS NULL; 
--null�̶�� ���� �˻��Ҽ��¾��⶧���� is null �̶�� �����ڸ� �̿��Ѵ�

--commission_pct�� null�� �ƴ� ��������ȸ
--null�� ������ ���� � ���� ���ϵ� ���� null�̱⶧���� �ٸ� �����ڸ� �������� ������ is not null�̶�� �����ڸ� ���� �̿��Ѵ�
select *
    from employees
    where commission_pct is not null; 

--Ŀ�̼��� �����ϴ� ����鿡 ���� �����ȣ, ����, Ŀ�̼�, ���ʽ���ȸ,
--���ʽ��� Ŀ�̼� * ����

select e.employee_id, e.salary, e.commission_pct, e.salary * e.commission_pct as ���ʽ�
    from employees e
    where commission_pct is not null; 

--������� �����ȣ ���� Ŀ�̼� ���ʽ� ��ȸ�ϳ� Ŀ�̼��� ���� ����� Ŀ�̼�,���ʽ��� 0���� ��ȸ
--nvl(�÷��� , value) : 
--null���� ������ ������ �����ϴ� �Լ�
select e.employee_id
     , e.salary
     , nvl(e.commission_pct, 0)
     , e.salary * nvl(e.commission_pct,0) as ���ʽ�
    from employees e;















