package kr.co.mlec.homework01;

import java.util.Scanner;

public class Homework01_08 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ǰ��� �Է� : ");
		int howmuch = s.nextInt();
		System.out.print("������ ���� �׼� : ");
		int money = s.nextInt();
		
		int back = money - howmuch;
		
		System.out.println("\n�Ž��� �� : " + back + "��");
		System.out.printf("1000�� : %d��\n", back/1000);
		back %= 1000;
		System.out.printf(" 500�� : %d��\n", back/500);
		back %= 500;
		System.out.printf(" 100�� : %d��\n", back/100);
		back %= 100;
		System.out.printf("  50�� : %d��\n", back/50);
		back %= 50;
		System.out.printf("  10�� : %d��\n", back/10);
		
		s.close();
	}

}
