package kr.co.mlec.homework.homework06;

import java.util.Scanner;

public class HomeworkMain06_01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ControlString a = new ControlString();
		String str;
		char c;
		
		System.out.print("���ڿ� �Է��غ��ƶ� : ");
		str = s.nextLine();		
		System.out.print("���ڿ����� Ȯ���غ� ���� �Է��غ��ƶ� : ");
		c = s.nextLine().charAt(0);
		
		System.out.println("�������� " + a.checkChar(str, c) + "��");
		System.out.println("===============================");
		
		
		System.out.print("���ڿ� �Է��غ��ƶ� : ");
		str = s.nextLine();		
		System.out.print("���ڿ����� ���� ���ڸ� �Է��غ��ƶ� : ");
		c = s.nextLine().charAt(0);
		System.out.println(a.removeChar(str, c));
		System.out.println("===============================");
		
		s.close();
	}

}
