package kr.co.mlec.homework.homework08;

public class CalendarMain {	
	
	public static void main(String[] args) {
		int sel;
		CalendarMenu cm = new CalendarMenu();
		Show s = null;
		
		while(true) {
			sel = cm.menu();
			if(sel==1) {
				s = new ShowY();
			}else if(sel==2) {
				s = new ShowYM();
			}else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			s.showCalendar();
		}
		
	}

}
