package day04Hw;
import java.util.Scanner;
public class Hw06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���۴�: ");
		int a = sc.nextInt();
		System.out.print("�����: ");
		int b = sc.nextInt();
		for (int i = a; i < 10; i++) {
			System.out.println();
			System.out.println(i+"��");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));

			}
			if(i == b) {
				break;
			}
		}

	}

}
