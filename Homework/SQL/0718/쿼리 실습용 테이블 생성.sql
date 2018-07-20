drop table s_emp;
CREATE TABLE s_emp
(id             NUMBER(7) primary key,
 name           VARCHAR2(25),
 mailid         VARCHAR2(8),
 start_date     DATE,
 manager_id     NUMBER(7),
 title          VARCHAR2(25),
 dept_id        NUMBER(7),
 salary         NUMBER(11, 2),
 commission_pct NUMBER(4, 2)
);

INSERT INTO s_emp VALUES (
  1, '�ڱ���', 'sky98',
   to_date('03-03-1990','dd-mm-yyyy'), NULL, '����',
   118, 5000, NULL);
INSERT INTO s_emp VALUES (
   2, '�ո�', '2xxsig',
   to_date('08-03-1990','dd-mm-yyyy'), 1, '��ȹ����',
   110, 3000, NULL);
INSERT INTO s_emp VALUES (
   3, '������', 'ch21175',
   to_date('17-06-1991','dd-mm-yyyy'), 1, '��������',
   102, 3500, NULL);
INSERT INTO s_emp VALUES (
   4, '����ȫ', 'mquickto',
   to_date('07-04-1990','dd-mm-yyyy'), 1, '�ѹ�����',
   101, 3000, NULL);
INSERT INTO s_emp VALUES (
   5, '��ɼ�', 'aropebur',
   to_date('04-03-1990','dd-mm-yyyy'), 1, '�λ����',
   118, 3200, NULL);
INSERT INTO s_emp VALUES (
   6, '������', 'murguhar',
   to_date('18-01-1991','dd-mm-yyyy'), 2, '����',
   110, 2400, NULL);
INSERT INTO s_emp VALUES (
   7, '������', 'enchu',
   to_date('14-05-1990','dd-mm-yyyy'), 2, '����',
   111, 2400, NULL);
INSERT INTO s_emp VALUES (
   8, '�ű��', 'bbiri',
   to_date('07-04-1990','dd-mm-yyyy'), 2, '����',
   112, 2100, NULL);
INSERT INTO s_emp VALUES (
   9, '�̻���', 'acatchpo',
   to_date('09-02-1992','dd-mm-yyyy'), 2, '����',
   113, 2300, NULL);
INSERT INTO s_emp VALUES (
   10, '�ּ�ö', 'mhavel',
   to_date('27-FEB-1991','dd-mm-yyyy'), 2, '����',
   113, 2300, NULL);
INSERT INTO s_emp VALUES (
   11, '������', 'cmagee',
   to_date('14-05-1990','dd-mm-yyyy'), 3, '������ǥ�̻�',
   102, 2450, 10);
INSERT INTO s_emp VALUES (
   12, '������', 'hgiljum',
   to_date('18-01-1992','dd-mm-yyyy'), 3, '������ǥ�̻�',
   103, 2500, 12.5);
INSERT INTO s_emp VALUES (
   13, '�輮��', 'ysedeghi',
   to_date('18-02-1991','dd-mm-yyyy'), 3, '������ǥ�̻�',
   104, 2650, 10);
INSERT INTO s_emp VALUES (
   14, '�ڼ���', 'mnguyen',
   to_date('22-01-1992','dd-mm-yyyy'), 3, '������ǥ�̻�',
   105, 2650, 15);
INSERT INTO s_emp VALUES (
   15, '������', 'adumas',
   to_date('09-10-1991','dd-mm-yyyy'), 3, '������ǥ�̻�',
   106, 2400, 17.5);
INSERT INTO s_emp VALUES (
   16, '�̱�ö', 'emaduro',
   to_date('07-02-1992','dd-mm-yyyy'), 6, '���',
   110, 2400, NULL);
INSERT INTO s_emp VALUES (
   17, '������', 'gsmith',
   to_date('08-03-1990','dd-mm-yyyy'), 6, '���',
   110, 940, NULL);
INSERT INTO s_emp VALUES (
   18, '������', 'anozaki',
   to_date('09-02-1991','dd-mm-yyyy'), 7, '���',
   111, 1200, NULL);
INSERT INTO s_emp VALUES (
   19, '��âȯ', 'vpatel',
   to_date('06-08-1991','dd-mm-yyyy'), 7, '���',
   111, 795, NULL);
INSERT INTO s_emp VALUES (
   20, '������', 'cnewman',
   to_date('21-07-1991','dd-mm-yyyy'), 8, '���',
   112, 750, NULL);
INSERT INTO s_emp VALUES (
   21, '����ö','amarkari',
   to_date('26-05-1991','dd-mm-yyyy'), 8, '���',
   112, 850, NULL);
INSERT INTO s_emp VALUES (
   22, '������', 'echang',
   to_date('30-11-1990','dd-mm-yyyy'), 9, '���',
   113, 800, NULL);
INSERT INTO s_emp VALUES (
   23, '������', 'rpatel',
   to_date('17-10-1990','dd-mm-yyyy'), 9, '���',
   106, 795, NULL);
INSERT INTO s_emp VALUES (
   24, '������', 'bdancs',
   to_date('17-03-1991','dd-mm-yyyy'), 10, '���',
   113, 860, NULL);
INSERT INTO s_emp VALUES (
   25, '�̿�ȣ', 'sschwart',
   to_date('09-05-1991','dd-mm-yyyy'), 10, '���',
   113, 1100, NULL);
COMMIT;
