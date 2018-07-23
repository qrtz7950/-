package kr.co.mlec.homework.homework03;

import java.util.Scanner;

/*
 * ���۴�, ������� �Է¹޾� �������� ���
 * ���۴� : 6 8
 * ������ : 8 6
 */

/*
 * 2-9���� ������ ���(�Ѷ��ο� 3�ܾ� ���)
 * *** 2�� ***	*** 3�� ***	*** 4�� ***
 * ...
 * *** 8�� ***	*** 9�� ***
 * ...
 * for(int i=2; i <=9; i++){}�� ��ü ����
 * �ݺ��� �ִ� 3���� ���
 */

public class Homework03_06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i1, i2;
		
		System.out.print("���۴� : ");
		i1 = s.nextInt();
		System.out.print("����� : ");
		i2 = s.nextInt();
		
		System.out.println();
		
		for(int i = (i1<i2 ? i1 : i2); i<=(i1>i2 ? i1 : i2); i++) {
			System.out.println("*** " + i + "�� ***");
			for(int j = 1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------");
		
		
		for(int i=2; i<=9; i+=3) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<3; k++) {
					if(i+k<10) {
						if(j==0) {
							System.out.print("*** " + (i+k) + "�� ***\t");
						}
						else {
							System.out.print((i+k) + " * " + j + " = " + (i+k)*j + "\t");
						}
					}
				}
				System.out.println();
				
			}
		}
		
		s.close();
	}

}
