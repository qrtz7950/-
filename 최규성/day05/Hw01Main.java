package day05Hw;

import java.util.Scanner;

class Ice {
	String name;
	int won;
}

public class Hw01Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���̽�ũ�� � �����ҷ�? : ");
		int a = Integer.parseInt(sc.nextLine()); // sc�Է¹��� ���ڿ��� �������� ��ȯ
		sc.nextLine(); // ���۸� ����ֱ� ���� �ݵ�� �ʿ��ϴ�.
		System.out.println();
		Ice[] iceArr = new Ice[a];

		for (int i = 0; i < iceArr.length; i++) {
			iceArr[i] = new Ice();
		}

		for (int i = 0; i < a; i++) {
			System.out.println((i + 1) + "��° ���̽�ũ�� �����Է�");
			System.out.print("���̽�ũ�� ��: ");
			iceArr[i].name = sc.next();
			System.out.print("���̽�ũ�� ����:");
			iceArr[i].won = sc.nextInt();
			sc.nextLine(); // ���۸� ����ֱ� ���� �ݵ�� �ʿ��ϴ�.
			System.out.println();

		}

		System.out.println("���̽�ũ�� ���� ����");
		System.out.println("��ȣ\t���̽�ũ����\t���̽�ũ������");
		for (int i = 0; i < iceArr.length; i++) {
			System.out.println((i + 1) + "\t" + iceArr[i].name + "\t\t" + iceArr[i].won);
		}
	}

}
