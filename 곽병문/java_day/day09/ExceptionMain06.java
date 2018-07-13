package kr.co.mlec.day09;

import java.util.Scanner;

public class ExceptionMain06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("����� ID �Է¤� : ");
		String id = s.nextLine();
		try {
			if(id.length() < 5) {
				throw new CheckIDException("���̵�� �ּ� �ټ����� �̻��ԴϤ�");
			}
			else {
				System.out.println("ID�� ����Ͽ����Ϥ�");
				System.out.println("ID : " + id);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
