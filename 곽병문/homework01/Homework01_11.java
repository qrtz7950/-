package kr.co.mlec.homework01;

import java.util.Scanner;

public class Homework01_11 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� 4�� �Է� : ");
		String stra = s.next();
		int a = Integer.parseInt(stra);
		String strb = s.next();
		int b = Integer.parseInt(strb);
		String strc = s.next();
		int c = Integer.parseInt(strc);
		String strd = s.next();
		int d = Integer.parseInt(strd);
		
		
		
		if(a>b && a>c && a>d) {
			System.out.printf("���� ū�� : %d", a);
		}
		if(b>a && b>c && b>d) {
			System.out.printf("���� ū�� : %d", b);
		}
		if(c>a && c>b && c>d) {
			System.out.printf("���� ū�� : %d", c);
		}
		if(d>a && d>b && d>c) {
			System.out.printf("���� ū�� : %d", d);
		}
		
		s.close();
	}

}
