package kr.co.mlec.day02;
	/*
	 * ����ȯ
	 * =(���Կ�����)�� �������� �¿��� �ڷ����� Ÿ���� ���� �ٸ��� �߻�
	 * ex) A=B; �϶� A�� B�� �ڷ����� ���� �ٸ���
	 * �� ��ȯ�� �⺻�ڷ��� 8������ boolean���� ������ ���������� �����Ѵ�
	 * 
	 * ������ ����
	 * 
	 * byte < short < int < ling < float < double
	 * 		 (char)
	 * 
	 * ���� 
	 * 1.����������ȯ
	 * 	ũ�Ⱑ ���� Ÿ���� ���� �� ū �ڷ����� ������ ���Ե� �� ������ ����ȯ�̴�.
	 * 	EX) double num = int;
	 * 		long = byte;
	 * 	EX) ���� �����ڸ� �������ε� ����������ȯ�� �Ͼ��
	 * 		int num01 = 3;
	 * 		double num02 = 2.2525;
	 * 		num01 + num02 = 5.2525;
	 * 2.������ ����ȯ or ����� ����ȯ
	 * 	double num;
	 * 	int i = 20;
	 * 
	 * 	num = (doulbe) i;
	 * 	������ ���� ����ȯ�� ��� (double)�� ������ �� �ִٸ� ������ ����ȯ �����Ҽ� ���ٸ� ������ �Ǵ� ����� ����ȯ
	 */
public class CastMain {

	public static void main(String[] args) {
		double d;
		d = 10; //����������ȯ �߻� double d = (double) int;
		System.out.printf("d: %f\n",d);
		
		int num;
		
		//num = 12.34; ����ȯ int = double; = ����
		num = (int)12.34;
		System.out.printf("num: %d\n",num);
		
		System.out.println((int)10.0/(int)3.0);
		System.out.println((int)(10.0/3.0));
		//�����⿡�� �������� ���� ���� ���� ��� ���� ����ȯ�� �� ���� ����ϰų� ����� ���� ����ȯ�ߴ�
		
		
	}

}
