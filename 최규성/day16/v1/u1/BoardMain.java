package board.v1.u1;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		outer: while (true) {
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println("1. ��ü�Խù� ��ȸ   ");
			System.out.println("2. �۹�ȣ ��ȸ   ");
			System.out.println("3. �۵��   ");
			System.out.println("4. �ۼ���   ");
			System.out.println("5. �ۻ���   ");
			System.out.println("0. ���� ");
			System.out.println("--------------------------------------------------");
			System.out.print("�޴� �� ó���� �׸��� �����ϼ��� : ");
			String type = sc.nextLine();

			int no = 0;
			String title = "";
			String writer = "";

			switch (type) {
			case "1":
				System.out.println("��ü �Խñ� ��ȸ �޴� ������");
				break;
			case "2":
				System.out.print("��ȸ�� �۹�ȣ�� �Է��ϼ��� : ");
				no = sc.nextInt();
				sc.nextLine();
				System.out.println("�۹�ȣ ��ȸ�޴� ������");
				break;
			case "3":
				System.out.print("������ �Է��ϼ��� : ");
				title = sc.nextLine();
				System.out.print("�۾��̸� �Է��ϼ��� : ");
				writer = sc.nextLine();
				System.out.println("�� ��� �޴� ������\n");
				break;
			case "4":
				System.out.print("������ �۹�ȣ�� �Է��ϼ��� : ");
				no = sc.nextInt();
				sc.nextLine();
				System.out.print("������ ������ �Է��ϼ��� : ");
				title = sc.nextLine();
				System.out.println("�� ���� �޴� ������\n");
				break;
			case "5":
				System.out.print("������ �۹�ȣ�� �Է��ϼ��� : ");
				no = sc.nextInt();
				sc.nextLine();
				System.out.println("�ۻ��� �޴� ������\n");
				break;
			case "0":
				System.out.println("�Խ��� ���α׷��� �����մϴ�.\n");
				break outer;
			default :
				System.out.println("�޴��� Ȯ���ϼ���!!");
			}
		}
		sc.close();
	}
}