package kr.co.mlec.day02;
import java.util.Random;

/*
 * Random class: ������ ������ �����ϴ� ����ϴ� Ŭ����
 * ����Ϸ��� Random class�� �ٸ� ��Ű��(package java.util;)�� �ִ� Ŭ�����̴� �̸� ����ϱ� ���ؼ� 
 * import�� ����Ѵ� import java.util.Random;�� �Է��Ͽ� �ش� ��Ű���� Ŭ������ ����Ҽ� �ֵ����Ѵ�
 * 
 * 
 */

public class RandomMain {

	public static void main(String[] args) {
		
		Random r = new Random(); //�̰� �⺻���� ���°�
		//��Ʈ�� ������ Ŭ������ ���콺�� Ŭ�� java\src�� ����
		
		int num = r.nextInt(); //������ ������ �����ϴ� �޼ҵ�
		System.out.printf("������ �� num: %d\n",num);
		
		// 0~9 ������ ������ �����ϰ�ʹ�
		r.nextInt(10);
		//�޼ҵ� �ȿ� �Ű����� 10�� ������ �������� ����� ���� 10���� ���� ������ ������ �� (0-9)
		
		num = r.nextInt(101); //0~100
		System.out.println("0~9������ ������ ��: "+ num);
		
		num = r.nextInt(100) + 1; //0+1~99+1 = 1~100
		System.out.println("1~100������ ������ ��: "+ num);
	}

}
