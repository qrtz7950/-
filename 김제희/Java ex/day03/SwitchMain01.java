package kr.co.mlec.day03;

import java.util.Scanner;

/*
 * 1-3 ������ ���� : 1
 * ONE
 * 1-3 ������ ���� : 2
 * TOW 
 * 1-3 ������ ���� : 3
 * THREE
 * 1-3 ������ ���� : 1
 * 123�� �ƴ϶�� ERROR
 */

public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1-3 ������ ����: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("ONE");
		case 2 :
			System.out.println("TWO");
		case 3 :
			System.out.println("THREE");
		default : 
			System.out.println("ERROR");
		}
		//������ Ż���� ���� break;�ʿ�
	}

}
