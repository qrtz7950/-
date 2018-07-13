package kr.co.mlec.homework.homework08;

import java.util.Scanner;

public class ControlGame {

	Scanner s = new Scanner(System.in);
	/**
	 * ���� ���� �޴�
	 * @return char sellect
	 */
	public char menu() {

		char sel;
		
		System.out.println("������ �����ϼ���");
		System.out.println(" A. ����������");
		System.out.println(" B. �ֻ��� �� ���߱�");
		System.out.println(" C. ����");
		
		while(true) {
			sel = s.nextLine().charAt(0);
			if(sel>='A' && sel<='C') {
				break;
			}
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
		return sel;
	}
	
	/**
	 * ���������� ����
	 * @return
	 */
	public int srpsel() {
		
		int srp;
		
		System.out.println("���������� �����Դϴ�.");
		System.out.println("������������ �ϳ��� �����ϼ���.");
		System.out.println("(1:����, 2:����, 3:��)");
		
		while(true) {
			srp = Integer.parseInt(s.nextLine());
			if(srp>=1 && srp<=3) {
				break;
			}
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
		return srp;
	}
	
	/**
	 * �ֻ��� ���� �Է�
	 * @return
	 */
	public int dsel() {
		
		int d;
		
		System.out.println("�ֻ��� �� ���߱� �����Դϴ�.");
		System.out.println("�ֻ��� ���� �����ϼ���(1~6�� �� �ϳ�)");
		
		while(true) {
			d = Integer.parseInt(s.nextLine());
			if(d>=1 && d<=6) {
				break;
			}
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
		return d;
	}
}
