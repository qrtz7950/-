package kr.co.mlec.day02;

public class OperationMain02 {

	public static void main(String[] args) {
		
		int a = 1, b = -1, c = 0;
		System.out.println(++a >= 0 && ++b < 0 && c++>0);
		//false
		//a = 2, b= 0, c = 0
		//ù��° �� ������ �����̱� ������ �ڿ� �ִ� c++�� ���� �ʴ´� �׷��� c++������ ���� �ʾ� ������� c=0
		//��ǻ���� �������� ����� ���� 3���� ������ ������ ���
		System.out.println(a-- != 0 && ++b == 0 && ++c == 0);
		//false
		//a = 0, b= 0, c = 1
		System.out.println(--a < 0 && b-- <= 0 || c-- >= 0);
		//ture
		//a = 0, b= -1, c = -1
		System.out.println(a++ >= 0 || ++b < 0 && --c <= 0);
		//ture
		//a = 2, b= -1, c = 0
		System.out.printf("a = %d, b= %d, c = %d\n", a,b,c);
		
		}

}
