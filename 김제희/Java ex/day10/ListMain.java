package kr.co.mlec.day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List �ߺ�O ����O
 * �ߺ��� ������ ��� ����ϴ� ����Ʈ��
 * 
 * ���� Ŭ����
 * -ArrayList
 * -LinkedList
 * 
 * �ֿ�޼ҵ�
 * -add 		: �������Է�
 * -addAll 		: �ٸ� list�� ��ü�Է�
 * -get			: ������ ����
 * -remove		: ������ ������ ����
 * -clear 		: ��ü ������ ����
 * -size 		: ��ü ������ ����
 * -contains 	: ������ ��������
 * -isEmpyty		: �迭�� ����ִ��� üũ
 * -Iterator	: Iterator ��ü�� ��ȯ
 */

public class ListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
//		List<String> list = new LinkedList<String>();
		
		list.add("����");
		list.add("����");
		list.add("������");
		list.add("����");
		list.add("�̤�");
		
		System.out.println("----------------------------------------------");
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("----------------------------------------------");
		System.out.println("for each�� �̿� ���");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("----------------------------------------------");
		/*
		 * ----------------------------------------
		 *			Iterator(��ȯ��) �ֿ� �޼ҵ� 
		 * ----------------------------------------
		 * 		hasNext()	: ���� �������� ���翩�θ� �˻�
		 *  	next()		: ������ ���
		 * ----------------------------------------
		 * 
		 */
		
		System.out.println("<Iterator�� �̿��� ���>");
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("list �迭�� ������ ����: " + list.size());
		list.add("one");
		System.out.println("one �߰� �� ������ ���� :" + list.size());
		
		System.out.println("1������ ��ġ�� ������: " + list.get(1));
		list.add(1, "����!");
		System.out.println("1������ ��ġ�� ������: " + list.get(1));
		//add �޼ҵ尡 ������ �ڷ� �и鼭 ���ϴ� �������� �������ִ� �Ϸ��� ���۵��� ��� �������ش�
		
		if(list.contains("����!")) {
			System.out.println("����!�� �����Ѵ�");
		} else {
			System.out.println("����!�� ���������ʴ´�");
			
		}
		
		list.remove("����!"); //��ȯ���� �Ҹ����� ���m�� ���������ߴٷ� ǥ��
		//�Űܺ����� ������ ������ �ε�����ġ�� �� ����
		
		if(list.contains("����!")) {
			System.out.println("����!�� �����Ѵ�");
		} else {
			System.out.println("����!�� ���������ʴ´�");
			
		}
		System.out.println("0���� ������: " + list.get(0));
		System.out.println("������ 0���� ������: " + list.remove(0));
		System.out.println("�ٲ� 0���� ������: " + list.get(0));
		
		System.out.println("���?: " + list.size());
		list.clear();
		System.out.println("���?: " + list.size());
		//if���� �̿��ؼ� �����ִ�.
		
		if(list.isEmpty()) {
			System.out.println("�����");
		} else {
			System.out.println("�־�");
			
		}
	
		
		
	}

}
