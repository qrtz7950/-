package board.v1.u4.ui;

import java.util.Scanner;

/**
 * ����� ȭ�� ó��
 * @author bitacademy
 */
public class BoardUI {
	
	private Scanner sc = new Scanner(System.in);
	
	public void execute() {
		while(true) {
			System.out.println();
			String type = menu();
			switch(type) {
			case "1" :
				SearchUI search = new SearchUI();      // ��ü �Խñ� ��ȸȭ��
				search.execute();
				break;
			case "2" :
				SearchOneUI searchOne = new SearchOneUI();  // �Խñ� ��ȣ�� ��ȸȭ��
				searchOne.execute();
				break;
			case "3" :
				AddUI add = new AddUI();               // �Խñ� ��� ȭ��ó�� 
				add.execute();
				break;
			case "4" :
				UpdateUI update = new UpdateUI();      // �Խñ� ����ȭ��
				update.execute();
				break;
			case "5" :
				DeleteUI delete = new DeleteUI();      // �Խñ� ����ȭ��
				delete.execute();
				break;
			case "0" :
				ExitUI exit = new ExitUI();        // �Խ��� ���α׷� ����ȭ��
				exit.execute();
			}    // end of switch block
		}	// end of while loop
	}  // end of process method
	
	private String menu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1. ��ü�Խù� ��ȸ   ");
		System.out.println("2. �۹�ȣ ��ȸ   ");
		System.out.println("3. �۵��   ");
		System.out.println("4. �ۼ���   ");
		System.out.println("5. �ۻ���   ");
		System.out.println("0. ����     ");
		System.out.println("--------------------------------------------------");
		return scanStr("�޴� �� ó���� �׸��� �����ϼ��� : ");
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















