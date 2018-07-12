package kr.co.mlec.day08.abs02;

import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	public void process() {
		
		System.out.println("������ ���� \n 1. LG ������ \n 2. �Ｚ ������ \n 3. HP ������");
		System.out.print("��ȣ�� �����ϼ���: ");
		
		int no = sc.nextInt();
		sc.nextLine();
		
		print(no);
		
	}
	
	public void print(int no) {
		
		Printer p = null;
		
		switch (no) {
		case 1:
			p =new LGPrinter();
			p.print();
			break;
		case 2:
			p =new SamsungPrinter();
			p.print();
			break;
		case 3:
			p =new HPPrinter();
			p.print();
			break;
		default :
			System.out.println("�ƴ� �ȹٷ� ���ϳ�");
			return;
		}
		
	}
}
