package kr.co.Homework0706;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ����� ����ұ��: ");
		int num = sc.nextInt();
		
		System.out.println("****"+ num + "��" + "****");
		
		for(int i = 2; i<=9; i++) {
			System.out.println(num + "*" + i+ "=" + num*i);
		}

	}
}
