package kr.co.Homework0704;

import java.util.Scanner;

public class HomeWork04 {
	public static void main(String[] args) {
		
		System.out.print("����� ���� ������ �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("���� ���� �Է��ϼ���: ");
		int num2 = sc.nextInt();
		System.out.printf("��: %d\n", num/num2);
		System.out.printf("������: %d", num%num2);
	}

}
