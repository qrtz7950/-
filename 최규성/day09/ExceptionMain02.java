package day09;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {

		System.out.println("Main Start");
		
		Random r = new Random();
		int num = r.nextInt(2);

		System.out.println("num: "+ num);
		
		try{	
			System.out.println(1 / num);	//�и� 0,1�� 0�϶� �����߻�
			
			String str = null;
			
			System.out.println("length: " + str.length());
		}catch(Exception e) {	//��� ����ó���� ������ ó������, �̰͸� ����.
			e.printStackTrace();
		}
		
		/*catch(ArithmeticException | NullPointerException e) {	// | �� ���̿� �ΰ� ������ ��밡��
//			System.out.println("ArithmeticException �߻�...");
//			System.out.println(ae.getMessage());
			e.printStackTrace();
		}
		*/
		
		System.out.println("Main End");
	}

}
