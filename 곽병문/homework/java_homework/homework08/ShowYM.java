package kr.co.mlec.homework.homework08;

import java.util.Calendar;

public class ShowYM extends Show {

	private int month;
	
	ShowYM(){
		System.out.print("���� �Է��ϼ��� : ");
		month = Integer.parseInt(s.nextLine());
	}
	
	@Override
	public void showCalendar() {
				
		c.set(year, month-1, 1);		
		max_day = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "�� " + month + "��");
		System.out.println("--------------------------------------------------------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("--------------------------------------------------------");
		for(int i=1; i<max_day+dayOfWeek; i++) {
			if(i<dayOfWeek) {
				System.out.print(" \t");
			}else {
				System.out.print((i-dayOfWeek+1) + "\t");
			}
			if(i%7==0) {System.out.println();}
		}
		System.out.println();
		
	}

}
