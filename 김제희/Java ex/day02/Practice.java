package kr.co.mlec.day02;

import java.util.Random;

public class Practice {
	public static void main(String[] args) {
		int a = 12425;
		double b;
		b=a;
		System.out.println("����ȯ: " + b);
		//��������ȯ
		a=(int)b;
		System.out.println("����ȯ: " + a);
		
		final int c = 2;
		//c=3; �����ȵ�
		
		Random r = new Random();

		int num = r.nextInt(10) + 1; //1~11������ ��
		System.out.println(num);
				
	}
}
