package day04Hw;

import java.util.Scanner;

public class Hw11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "\'s ����: ");
			score[i] = sc.nextInt();

		}
		int count = 0, sum = 0;
		System.out.println("<PRINT>");
		System.out.println("��ȣ \t  ���� \t ����");
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 0 && score[i] <= 100) {
				char grade;
				
				sum = sum + score[i];	//����
				
				if (score[i] >= 90) {
					grade = 'A';
					
				} else if (score[i] >= 80) {
					grade = 'B';
				} else if (score[i] >= 70) {
					grade = 'C';
				} else if (score[i] >= 60) {
					grade = 'D';
				} else {
					grade = 'F';
				}
				System.out.print(i + 1 + "\t" + score[i] + "\t"+grade);
				System.out.print(' ');
			} else

			{
				System.out.print(i + 1 + "\tERROR!!!");
				count++;
			}
			System.out.println();
		}
		System.out.println("5ȸ �Է��� [" + count + "]�� �����߻�");
		System.out.println("�� ��: " + sum + "��");
		System.out.println("���: "+ ((double)sum / 5)+ "��");
	}
}
