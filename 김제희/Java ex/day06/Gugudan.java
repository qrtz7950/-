package kr.co.mlec.day06;

import java.util.Scanner;

public class Gugudan {
	
	/*
	 * Ű����� ���� �Է¹޾� ȣ���� �޼ҵ忡 �����ϴ� ���
	 * @retuen �Է´�
	 */
	
	int getDan() {
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		sc.nextLine();
		
		return dan;
		
	}
	
	int getDan(String msg) {
		
		System.out.print(msg);
		
//		int dan = sc.nextInt();
//		return dan;
		
		return getDan();
		
	}
	
	/*
	 * ȣ���� �޼ҵ尡 �Ѱ��� ���� ����ϴ� ��� ����
	 * @param dan
	 */
	void print(int dan) {
		
		System.out.println();
		for(int i =0; i<9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	
	void print() {
		
		print(2,9);
		
		/*
		for(int dan = 2; dan <= 9; dan++) {
			print(dan);
		}
		*/
		
		/*
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "�� ***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		}
		*/
		
	}

	void print(int start, int end) {
		
		for(int dan = start; dan<=end; dan++) {
			print(dan);
		}
		
		
	}

}	
	
