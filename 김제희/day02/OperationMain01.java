package kr.co.mlec.day02;

import java.util.Scanner;

/*
 * ���� 2���� �Է¹޾� �ι�° ������ ù��° ������ ��� ���� �Ǵ�
 * ù��° ����: 12
 * �ι�° ����: 3
 * 
 * 3�� 12�� ������� : true/false
 * 
 */
public class OperationMain01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		int num = sc.nextInt();
		System.out.printf("ù��° ����: %d\n", num);
		
		System.out.print("�ι�° ����: ");
		int num2 = sc.nextInt();
		System.out.printf("ù��° ����: %d\n", num2);
		
		//boolean bool = num % num2 == 0; //�����꿡 ���� ���� ����/�޽��� �����Ƿ� �ڷ����� �Ҹ�����
		boolean bool = (num2 != 0 && num2 % num2 == 0);
		
		System.out.print(num2 + "��" + num + "�� ������� �Ǵ�:" + bool);
	}
}
