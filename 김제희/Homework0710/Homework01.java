package kr.co.Homework0710;

import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		StringUtil s = new StringUtil();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(s.isUpperChar(s.charGet()));
		System.out.println(s.isLowerChar(s.charGet()));
		
		System.out.println("���� �ΰ��� �Է��غ��ô�");
		
		int a = s.intGet();
		int b = s.intGet();
		
		System.out.println(s.max(a,b));
		System.out.println(s.min(a,b));
		
		System.out.println("������ ���ڿ��� �Է��غ��ô�");
		String str = new String();
		str =  sc.nextLine();
		System.out.println(new String(s.reverseString(str)));
		
		System.out.println("�빮�ڷ� ������ ���ڸ� �Է��غ��ô�");
		String str2 = new String();
		str2 =  sc.nextLine();
		System.out.println(s.toUpperString(str2));
		
		System.out.println("�ҹ��ڷ� ������ ���ڸ� �Է��غ��ô�");
		String str3 = new String();
		str3 =  sc.nextLine();
		System.out.println(s.toLowerString(str3));
	}

}
