package kr.co.mlec.day02;

public class ConstMain {

	public static void main(String[] args) {
		int radius = 10;
		final double PI = 3.14;		//������ ���ó�� ����ϰ� ���ִ� final Ű����
									//finalŰ���尡 �ٿ��� ������ �빮�ڷ� ����
		
		System.out.printf("���ѷ���: " + (2 * radius * PI));
									//int * int * double
									//���ʺ��� 2���� ����Ͽ� int * int = int
									// int * double = double
		
		//pi = 3.141592;
		//System.out.printf("���ѷ���: " + (2 * radius * PI));
		//finalŰ���尡 ������ ������ ���� �ٲٷ��� �� ��� ������ ����
	}
}
