package day06;
/*
 * Main -> getDan(String msg) -> getDan() ������ ����
 * 
 */
public class GugudanMain {

	public static void main(String[] args) {

		Gugudan gu  = new Gugudan();
		
//		System.out.print("2-9������ ���� �Է�: ");
//		int dan = gu.getDan(); //������ Ŭ������ getDan�� �ʿ����, ������ Ŭ������ dan���� �ٸ� ����
		
		int dan = gu.getDan("2-9������ ���� �Է�: "); //���� Ÿ���� int
		
//		System.out.println("*** "+ dan + "�� ***");
		
		gu.print(dan); //���ϴ� �� ���
		////////////////////////////////////////////////////////
		
		gu.print();		//��� �� ���
		////////////////////////////////////////////////////////
		
		int startDan = gu.getDan("���۴��� �Է�: "); 	//�������� �� ���
		int endDan = gu.getDan("������� �Է�: ");
		
		gu.print(startDan, endDan);
	}

}
