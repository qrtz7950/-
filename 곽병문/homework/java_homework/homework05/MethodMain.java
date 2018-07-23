package kr.co.mlec.homework.homework05;

import java.util.Scanner;

/*
 *  �ϳ��� ���ڸ� �Է¹޾� �ش� ���ڰ� �빮���̸� true�� ��ȯ�ϴ� isUpperChar(char c) �޼ҵ� �ۼ�
 *  �ϳ��� ���ڸ� �Է¹޾� �ش� ���ڰ� �ҹ����̸� true�� ��ȯ�ϴ� isLowerChar(char c) �޼ҵ� �ۼ�
 *  �ΰ��� ���ڸ� �Է¹޾� ū���� ��ȯ�ϴ� max(int i, int j) �޼ҵ� �ۼ�
 *  �ΰ��� ���ڸ� �Է¹޾� �������� ��ȯ�ϴ� min(int i, int j) �޼ҵ� �ۼ�
 *  ���ڿ��� �Է¹޾� �Ųٷ� �����ϴ� reverseString(String str) �޼ҵ� �ۼ�
 *  ���ڿ��� �Է¹޾� �빮�ڷ� �����ϴ� toUpperString(String str) �޼ҵ� �ۼ�
 *  ���ڿ��� �Է¹޾� �ҹ��ڷ� �����ϴ� toLowerString(String str) �޼ҵ� �ۼ�
 */

public class MethodMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		StringUtil a = new StringUtil();
		
		// �빮��, �ҹ���
		System.out.print("�ϳ��� ���ڸ� �Է� : ");
		char c = s.nextLine().charAt(0);
		
		System.out.println(c + "�� �빮�� : " + a.isUpperChar(c));
		System.out.println(c + "�� �ҹ��� : " + a.isLowerChar(c));
		System.out.println("====================================================");
		
//----------------------------------------------------------------------------------
		// ū��, ������
		System.out.println("< �ΰ��� ���� �Է� >");
		System.out.print("n1 = ");
		int n1 = Integer.parseInt(s.nextLine());
		System.out.print("n2 = ");
		int n2 = Integer.parseInt(s.nextLine());
		
		System.out.println("ū�� : " + a.max(n1, n2));
		System.out.println("������ : " + a.min(n1, n2));
		System.out.println("====================================================");
		
//----------------------------------------------------------------------------------
		// ���ڿ� �Ųٷ� ����
		String str = new String();
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();
		System.out.println("�Ųٷ� : " + a.reverseString(str));
		System.out.println("====================================================");
		
//----------------------------------------------------------------------------------
		// ���ڿ��� �Է¹޾� �빮�ڷ� ����
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();
		System.out.println(a.toUpperString(str));
		System.out.println("====================================================");
		
//----------------------------------------------------------------------------------
		// ���ڿ��� �Է¹޾� �ҹ��ڷ� ����
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();
		System.out.println(a.toLowerString(str));
		
		s.close();
	}

}
