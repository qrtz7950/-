package kr.co.mlec.day06;

public class GugudanMain {

	public static void main(String[] args) {

		Gugudan gu = new Gugudan();
		
//		System.out.print("2 - 9������ ���� �Է� : ");
//		int dan = gu.getDan();
		
		int dan = gu.getDan("2 - 9������ ���� �Է� : ");
		
		gu.print(dan);
				
		gu.print();
		
		int startDan = gu.getDan("���۴��� �Է�: ");
		int endDan = gu.getDan("������� �Է�: ");
		
		gu.print(startDan, endDan);
		
	}

}
