package kr.co.mlec.homework.homework01;

import java.util.Scanner;

public class Homework01_04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int a = s.nextInt();
		System.out.print("���� ���� �Է��ϼ��� : ");
		int b = s.nextInt();
		
		System.out.printf("�� : %d\n", a/b);
		System.out.printf("������ : %d", a%b);
		
		s.close();
	}

}
