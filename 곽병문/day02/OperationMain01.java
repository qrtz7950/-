package kr.co.mlec.day02;

import java.util.Scanner;

/*
 *  ���� 2���� �Է¹޾� �ι�° ������ ù��° ������ ������� �Ǵ�
 *  ù��° ���� : 12
 *  �ι�° ���� : 3
 */

public class OperationMain01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num1 = s.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int num2 = s.nextInt();
		
		boolean bool = (num2 != 0) && (num1 % num2 == 0);
		
		if(bool) {
			System.out.println("��� o");
		}
		else {
			System.out.println("��� x");
		}
		
		s.close();

	}

}
