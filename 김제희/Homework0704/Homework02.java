package kr.co.Homework0704;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		//3661��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȯ�� �ʸ� �Է��ϼ���: ");
		int sec = sc.nextInt();
		System.out.printf("�Է��� �ð�  %d�ʴ� ������ ���� ��ȯ�˴ϴ�"+ ": ", sec);
		System.out.print((sec - sec % 3600)/3600 + "�ð� ");
		System.out.print((sec%3600)/60  + "�� ");
		System.out.print(sec%60 + "��");
		
	}

}
