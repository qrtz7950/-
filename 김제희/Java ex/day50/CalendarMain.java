package kr.co.day50;

//import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cal c = new Cal();
		
		boolean bool = true;
		int yearSel =0, MonSel = 0;
		
		while (bool) {
			
		System.out.println("�׸��� �����ϼ��� (1. Ư���⵵ ��¥ ����  2. Ư���� ��¥ ����  3. ����) : ");
		int sel = sc.nextInt();
		sc.nextLine();	
		
		if(sel == 1 || sel ==2) {
			System.out.println("�⵵�� �Է��ϼ���: ");
			yearSel = sc.nextInt();
			sc.nextLine();
			if(sel == 1) {
				c.print(yearSel);
			} else {
				System.out.println("���� �Է��ϼ���: ");
				MonSel = sc.nextInt();
				sc.nextLine();
				c.print(yearSel,MonSel);
			}
		} else if(sel == 3) {
			System.out.println("����");
			bool = false;
		} else {
			System.out.println("�ٽ� �Է��ϼ���");
		}
		}
	}
}