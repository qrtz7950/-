package day07Hw;
import java.util.Scanner;
public class Hw01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ControlString a = new ControlString();
		String str;
		char c;
		
		
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();		
		System.out.print("���ڿ����� ������ Ȯ���غ� ���� �Է�: ");
		c = s.nextLine().charAt(0);
		
		System.out.println("���� ���ڼ�: " + a.checkChar(str, c) + "��");
		System.out.println("===============================");
		
		
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();		
		
		System.out.print("���ڿ����� ���� ���� �Է� : ");
		c = s.nextLine().charAt(0);
		System.out.println(a.removeChar(str, c));
		System.out.println("===============================");
		
		s.close();
	}

}
