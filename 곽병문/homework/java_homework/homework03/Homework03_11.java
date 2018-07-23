package kr.co.mlec.homework.homework03;

import java.util.Scanner;

/*
 * �л� 5���� ������ �Է¹޾� ������ ���� ����ϴ� �ڵ带 �Է�
 * 1's ���� : 84					90~100 : A
 * 2's ���� : 1000				80~89  : B
 * 3's ���� : -45					70~79  : C
 * 4's ���� : 99					60~69  : D
 * 5's ���� : 56					0~59   : F
 * 
 * < PRINT >
 * ��ȣ	����	����
 *  1	84	 B
 *  2	ERROR!!!
 *  3	ERROR!!!
 *  4	99	 A
 *  5	56	 F
 * 5ȸ �Է� �� [2]ȸ �����߻�
 * ���� : 239��			// �ùٸ��͸�
 * ��� : 47.80��			// ����/���
 */

public class Homework03_11 {
	
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		int[] score = new int[5];		// ����
		char c;							// ����
		int e = 0;						// ������
		int sum = 0;						// ����
		
		for(int i=0; i<score.length; i++) {			// ���� �Է�
			System.out.printf("%d\'s ���� : ", i+1);
			score[i] = s.nextInt();
		}
		System.out.println();
		
		System.out.println("< PRINT >\n��ȣ \t ���� \t ����");
		for(int i=0; i<score.length; i++) {
			if(score[i]>=0 && score[i]<=100) {
				switch(score[i]/10) {
					case 10 :
					case 9 :
						c = 'A';
						break;
					case 8 :
						c = 'B';
						break;
					case 7 :
						c = 'C';
						break;
					case 6 :
						c = 'D';
						break;
					default :
						c = 'F';
				}
				sum += score[i];
				System.out.printf("%d \t %d \t %c\n", i+1, score[i], c);
			}
			else {
				System.out.printf("%d \t ERROR!!!\n", i+1);
				e++;
			}
		}
		System.out.println("    5ȸ �Է� �� [" + e + "]ȸ �����߻�");
		System.out.println("\t���� : " + sum + "��");
		System.out.printf("\t��� : %.2f��",sum/(double)score.length);
		
		
		s.close();
	}
}
