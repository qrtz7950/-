package kr.co.Homework0704;

import java.util.Scanner;

public class Homework11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		int a = sc.nextInt();
		System.out.print("�ι�° ����: ");
		int b = sc.nextInt();
		System.out.print("����° ����: ");
		int c = sc.nextInt();
		System.out.print("�׹�° ����: ");
		int d = sc.nextInt();

		if(a>b && a>c && a>d) {
			System.out.printf("���� ū �� : %d" , a);
		}
		if(b>a && b>c && b>d) {
			System.out.printf("���� ū �� : %d" , b);
		}
		if(c>a && c>b && c>d) {
			System.out.printf("���� ū �� : %d" , c);
		}
		if(d>a && d>b && d>c) {
			System.out.printf("���� ū �� : %d" , d);
		}
	}
		
}
