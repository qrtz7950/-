package day02;
import java.util.Scanner;
public class Hw08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���ǰ�: " );
		int a = sc.nextInt();
		System.out.print("���ұݾ�: " );
		int b = sc.nextInt();
		int z = b-a;
		System.out.println("�Ž�����: " + z);
		System.out.println("1000��: " + z/1000);
		z = z%1000;
		System.out.println(" 500��: " + z/500);
		z = z%500;
		System.out.println(" 100��: " + z/100);
		z = z%100;
		System.out.println("  50��: " + z/50);
		z = z%50;
		System.out.println("  10��: " + z/10);
		
	}

}
