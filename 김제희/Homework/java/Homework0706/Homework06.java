package kr.co.Homework0706;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���۴�: ");
		int a = sc.nextInt();
		System.out.print("�����: ");
		int b = sc.nextInt();
		int c = 0;
		
		if(a>b) {
			c=a; a=b; b=c;
		}

		for (int i = a; i <= b; i++) {
			System.out.println("****" + i + "��" + "****");
			for (int j = 2; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		
	}

}
