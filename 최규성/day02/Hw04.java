package day02;
import java.util.Scanner;

public class Hw04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int a = sc.nextInt();
		System.out.print("���� ���� �Է��ϼ���: ");
		int b = sc.nextInt();
		
		System.out.println("��: " + a/b);
		System.out.println("������: " + a%b);
	}

}
