package kr.co.mlec.day04;

import java.util.Scanner;

/*
 * 2-10������ ������ �Է��ϸ� ���ڸ�ŭ "Hello" ���
 * ��, ���� ���̸� �ѹ��� ���
 */

public class LoopMain04 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("�ݺ��� Ƚ��? : ");
		int n = s.nextInt();
		if(n>0) {
					for(int i=0; i<n; i++) {
						System.out.println("Hello");
						if(n>=10) {break;}
					}
		}else {
			System.out.println("???");
		}
		
		s.close();
	}
}
