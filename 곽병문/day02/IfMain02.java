package kr.co.mlec.day02;

import java.util.Scanner;

public class IfMain02 {

	public static void main(String[] args) {
		
		System.out.print("�б��� ������? : ");
		Scanner s = new Scanner(System.in);
		String where = s.nextLine();
		System.out.println(where);
		
		if(where.equals("�б�")) {
			System.out.println("����: �ù���");
		}else {
			System.out.println("�Լ�: �ù���");
		}
		
		s.close();
	}

}
