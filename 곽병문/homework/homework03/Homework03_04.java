package kr.co.mlec.homework.homework03;

import java.util.Scanner;

/*
 * ���� �Է¹޾� �ش� �������� ���
 * 2~9���� �� �Է� : 6
 * *** 6�� ***
 * 6 * 1 = 6
 * ...
 * 6 * 9 = 54
 */

public class Homework03_04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("2 ~ 9 ������ �� �Է� : ");
		n = s.nextInt();
		
		System.out.println("*** " + n + "�� ***");
		for(int i=1; i<=9; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		
		s.close();
	}

}
