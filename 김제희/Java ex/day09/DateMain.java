package kr.co.mlec.day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
	
	public static void main(String[] args) {

		Date d = new Date();
		
		System.out.println("d: " + d);
		//�������̵�� toString �޼ҵ��̱⶧���� �ð��� ��ȯ
		
		//��¥����: 2018�� 7�� 13��
		int year = d.getYear() + 1900; //1900����� ��ȯ�ϹǷ� +1900
		int month = d.getMonth() + 1; //0~11���� ��ȯ�ϹǷ� +1
		int date = d.getDate(); //���� �ߴ� ������ deprecated
		//���� JDK�������� ��������� �𸥴ٴ°���
		
		//d. �޼ҵ� ����� ���� ȸ�� �缱�� �׾����ִµ� �̰� �� ����������Ƽ�� �޼ҵ��
		
		System.out.println("��¥����: " + year + "�� " + month + "��" + date + "��");
		//���� �Ⱦ� date���� �׷����� Ķ����Ŭ������ �Ẹ��
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal: " + cal);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1; // 0~11��ȯ
		date = cal.get(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1(��) ~ 7(��) ��ȯ
		
		String [] dayArr = {"","��","��","ȭ","��","��","��","��"}; 
		System.out.println(year + "�� " + month + "�� " + date + "�� " + dayArr[dayOfWeek] + "����");
		
		// 2021�� 9�� 15���� ��������?
		
		cal.set(2021, 9-1, 15);
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021�� 9�� 15�� " + dayArr[dayOfWeek] + "����");
		
		Date da = cal.getTime();
		System.out.println("d : " + da);
		
		System.out.println("c : " + cal);
		cal.setTime(new Date());
		System.out.println("c : " + cal);
		
		System.out.println("Month �� MAX : " + cal.getActualMaximum(Calendar.MONTH));
		cal.set(Calendar.MONTH, Calendar.FEBRUARY);
		System.out.println("�̹� ���� ����������?: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println("-------------------------------------------------");
		
		//2017�� 7�� 13�� (��)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� d��(E)");
		System.out.println("��¥����: " + sdf.format(new Date()));
		
		
		// 2017-0713 16:20:23
		String pattern = "yyyy-MM-dd HH:mm:ss";
		sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		
				
	}
}