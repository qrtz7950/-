package board.v1.u4.ui;

import java.util.Scanner;

public class SearchOneUI {
	private Scanner sc = new Scanner(System.in);
	public void execute() {
		int no = scanInt("��ȸ�� �۹�ȣ�� �Է��ϼ��� : ");
		System.out.println("�۹�ȣ ��ȸ�޴� ������");
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
