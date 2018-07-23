package kr.co.mlec.homework.homework08;

import java.util.Calendar;

public class ShowY extends Show {

	@Override
	public void showCalendar() {
		
		for(int i=1; i<=12; i++) {
			c.set(year, i-1, 1);
			max_day = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
			
			System.out.println(year + "�� " + i + "��");
			System.out.println("--------------------------------------------------------");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			System.out.println("--------------------------------------------------------");
			for(int j=1; j<max_day+dayOfWeek; j++) {
				if(j<dayOfWeek) {
					System.out.print(" \t");
				}else {
					System.out.print((j-dayOfWeek+1) + "\t");
				}
				if(j%7==0) {System.out.println();}
			}
			System.out.println();
			System.out.println();
		}
	}

}
