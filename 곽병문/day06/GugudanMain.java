package kr.co.mlec.day06;

public class GugudanMain {

	public static void main(String[] args) {
		
		Gugudan gu = new Gugudan();
		
		int dan = gu.getDan("2 - 9 ������ ���� �Է� : ");
		
		System.out.println();
		
		gu.pr(dan);
		
		// gu.pr();
		
		int startDan = gu.getDan("���۴��� �Է� : ");
		int endDan = gu.getDan("������� �Է� : ");
		
		gu.pr(startDan, endDan);
	}
}
