/*
�Խ��� ���̺� �� : t_board 
- �۹�ȣ    :  no         number(5)
- ����      : title       varchar2(200)
- ����      : content     varchar2(4000)
- ��ȸ��    : view_cnt    number(5)
- �����    : reg_date     date
*/

create table t_board(
        no            number(5)
    ,   title         varchar2(200)
    ,   content       varchar2(4000)
    ,   view_cnt      number(5)
    ,   reg_date      date
);

select * from tab;

desc t_board;

drop table t_board;