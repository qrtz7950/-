-- java�� �̿��� �Խ��ǰ������α׷� sql

-- kr.co.mlec.board.vo.BoardVO ��ü���� �������
create table tbl_board(
    no  number(5)   primary key
    , title varchar2(200) not null
    , writer varchar2(100) not null
    , view_cnt number(5) default 0
    , reg_date  date default sysdate
);

--�Խù���ȣ�� ���� �Ϸù�ȣ ����(sequence ����)
create sequence tbl_board_no;

insert into tbl_board(no, title, writer)
  values(tbl_board_no.nextval, 'aaa', 'bbb');








