package day06Hw;

import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		StringUtil util = new StringUtil();
		Scanner ch = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		char ch1 = sc.nextLine().charAt(0);
		//1��
		boolean bool = util.isUpperChar(ch1);
		System.out.println(ch1 + "�� " +(bool ? "�빮���Դϴ�" : "�ҹ����Դϴ�"));
		//2��
		bool = util.isLowerChar(ch1);
		System.out.println(ch1 + "�� " +(bool ? "�ҹ����Դϴ�" : "�빮���Դϴ�"));
		//3 , 4��
		System.out.println("ù���� ����: ");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.println("�ι��� ����: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int max = util.max(num, num2);
		System.out.println(num +"," + num2 +"�� ū��: "+ max );
		int min = util.min(num, num2);
		System.out.println(num +"," + num2 +"�� ������: "+ min );
		//5��
		System.out.println("���ڿ��� �Է�: ");
		String str = sc.nextLine();
		String revStr = util.reverseString(str);
		System.out.println("[" + str + "] reverse-> "+ revStr);
		
		String upperStr = util.toUpperString(str);
		System.out.println("[" +str+ "�빮�� ����-> [" + upperStr + "]");
	
		String lowerStr = util.toLowerString(str);
		System.out.println("[" +str+ "�ҹ��� ����-> [" + lowerStr + "]");
		
	
	}
}
