package kr.co.Homework0704;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		System.out.print("���ǰ��� �Է�: ");
		Scanner sc = new Scanner(System.in);
		int pri = sc.nextInt();
		System.out.print("������ ���� �׼�: ");
		int mon = sc.nextInt();
		
		int ex = mon-pri;
		
		System.out.printf("\n�Ž�����: %d��\n", ex);
		System.out.printf("1000�� : %d��\n", ex/1000);
		System.out.printf(" 100�� : %d��\n", (ex%1000)/100);
		System.out.printf("  50�� : %d��\n", (ex%100)/50);
		System.out.printf("  10�� : %d��\n", (ex%50)/10);
	}
}
