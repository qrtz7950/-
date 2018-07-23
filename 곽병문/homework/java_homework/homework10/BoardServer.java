<<<<<<< HEAD
package kr.co.mlec.homework.homework10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BoardServer {	
	static private List<Form> list = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	
	public void showAll() {
		Iterator<Form> ite = list.iterator();
		if(!ite.hasNext()) {
			System.out.println("����� �Խñ� ����� �����ϴ�");
		}
		System.out.println("��ȣ\t�۾���\t�����\t\t����");
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
	
	public void showNum() {
		System.out.print("��ȸ�� �۹�ȣ�� �Է� : ");
		int num = Integer.parseInt(s.nextLine());
		int num2=-1;
		if(num<1 || num>list.size()) {
			System.out.println("��ȸ�� �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNum()==num) {
				num2=i;
				break;
			}
		}
		if(num2==-1) {
			System.out.println("��ȸ�� �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		System.out.println();
		System.out.println("��   ȣ : " +  list.get(num2).getNum());
		System.out.println("��   �� : " +  list.get(num2).getTitle());
		System.out.println("�۾��� : " +  list.get(num2).getWriter());
		System.out.println("����� : " +  list.get(num2).getDay());
	}
	
	public void upload() {
		System.out.print("����� ������ �Է��ϼ��� => ");
		String title = s.nextLine();
		System.out.print("����� �۾��̸� �Է��ϼ��� => ");
		String writer = s.nextLine();
		Form tmp = new Form(title, writer);
		list.add(tmp);
	}
	
	public void modify() {
		System.out.print("������ �۹�ȣ�� �Է� => ");
		int num = Integer.parseInt(s.nextLine());
		int num2=-1;
		if(num<1 || num>list.size()) {
			System.out.println("������ �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNum()==num) {
				num2=i;
				break;
			}
		}
		if(num2==-1) {
			System.out.println("������ �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		System.out.print("�ٲ� ������ �Է� => ");
		String title = s.nextLine();
		Form tmp = new Form(title, list.get(num2).getWriter(), num);
		list.add(num2,tmp);
		list.remove(num2+1);
		System.out.println("������ �����Ǿ����ϴ�");
	}
	
	public void remov() {
		System.out.println("������ �� ��ȣ�� �Է� => ");
		int num = Integer.parseInt(s.nextLine());
		int num2=-1;
		if(num<1 || num>list.size()) {
			System.out.println("������ �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNum()==num) {
				num2=i;
				break;
			}
		}
		if(num2==-1) {
			System.out.println("������ �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		list.remove(num2);
		System.out.println((num2+1) + "�� ���� ���� �Ǿ����ϴ�");
	}
	
}
=======
package kr.co.mlec.homework.homework10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BoardServer {	
	static private List<Form> list = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	
	public void showAll() {
		Iterator<Form> ite = list.iterator();
		if(!ite.hasNext()) {
			System.out.println("����� �Խñ� ����� �����ϴ�");
		}
		System.out.println("��ȣ\t�۾���\t�����\t\t����");
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
	
	public void showNum() {
		System.out.print("��ȸ�� �۹�ȣ�� �Է� : ");
		int num = Integer.parseInt(s.nextLine());
		int num2=-1;
		if(num<1 || num>list.size()) {
			System.out.println("��ȸ�� �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNum()==num) {
				num2=i;
				break;
			}
		}
		if(num2==-1) {
			System.out.println("��ȸ�� �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		System.out.println();
		System.out.println("��   ȣ : " +  list.get(num2).getNum());
		System.out.println("��   �� : " +  list.get(num2).getTitle());
		System.out.println("�۾��� : " +  list.get(num2).getWriter());
		System.out.println("����� : " +  list.get(num2).getDay());
	}
	
	public void upload() {
		System.out.print("����� ������ �Է��ϼ��� => ");
		String title = s.nextLine();
		System.out.print("����� �۾��̸� �Է��ϼ��� => ");
		String writer = s.nextLine();
		Form tmp = new Form(title, writer);
		list.add(tmp);
	}
	
	public void modify() {
		System.out.print("������ �۹�ȣ�� �Է� => ");
		int num = Integer.parseInt(s.nextLine());
		int num2=-1;
		if(num<1 || num>list.size()) {
			System.out.println("������ �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNum()==num) {
				num2=i;
				break;
			}
		}
		if(num2==-1) {
			System.out.println("������ �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		System.out.print("�ٲ� ������ �Է� => ");
		String title = s.nextLine();
		Form tmp = new Form(title, list.get(num2).getWriter(), num);
		list.add(num2,tmp);
		list.remove(num2+1);
		System.out.println("������ �����Ǿ����ϴ�");
	}
	
	public void remov() {
		System.out.println("������ �� ��ȣ�� �Է� => ");
		int num = Integer.parseInt(s.nextLine());
		int num2=-1;
		if(num<1 || num>list.size()) {
			System.out.println("������ �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNum()==num) {
				num2=i;
				break;
			}
		}
		if(num2==-1) {
			System.out.println("������ �۹�ȣ " + num + "�� �������� �ʽ��ϴ�");
			return;
		}
		list.remove(num2);
		System.out.println((num2+1) + "�� ���� ���� �Ǿ����ϴ�");
	}
	
}
>>>>>>> 282951cd084703f8f7ebe984b1e780d5f23a17b4
