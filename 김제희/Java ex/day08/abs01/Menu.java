package kr.co.mlec.day08.abs01;

import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	public void process() {
		
		System.out.println("������ ���� \n 1. LG ������ \n 2. �Ｚ ������");
		System.out.print("��ȣ�� �����ϼ���: ");
		
		int no = sc.nextInt();
		sc.nextLine();
		
		print(no);
		
	}
	
	public void print(int no) {
		
		switch (no) {
		case 1:
			LGPrinter lg =new LGPrinter();
			lg.print();
			break;
		case 2:
			SamsungPrinter sam =new SamsungPrinter();
			sam.print();
			break;
		default :
			System.out.println();
			
		}
		
	}
}
