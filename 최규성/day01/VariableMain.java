package kr.co.mlec;

// �⺻�ڷ��� 8����-> ����(boolean1) ������(byte1 short2 int4 long8) �Ǽ���(float4 double8) ������(char) 
public class VariableMain {

	public static void main(String[] args) {
		
		char c; //������ �����
		c = 'A'; //������ ���Ժ� or ġȯ��
		System.out.println("����: "+ c);
		System.out.printf("����: %c", c);
		
		int num;
		num =123;
		System.out.println("\n����: " + num);
		
		double d;
		d= 12.345;
		System.out.println("�Ǽ�: "+d);
		System.out.printf("�Ǽ�: %f\n",d);
		
		boolean bool1;
		boolean bool2;
		bool1 = true;
		bool2 = false;
		System.out.println("����: " + bool1);
		System.out.printf("����: %b\n", bool2);
		
		char ch = 'Z'; //������ �ʱ�ȭ(����� ������ ���ÿ�)
		System.out.println(ch);
		ch = '\u0077'; //ch�� ��ü
		System.out.println(ch);
		
		int num2 = 0;
		System.out.println(num2);
	}

}