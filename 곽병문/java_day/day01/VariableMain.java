package kr.co.mlec.day01;

/*
 * �⺻�ڷ���(8����)[byte]
 * 	- ���� : boolean[1]
 * 	- ������ : byte[1], short[2], int[4], long[8]
 * 	- �Ǽ��� : float[4], double[8]
 * 	- ������ : char[2]
 * 
 * ���� ����Ͽ� ����
 */
import java.util.Scanner;					// �Է¿�
import java.util.InputMismatchException;	// ����ó����

public class VariableMain {

	public static void main(String[] args) {
		
		int a, b;
		System.out.println("*****���� ���� �ΰ� �Է�*****");
		
		System.out.print("a = ");
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				a = scan.nextInt();
				break;
			}
			catch( InputMismatchException e) {
				scan = new Scanner(System.in);
				System.out.println("�߸��Է�, �ٽ�");
				System.out.print("a = ");
			}
		}
		
		System.out.print("b = ");
		while(true) {
			try {
				b = scan.nextInt();
				break;
			}
			catch( InputMismatchException e) {
				scan = new Scanner(System.in);
				System.out.println("�߸��Է�, �ٽ�");
				System.out.print("b = ");
			}
		}
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		
		String c, d;
		System.out.println("*****���� ���� �ΰ� �Է�*****");
		
		System.out.print("c = ");
		c = scan.next();
		
		System.out.print("d = ");
		d = scan.next();
		
		System.out.printf("%s + %s = %s", c, d, c+d);
		
		scan.close();
	}
}
