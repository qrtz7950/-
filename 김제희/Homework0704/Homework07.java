package kr.co.Homework0704;

import java.util.Scanner;

public class Homework07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�(���ĺ�): ");
		String inputStr= sc.nextLine();
		
		//65=<�빮��=<90 97=<�ҹ���=<122
		
		System.out.print("����� ��: ");
		
		char c = inputStr.charAt(0);
		if(c>=65 && c<=90) {
			System.out.println((char)(c+32));
		} else if(c>=97 && c<=122) {
			System.out.println((char)(c-32));
		}
	}
}