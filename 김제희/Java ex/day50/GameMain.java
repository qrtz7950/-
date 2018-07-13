package kr.co.day50;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		Game g = null;
		
		boolean bool = true;
		int total = 0;
		
		while(bool) {
		System.out.println("������ �����ϼ���");
		System.out.println("A.����������");
		System.out.println("B.�ֻ��� �� ���߱�");
		System.out.println("C.����");
		
		char sel = sc.nextLine().charAt(0);
		
		switch (sel) {
		case 'A' :
			g = new ScissorsRockPaper();
			System.out.println("�������������� �����Դϴ�.");
			System.out.println("������������ �ϳ��� �����ϼ���");
			System.out.println("1:����,2:����,3:��");
			int you = sc.nextInt();
			sc.nextLine();
			total += g.startGame(you); 
			break;
			
		case 'B' :
			g = new Dice();
			System.out.println("�ֻ��� �� ���߱� �����Դϴ�.");
			System.out.println("�ֻ����� �����ϼ���(1~6�� �� �ϳ�)");
			you = sc.nextInt();
			sc.nextLine();
			total += g.startGame(you); 
			break;
		
		case 'C' :
			System.out.println("������ �����մϴ�");
			System.out.printf("����� total score�� %d�Դϴ�\n",total);
			bool = false;
			break;
			
		default :
			System.out.println("�ٽ� �Է��ϼ���");
			break;
		}
		}
		
	}

}
