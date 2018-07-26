package board.v1.u4.ui;

import java.util.Scanner;

public class UpdateUI {
	private Scanner sc = new Scanner(System.in);
	public void execute() {
		int no = scanInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		String title  = scanStr("������ ������ �Է��ϼ��� : ");
		System.out.println("�� ���� �޴� ������\n");
	}
	
	String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}	
}
