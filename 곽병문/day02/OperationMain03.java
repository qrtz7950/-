package kr.co.mlec.day02;

import java.util.Random;

public class OperationMain03 {
	
	public static void main(String[] arg) {
		
		Random r = new Random();
		int num = r.nextInt(11);	// 1 ~ 10
		
		System.out.println("����� num : " + num);
		
		String msg = (num % 2 == 0) ? "¦��" : "Ȧ��";
		
		System.out.println(msg);
		System.out.println((num % 2 == 0) ? "¦��" : "Ȧ��");
		
		int n = r.nextInt(11);		// 0 ~ 10
		System.out.println("����� n : " + n);
		System.out.println((n==0)?"�ش�x":((n % 2 == 0) ? "¦��" : "Ȧ��"));
		
	}

}
