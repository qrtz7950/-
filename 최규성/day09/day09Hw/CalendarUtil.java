package day09Hw;

import java.util.Calendar;

public class CalendarUtil {
	
	public void showDayByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			showDayByMonth(year, month);
		}
	}
	
	public void showDayByMonth(int year, int month) {
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		
		//Ư���⵵, Ư������ 1���� ������������ �˾ƾ���.
		int week = c.get(Calendar.DAY_OF_WEEK);
		//Ư������ ���������� ���������� �˾ƾ���.
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		showDay(week, lastDay);
		
	}
	private void showDay(int week,int lastDay) {	//�� �ڹ����Ͽ����� ���� ������ private
		
		int lineCnt = 0;
		System.out.println("-----------------------------------------------------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��\n");
		System.out.println("-----------------------------------------------------");
		/*week : 1 �� 1
		week : 2 �� \t1
		week : 3 ȭ \t\t1 ......*/
		for(int i = 1 ;i < week;i++) {
			System.out.print("\t");
			lineCnt++;
		}
		for(int day = 1; day<=lastDay; day++) {
			System.out.print(day + "\t");
			lineCnt++;
			if(lineCnt % 7 ==0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
	}
}
