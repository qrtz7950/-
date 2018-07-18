/*
�Խ��� ���̺� �� : t_board 
- �۹�ȣ    :  no         number(5)        �ݵ�� ���� �ߺ����X
                        not null + unique => primary key
- ����      : title       varchar2(200)    �ݵ�� ����
- ����      : content     varchar2(4000)
- ��ȸ��    : view_cnt    number(5)        0���� �ʱ�ȭ
- �����    : reg_date     date            ����ð� �ʱ�ȭ
*/

create table t_board02(
        no            number(5)         PRIMARY KEY --�� �� �̻��� �ʵ嵵 ����
    ,   title         varchar2(200)     not null
    ,   content       varchar2(4000)    
    ,   view_cnt      number(5)         default 0
    ,   reg_date      date              default sysdate
);

select * from tab;

rename t_board02 to board02_t;

desc board02_t;

rename board02_t to t_board02;

desc t_board02;