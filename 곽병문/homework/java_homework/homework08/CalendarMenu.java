package kr.co.mlec.homework.homework08;

import java.util.Scanner;

public class CalendarMenu {
	
	Scanner s = new Scanner(System.in);
	
	public int menu() {
		int sel = 0;
		System.out.print("�׸��� �����ϼ���(1. Ư���⵵ ��¥ ����   2. Ư���� ��¥����   3.����) : ");
		while(true) {
			sel = Integer.parseInt(s.nextLine());
			if(sel>=1 && sel<=3) {
				break;
			}
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
		return sel;
	}
}
