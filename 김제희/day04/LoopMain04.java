package kr.co.mlec.day04;

import java.util.Scanner;

/*
 * 2-10������ ������ �Է��ϸ� ���ڸ�ŭ hello�� ���
 * 
 * 2-10 ������ ���ܽ� 1���� hello�� ���
 * 
 * �� ���ڴ� ����� �����Ѵ�
 */
public class LoopMain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		
		int num = sc.nextInt();

/*
		if(num <=10) {
				for(int i=1; i<=num; i++) {
					System.out.println("hello");
				}
		} else 
			System.out.println("hello");
		}
*/
		
/*		
		for(int i=1; i<=num; i++) {
			System.out.println("hello");
			
			if(num > 10) {
				break;
			}
*/
		
		for(int i=1; i<=num; i++) {
			if(i % 2 == 0) {
				System.out.println();
			}
			
			System.out.print("hello");
		}
		
	}

}
