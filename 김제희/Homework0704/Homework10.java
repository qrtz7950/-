package kr.co.Homework0704;

import java.util.Scanner;

public class Homework10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		int a = sc.nextInt();
		System.out.print("�ι�° ����: ");
		int b = sc.nextInt();
		System.out.print("����° ����: ");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			if (b>c) {
				System.out.printf("%d %d %d",a, b, c); 
			} else {
				System.out.printf("%d %d %d",a, c, b); 
			}
		}
		if(b>a && b>c) {
			if (a>c) {
				System.out.printf("%d %d %d",b, a, c); 
			} else {
				System.out.printf("%d %d %d",b, c, a); 
			}
		}
		if(c>a && c>b) {
			if (a>b) {
				System.out.printf("%d %d %d",c, a, b); 
			} else {
				System.out.printf("%d %d %d",c, b, a); 
			}
		}
	}
}
