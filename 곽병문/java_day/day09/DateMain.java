package kr.co.mlec.day09;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println("d : " + d);
		
		// ��¥���� : 2018�� 7�� 13��
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		
		System.out.println("��¥���� : " + year + "�� " + month + "�� " + date + "��");
		
	}

}
