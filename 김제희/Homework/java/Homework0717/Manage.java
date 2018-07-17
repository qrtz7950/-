package kr.co.Homework0717;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Manage {
	
	Scanner sc = new Scanner(System.in);
    static int num = 1;
    static List<Object> list = new ArrayList<Object>();
    
	public void manage(int selMenu) {
		
		switch (selMenu) {
		case 1:
			if(list.size() == 0) {
				System.out.println("����� �Խñ� ����� �����ϴ�");
				break;
			}
			viewAllPost();
			break;
		case 2:
			System.out.print("��ȸ�� �� ��ȣ�� �����ϼ���: ");
			int selNum = sc.nextInt();
			sc.nextLine();
			viewPost(selNum);
			break;
		case 3:
			
			list.add(write());
			break;
		case 4:
			System.out.print("������ �� ��ȣ�� �����ϼ���: ");
			selNum = sc.nextInt();
			sc.nextLine();
			correct(selNum);
			break;
		case 5:
			System.out.print("������ �� ��ȣ�� �����ϼ���: ");
			selNum = sc.nextInt();
			sc.nextLine();
			del(selNum);
			break;
		case 0:
			System.out.println("����");
			System.exit(0);
			break;
		default:
			System.out.println("�߸��� ��ȣ�Դϴ� 1-5������ ��ȣ�� �ٽ� �Է��ϼ���");
			break;
		}
		
	}

	private void viewAllPost() {
		
		System.out.println("��ȣ	�۾���	�����		����");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

	private void viewPost(int selNum) {

		Post p = null;
		
		try {
			p =(Post) list.get(selNum-1);
		} catch (Exception e) {
			
		}
		
		if(selNum == 0 || p==null) {
			System.out.println("��ȸ�� �� ��ȣ "+ selNum  +"�� �������� �ʽ��ϴ�");
		} else {
			System.out.println("��   ȣ: " + p.getNum());
			System.out.println("��   ��: " + p.getTitle());
			System.out.println("�۾���: " + p.getAuthor());
			System.out.println("�����: " + p.getDay());
		}
		
	}

	private Post write() {
		
		System.out.print("����� ������ �Է��ϼ���");
		String title = sc.nextLine();
		System.out.print("����� �۾����� �Է��ϼ���");
		String author = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String day = sdf.format(new Date());
		
		Post p = new Post(num, author, day, title);
		num++;
		
		return p;
	}
	
private Post write(int selNum) {
		
		System.out.print("����� ������ �Է��ϼ���: ");
		String title = sc.nextLine();
		System.out.print("����� �۾����� �Է��ϼ���:");
		String author = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String day = sdf.format(new Date());
		
		Post p = new Post(selNum, author, day, title);
		
		return p;
	}

	private void correct(int selNum) {

		list.add(selNum,write(selNum));
		
		del(selNum);
		num--;
	}

	private void del(int selNum) {
		list.remove(selNum-1);
		System.out.println("�����Ǿ����ϴ�");
	}



}
