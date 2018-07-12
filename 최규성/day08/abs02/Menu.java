package day08.abs02;

import java.util.Scanner;

public class Menu {

	public void process() {

		Scanner sc = new Scanner(System.in);
		System.out.println("�����͸� �����ϼ���(1. LG, 2.SAMSUNG, 3.HP) => ");
		int no = sc.nextInt();
		sc.nextLine();

		print(no);
	}
	

	public void print(int no) {
		
		Printer p = null;
		switch (no) {
		case 1:
			p = new LGPrinter();
			p.print();
			//LGPrinter lg = new LGPrinter();
			//lg.Print();
			break;
		case 2:
			SamsungPrinter ss = new SamsungPrinter();
			ss.Print();
			break;
		case 3:
			HPPrinter hp = new HPPrinter();
			hp.Print();
			break;
		}
		if(p != null) {
			p.print();
		} else {
			System.out.println("��ȣ�� �߸� �Է��߽��ϴ�.");
		}
	}
	
}
