package day06;

import java.util.Scanner;

public class Gugudan {
	/*
	 * Ű����� ���� �Է¹޾� ȣ���� �޼ҵ忡 �����ϴ� ���
	 * 
	 * @return �Է´�
	 */
	int getDan(String msg) {

		System.out.print(msg);

		return getDan(); // getDan�� ���ϰ� dan�� main�� ��ȯ

		// Scanner sc = new Scanner(System.in); //���� getDan�޼ҵ�� ��ġ�� �κ��� ���� ������ ���� �޼ҵ带
		// ȣ���ϱ����
		// int dan = sc.nextInt();
		// sc.nextLine();
		//
		//
		// return dan;
	}

	void print(int dan) { // ȣ���� �޼ҵ尡 �Ѱ��� 1���� ���� ����ϴ� ��� ����
		System.out.println("*** " + dan + "�� ***");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		System.out.println();
	}

	void print() { // ��� �������� ȣ���ϴ� �޼ҵ� void��
		
		print(2,9); 	//�ǹ��� ���� �� ��¸޼ҵ� ȣ���ؼ� 2-9�� ���� ���
		
		/*for (int dan = 2; dan <= 9; dan++) { // ���� print(int dan)�� ������ �ۼ� �ڵ带 ȣ��
			print(dan); // ȣ�� �� �ݺ������� ��� ������ ���
		}*/
		
		
		// for(int dan = 2; dan <= 9 ; dan++) {
		// System.out.println("*** "+ dan+ "�� ***");
		// for(int i = 1 ; i <= 9; i++) {
		// System.out.printf("%d * %d = %d\n", dan, i , dan *i);
		// }
		// }
	}
	/////////////////////////////////////////////////////////////

	int getDan() {

		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.nextLine(); // ���� ����ֱ�

		return dan; // getDan(String msg)�� dan�� ��ȯ
	}

	///////////////////////////////////////////////////////////
	void print(int startDan, int endDan) { // ������ ��� �޼ҵ�

		for (int dan = startDan; dan <= endDan; dan++) {
			print(dan); // for�� 2���� ����� ��������� �޼ҵ� ȣ��

		}
	}

}
