package kr.co.Homework0711;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AreaMain s = new AreaMain(); 
		
		System.out.println("�־��� ���ڿ����� ���ڸ� ã�� ����� ����ȴ�");
		System.out.println("���ڿ��� �Է�");
		String strData = sc.nextLine();
		System.out.println("���ڸ� �Է�");
		char ch = sc.nextLine().charAt(0);

		System.out.println(charUtil.checkChar(strData, ch));
		
		System.out.println("�־��� ���ڿ����� ���ڸ� �����ϴ� ����� ����ȴ�");
		System.out.println("���ڿ��� �Է�");
		strData = sc.nextLine();
		System.out.println("���ڸ� �Է�");
		ch = sc.nextLine().charAt(0);
		
		System.out.println(charUtil.removeChar(strData, ch));

	}

}
