package kr.co.mlec.day04.exam;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5���� ������ �Է� �޾� ����ϴ� �ڵ带 �ۼ��غ���
 * num1 : 12
 * num2 : 6
 * num3 : 33
 * num4 : 82
 * num5 : 5
 * 
 */

public class ExamMain01 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("5���� ������ ���ʴ�� �Է��Ͻÿ�");
		
		int [] nArr = new int[5];
		
		for(int i=0; i<nArr.length; i++) {
			System.out.print("num" + i + ": ");
			nArr[i] = sc.nextInt(); 
		}
		
		for(int i=0; i<nArr.length; i++) {
			System.out.println("num" + i + ": " + nArr[i]);
		}

	}

}
