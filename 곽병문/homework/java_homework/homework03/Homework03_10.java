package kr.co.mlec.homework.homework03;

import java.util.Scanner;

/*
 * 5���� ������ ������ ���� �Է¹޾� ����ϴ� �ڵ带 �ۼ�
 * 
 * num1 : 6
 * num2 : 12
 * num3 : 9
 * 	6, 12���� ū ������ �մϴ�
 * num3 : 25
 * num4 : 9
 * 	6, 12, 25���� ū ������ �մϴ�
 * num4 : 22
 *  6, 12, 25���� ū ������ �մϴ�
 * num4 : 40
 * num5 : 77
 * 
 * < PRINT >
 * 6 12 25 40 77
 */

public class Homework03_10 {
	
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		int[] n = new int[5];
		
		for(int i=0; i<n.length; i++) {
			System.out.print("num"+(i+1)+" : ");
			n[i] = s.nextInt();
			
			if(i!=0 && n[i]<n[i-1]) {
				for(int j=i; j>0; j--) {
					if(j!=i) {
						System.out.print(",");
					}
					System.out.print(" "+n[i-j]);
				}
				i--;
				System.out.println("���� ū������ �մϴ�");
			}
		}
		System.out.println("\n< Print >");
		
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i] + " ");
		}
		
		s.close();
	}
}
