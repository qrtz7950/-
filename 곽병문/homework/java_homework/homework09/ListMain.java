package kr.co.mlec.homework.homework09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		List<String> id = new ArrayList<String>();
		List<String> pw = new ArrayList<String>();
		
		id.add("aaa");
		pw.add("1111");
		id.add("bbb");
		pw.add("2222");
		id.add("ccc");
		pw.add("3333");
		
		System.out.println("�н����� ���漭���Դϴ�");
		System.out.print("���̵� �Է��ϼ��� : ");
		String iid = s.nextLine();
		
		if(!id.contains(iid)) {
			System.out.println("�Է��Ͻ� ���̴�[" + iid + "]�� �������� �ʽ��ϴ�.");
			System.out.println("���񽺸� �����մϴ�");
			System.exit(0);
		}
		
		System.out.print("���� �н����带 �Է��ϼ��� : ");
		String ppw = s.nextLine();
		String str = pw.get(id.indexOf(iid));

		if(!str.equals(ppw)) {
			System.out.println("�Է��Ͻ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			System.out.println("���񽺸� �����մϴ�");
			System.exit(0);
		}
		
		System.out.print("������ �н����带 �Է��ϼ��� : ");
		ppw = s.nextLine();
		
		pw.remove(id.indexOf(iid));
		pw.add(id.indexOf(iid),ppw);
		System.out.println("�н����尡 �����Ǿ����ϴ�.");
		
		System.out.println("< ȸ�� ��� ��� >");
		
		for(int i=0; i<id.size(); i++) {
			System.out.println("ID : " + id.get(i) + ", PassWord : " + pw.get(i));			
		}
		
		s.close();
	}
}
