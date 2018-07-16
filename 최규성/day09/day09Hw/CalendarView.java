package day09Hw;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc = new Scanner(System.in);

	private int getInput(String msg) {	//���� �ڹ����Ͽ����� ���̱⶧���� ���� public�� ����� �ʿ����.
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public void process() {
		CalendarUtil util = new CalendarUtil();
		int year = 0;
/*loop : */while (true) {
			int choice = getInput("�׸��� �����ϼ���(1.Ư���⵵  2.Ư����  3.����) => ");
			switch (choice) {
			case 1:
				year = getInput("Ư���⵵�� �Է��ϼ���");
				util.showDayByYear(year);
				break;
			case 2:
				year = getInput("Ư���⵵�� �Է��ϼ���:");
				int month = getInput("Ư������ �Է��ϼ���:");
				util.showDayByMonth(year,month);
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				//break loop;	// ���α׷��� �������ϱ� ������ while�� �������ְ� �Ҽ��ִ�.
				System.exit(0);	// �ƴϸ� ���α׷��� �����ϴ� �޼ҵ带 ����Ҽ��ִ�
				break;
			}
		}
	}
}
