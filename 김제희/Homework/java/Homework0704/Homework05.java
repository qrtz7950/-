package kr.co.Homework0704;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		
		double ex = 1092.50;
		System.out.printf("���� 1�޷� = %.2f��\n", ex);
		System.out.printf("ȯ���ϰ���� �޷��� �Է��ϼ���: ", ex);
		
		Scanner sc = new Scanner(System.in);
		int dollar = sc.nextInt();
		
		System.out.printf("ȯ���ϱ����ؼ��� %.2f���� �ʿ��մϴ�", ex * dollar);
		
		
	}
}
