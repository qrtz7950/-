package kr.co.mlec.day02;
import java.util.Scanner;


public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
//		String str = sc.next();				// ���鹮��(enter,tab,space)�� ���ڿ� ����
											// �ܾ������ ��
		String str = sc.nextLine();			// enter�� ���ڿ� ����
		System.out.println("str = " + str);
		
		System.out.print("���� �Է� : ");
		char c = sc.nextLine().charAt(0);
		System.out.println("c : " + c);
		
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		System.out.println("n : " + n);
		
		System.out.print("�Ǽ� �Է� : ");
		double d = sc.nextDouble();
		System.out.println("d : " + d);
		
		System.out.print("���� �Է� : ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool : " + bool);
		
		sc.close();
	}

}
