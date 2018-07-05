package kr.co.mlec.day01;

/*
 * �⺻�ڷ����� 8������ �ִ�
 * - ����: boolean (1)
 * - ������: byte(1), short(2), int(4), long(8)
 * - �Ǽ���: float(4), double(8)
 * - ������: char(2)
 * ��ȣ���� ���ڴ� �ڷ����� ���Ʈ������ ǥ�� float(4) = float�� 4����Ʈ �Ǽ��ڷ���
 */
public class VariableMain {

	public static void main(String[] args) {
		//�ڷ��� ������;
		//�ڷ�����ŭ�� ������ �Ҵ��ϰ� �� ������ �̸��� �������̶���Ѵ�
		char c; //������ �����
				//�������� ������ �������ؼ� �������� ���ڷ� �����Ҽ� ���� ���ڷθ� ���𰡴�
		c ='A'; //������ ���Ժ�,ġȯ��
		System.out.println("����: " + c);
		System.out.printf("����: %c\n", c);
		
		int num; //�������� C�ʹ� �ٸ��� ���� ������ ��� ���� �ص� ������
		
		num = 123;
		
		System.out.println("����: "+ num);
		
		double d;
		d = 12.345;
		System.out.printf("�Ǽ�: %f\n",d); 	//12.345000
		System.out.printf("�Ǽ�: %.4f\n",d); 	//12.3450
		System.out.printf("�Ǽ�: %.3f\n",d); 	//12.345
		
		boolean bool;
		bool = true;
		System.out.printf("����: %b\n",bool);
		
		char ch = 'A'; 		//����ο� ���Ժδ� ���ÿ� �� �� �ִ�.
		System.out.printf("ch: %c\n", ch);
		
		//int num2;
		//System.out.printf("num2: %d", num2);
		//�ʱ�ȭ���� ������ Có�� �����Ⱚ�� �����°� �ƴ϶� ������ ����
		
		ch = 'B'; //�̸� ����Ǿ��ִ� ������ �ڷ��� ���̵� ���ο� ������ ġȯ�� �� �ִ�
		System.out.printf("ch: %c\n", ch);
		
		ch = '\u0042'; //�����ڵ�ε� ǥ������
		System.out.printf("ch: %c\n", ch);
	}

}
