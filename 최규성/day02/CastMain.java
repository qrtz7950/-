package day02;
/*
 * 	����ȯ
 *  =, +, -, ... (������)�� �������� �¿��� �ڷ����� Ÿ���� ���δٸ��� �߻�
 *  A = B;
 *  
 *  byte < short, char < int < long < float < double (����)
 *  
 *  ����
 *  1. ������ ����ȯ: �ڷ��� ������ ���� �ڷ������� ���� �ڷ��������� ��ȯ�� �ý����� �ڵ����� ����
 *  	double = int;
 *  	long = byte;
 *  
 *  	ex) double num;
 *  		int i =20;
 *  		
 *  		num = (double) i; (�¿��� �ڷ����� �ٸ��� ������ ��ȣ�� ����ؼ� �Ͻ������� ����ȯ�ؼ� ����Ѵ�. ��ȣ�� ������ �� ������ ����������ȯ, �׷� �� ���� ���� ������ ����ȯ)
 *  2. ������ ����ȯ: �ڷ��� ������ ���� �ڷ������� ���� �ڷ��������� ��ȯ�� �ý��ۿ��� �ڵ����� ������ �� ������ ���α׷��Ӱ� ������ ��ȯ�ؾ���
 */
public class CastMain {

	public static void main(String[] args) {

		double d;
		
		d = (double) 10; //����ȯ double  = (double)int
		System.out.println("d: " + d);  //��°�: 10.0
		
		
		int num;
		
		num =(int) 12.34; //int���� �Ǽ� �����ؼ� ����ȯ�� ���� (int) �߰�
		System.out.println("num: " +num);
		
		System.out.println((int)12.0/(int)3.49); //�Ǽ� �������� ���� ���
		System.out.println((int)(10.2/3.7));
		
	}

}
