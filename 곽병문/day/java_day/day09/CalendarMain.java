package kr.co.mlec.day09;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;	// 0~11
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK)-1;	// 1(��) ~ 7(��)
		
		String[] dayArray = {"��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println("��¥���� : " + year + "�� " + month + "�� " + date + "��(" + dayArray[day] + ")");
		
		c.set(2021, 9-1, 15);
		day = c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("2021�� 9�� 15�� " + dayArray[day] + "����");
		
		Date d = c.getTime();
		System.out.println("d : " + d);
		
		c.setTime(new Date());
		System.out.println("c : " + c);
		
		System.out.println("Month �� Max : " + c.getActualMaximum(Calendar.MONTH));
		System.out.println("7�� �������� : " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
	}

}
