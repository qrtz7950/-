package kr.co.mlec.day09;

import java.util.Scanner;

public class ExceptionMain06 {
	
	public static void main(String[] args) /* �����ǰ�� �Է�throws Exception*/ {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("���̵� �Է���");
			System.out.println("���̵�� �ּ� 4���� �̻��̾� ����?");
			String id = sc.nextLine();
			
			if(id.length()<4) {
//				throw new Exception("4���� �̻��̶�ϱ�?");
				throw new CheckIDException("��û��!");
				
			} else {
				System.out.println("���̵� ��ω���");
				System.out.println("�ϰ� �Է��� ���̵�: " + id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
