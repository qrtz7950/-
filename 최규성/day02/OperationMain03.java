package day02;
import java.util.Random;
public class OperationMain03 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int num = r.nextInt(11); // 0 ~ 11
//		int num = r.nextInt(10) + 1; //1~10
		System.out.println(num);
		
		System.out.println(num==0? "�ش���� ����" :(num % 2 == 0? "¦��" : "Ȧ��")); // ¦ or Ȧ or �ش���׾���
	/*	
		String msg = num % 2 == 0 ? "¦��" : "Ȧ��";
		
		System.out.println(num + " = " + msg);
		System.out.println(num + " = " + (num % 2 == 0? "¦��": "Ȧ��")); // ¦ or Ȧ
	*/	
		

	}

}
