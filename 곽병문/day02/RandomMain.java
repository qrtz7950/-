package kr.co.mlec.day02;

import java.util.Random;

/*
 *  Random Ŭ���� : ������ ������ �����ϴ� ����� �ϴ� Ŭ����
 */

public class RandomMain {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num = r.nextInt();				// ������ ������ �����ϴ� �޼ҵ�
		System.out.println("������ ���� : " + num);
		
		// 0 ~ 9������ ���� ����
		num = r.nextInt(10);
		System.out.println("0 ~ 9 ���� : " + num);
		
		// 1~100������ ���� ����
		num = r.nextInt(100)+1;
		System.out.println("1 ~ 100 ���� : "+ num);
		
	}

}
