package kr.co.mlec.day02;

/*
 * ����ȯ
 * =(���Կ�����)�� �������� �¿��� �ڷ����� Ÿ���� ���� �ٸ��� �߻�
 * 
 * byte < short < int < long < float < double
 * 
 * ����
 * 1.����������ȯ
 * 		double = int;
 * 		long = byte;
 * 2.����������ȯ
 */

public class CastMain {

	public static void main(String[] args) {
		
		double d;
		
		d = /*(double)*/10;		// ����������ȯ	double = (double)int
		System.out.println("d : " + d);
		
		int num;
		
		num = (int)12.34;	// ����������ȯ	int = double
		
		System.out.println("num : " + num);
		
		System.out.println(10.0 / 3.0);
		System.out.println((int)10.0 / (int)3.0);
		System.out.println((int)(10.0 / 3.0));
		
		

	}

}
