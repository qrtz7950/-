package day02;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("���ڿ��Է�: ");
//		String str = sc.next();  hello world�� �Է��ϸ� hello�� ����ϰ� world�� ��������
		String str = sc.nextLine(); //����Ű�� ������������ ���ڿ� ���
		System.out.println("str: " + str);
		
		System.out.print("\n�����Է�: ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("�Է��� ���� :" + ch);
		
				
				
		System.out.print("\n������ �Է�: ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool:" + bool);
		
		System.out.print("\n�Ǽ� �Է�:" );
		double d = sc.nextDouble();
		System.out.println("�Է��� �Ǽ�: " + d);
		
		System.out.print("\n�����Է�: ");
		int num = sc.nextInt();
		System.out.println("�Է��� ����: " + num);
	}

}
