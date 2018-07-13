package day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
/*
		Date d = new Date();
		
		System.out.println("d: "+ d.toString());
		
		//��¥ ����: 2018�� 7�� 13��
		int year = d.getYear() +1900;	//1900����� ��ȯ�ϱ� ������ +1900 , �߾Ӽ��� ���� �������� ��� ���� �𸣴� �޼ҵ�
		int month = d.getMonth()+1; //0~11�̶� +1
		int date = d.getDate();
		
		System.out.println("��¥����: " + year + month + date);
		
		System.out.println();*/
		
		Calendar c = Calendar.getInstance();
		System.out.println("c: "+ c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
//		int date = c.get(Calendar.DATE);
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);
		String[] dayArr = {" ","��","��","ȭ","��","��","��","��","��"};
		
		System.out.println("��¥����: " + year +"�� "+ month +"�� "+date+"�� "+dayArr[day]+"����");
	
	
		//2021�� 9�� 15���� ���� ���� �ΰ�?
		c.set(2021, 9 - 1,15);	//0~11��ǥ��� 1�� ����
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021�� 9�� 15��" + dayArr[day]+" ����");
		
		Date d = c.getTime();
		System.out.println("d: "+ d);
		
		System.out.println("c: "+ c);
		c.setTime(new Date());
		System.out.println("c: "+ c);
		
		System.out.println("MONTH�� Max: "+(int) (c.getActualMaximum(Calendar.MONTH)+1));
		
		System.out.println("7���� ����������: "+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		c.set(Calendar.MONTH, Calendar.FEBRUARY);	//������� 2���� ����
		System.out.println("������� ����������: "+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println("---------------------------");
		
		//���� ��¥ 2018�� 7�� 13(��)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� (EE)");
		System.out.println("��¥����: " + sdf.format(new Date()));
		
		System.out.println("---------------------------");
		
		// 2018-07-13 16:20:23
		String pattern = "yyyy-MM-dd HH:mm:ss";
		sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		
	
	
		}

}
