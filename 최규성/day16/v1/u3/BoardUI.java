package board.v1.u3;

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
				searchUI();      // ��ü �Խñ� ��ȸ
				break;
			case "2" :
				searchOneUI();  // �Խñ� ��ȣ�� ��ȸ
				break;
			case "3" :
				addUI();      // �Խñ� ���
				break;
			case "4" :
				updateUI();      // �Խñ� ����
				break;
			case "5" :
				deleteUI();      // �Խñ� ����
				break;
			case "0" :
				exitUI();        // �Խ��� ���α׷� ����
			}    // end of switch block
		}	// end of while loop
	}  // end of process method
	
	String menu() {
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
	
	/**
	 * ��ü �Խñ��� ��ȸ�ϴ� ��� 
	 */
	void searchUI() {
		System.out.println("��ü �Խñ� ��ȸ �޴� ������");
	}
	
	/**
	 * �Խñ� ��ȣ�� �ش��ϴ� ���� ��ȸ�ϴ� ���
	 */
	void searchOneUI() {
		int no = scanInt("��ȸ�� �۹�ȣ�� �Է��ϼ��� : ");
		scanStr("�۹�ȣ ��ȸ�޴� ������");
	}
	
	/**
	 * �Խñ��� ����ϴ� ���
	 */
	void addUI() {
		String title  = scanStr("������ �Է��ϼ��� : ");
		String writer = scanStr("�۾��̸� �Է��ϼ��� : ");
		System.out.println("�� ��� �޴� ������\n");
	}
	
	/**
	 * �Խñ� ���� ���
	 */
	void updateUI() {
		int no = scanInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		String title  = scanStr("������ ������ �Է��ϼ��� : ");
		System.out.println("�� ���� �޴� ������\n");
	}
	
	/**
	 * �Խñ� ���� ���
	 */
	void deleteUI() {
		int no = scanInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		System.out.println("�ۻ��� �޴� ������\n");
	}
	
	/**
	 * �Խ��� ���α׷� ����ó��
	 */
	void exitUI() {
		System.out.println("�Խ��� ���α׷��� �����մϴ�.\n");
		System.exit(0);
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















