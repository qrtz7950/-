package kr.co.mlec.day09;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		System.out.println("Main start.......");
		
		Random r = new Random();
		int num = r.nextInt(2);
		System.out.println("num : " + num);
		try {
			System.out.println(1 / num);
		}
		/*
		  catch(ArithmeticException ae) {
			//System.out.println("��������߻������ĤĤĤ�");
			//System.out.println(ae.getMessage());
			ae.printStackTrace();
		} catch(NullPointerException ne) {
			//������ �ϳ��� �߻��ϴ� ���� �ƴϱ⶧���� ĳġ�� �������Ҽ��ִ�
			ne.printStackTrace();
		}
		*/
		
		//�������� �ѹ��� ĳġ�����ϵ��� ���� ����
		/*
		catch(ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
		*/
		//������ � ������ �߻����� ������ �� ���⶧���� � ������ �ߴ��� ó���ϰ��Ҽ��ִ�
		//������ ����ȯ�� �̿��ؼ�
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main end.......");
		//���ܰ� �߻��ϴ� ����
	}
}
