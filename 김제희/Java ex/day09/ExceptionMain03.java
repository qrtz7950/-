package kr.co.mlec.day09;

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {
		
		System.out.println("Main start.......");
		
//		for(int i = -2; i<4; i++) {
//		try {
//			System.out.println(10/i);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
		
//		try {
//			System.out.println(2 / 0);
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("Hello");
//		}
		//��¶�� �����ϴ� finally ����
		
		for(int i = -2; i < 4; i++) {
			try {
				System.out.println(10 / i);
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("���ܹ߻�...");
				break;
			} finally {
				System.out.println("�ݺ��� ������...");
			}
		}
		System.out.println("Main end.......");
		//���ܰ� �߻��ϴ� ����
	}
}
