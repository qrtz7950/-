package kr.co.mlec.day02;

import java.util.Random;

public class OperationMain03 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num = r.nextInt(10) + 1; // 1~10
		
		System.out.println("���������: " + num);
		/*
		String msg =num % 2 ==0 ? "¦��":"Ȧ��"; //�������ǿ����� ���
		
		System.out.println(num + " : " + msg);//�� �� �߿� �ϳ��� ���� �ڵ�
		
		System.out.println(num + " : " + (num % 2 ==0 ? "¦��":"Ȧ��")); //����
		
		//�׷��� 3������� T:F�߿� �ϳ��� ��� �װ��� �ΰ��� ������
		//T:F�� - > expr? (expr'? T':F') : F
		*/
		System.out.println(num  == 0 ? "�ش���׾���" : (num % 2 == 0 ? "¦��":"Ȧ��"));
		
	}
}
