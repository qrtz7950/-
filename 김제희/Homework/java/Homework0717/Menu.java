package kr.co.Homework0717;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	
	void start() {
		
		System.out.println("�Խ��� �������α׷�");
		System.out.println("  ***�޴�***");
		System.out.println("1. ��ü �Խñ� ��ȸ");
		System.out.println("2. �۹�ȣ ��ȸ");
		System.out.println("3. �۵��");
		System.out.println("4. �ۼ���");
		System.out.println("5. �ۻ���");
		System.out.println("0. ����");
		System.out.print("���ϴ� �׸��� �����ϼ���: ");
		int selMenu = sc.nextInt();
		sc.nextLine();
		
		new Manage().manage(selMenu);
		
	}
	
}
