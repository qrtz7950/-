package kr.co.mlec.board;

import kr.co.mlec.board.ui.BoardUI;

/*
 	*** �޴� ***
 	1. ��ü�Խñ� ��ȸ
 	2. �۹�ȣ  ��ȸ
 	3. �۵��
 	4. �ۼ���
 	5. �ۻ���
 	0. ����
 	�׸��� �����ϼ��� : 1
 	�Խñ��� �������� �ʽ��ϴ�
 	
 	*** �޴� ***
 	1. ��ü�Խñ� ��ȸ
 	2. �۹�ȣ  ��ȸ
 	3. �۵��
 	4. �ۼ���
 	5. �ۻ���
 	0. ����
 	�׸��� �����ϼ��� : 3
 	����� ������ �Է��ϼ��� : aaa
 	����� ������ �Է��ϼ��� : bbb
 	�Խñ��� ����Ͽ����ϴ�
 	
 	*** �޴� ***
 	1. ��ü�Խñ� ��ȸ
 	2. �۹�ȣ  ��ȸ
 	3. �۵��
 	4. �ۼ���
 	5. �ۻ���
 	0. ����
 	�׸��� �����ϼ��� : 1
 	
 	��ȣ   ����   ����   �����
 	1    aaa  bbb  2018-07-25
 */

public class BoardMain {

	public static void main(String[] args) {
		
		try {
			new BoardUI().execute();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}









