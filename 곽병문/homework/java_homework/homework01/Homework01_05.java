package kr.co.mlec.homework.homework01;

import java.util.Scanner;

public class Homework01_05 {

	public static void main(String[] args) {
		
		System.out.print("�޷��� �Է��ϼ��� : ");
		Scanner s = new Scanner(System.in);
		
		int dol = s.nextInt();
		
		System.out.printf("��ȭ : %.2f��", dol*1092.50);
		
		s.close();
	}

}
