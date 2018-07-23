package kr.co.mlec.day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 	List : �ߺ�O, ����O
 * 
 * 	����Ŭ����
 * 		- ArrayList
 * 		- LinkedList
 * 
 * 	�ֿ�޼ҵ�
 * 		- add		: ������ �Է�
 * 		- addAll	: �ٸ� List�� ��ü �Է�
 * 		- get		: ������ ����
 * 		- remove	: ������ ������ ����
 * 		- clear		: ��ü ������ ����
 * 		- size		: ��ü ������ ����
 * 		- contains	: ������ ��������
 * 		- isEmpty	: �迭�� ����ִ��� üũ
 * 		- Iterator	: iterator��ü�� ��ȯ
 */
public class ListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
//		List<String> list = new LinkedList<String>();	// List�� �����Ͽ� �����ϰ� ���
		
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");
		list.add("FIVE");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
		/*
		 	------------------------------------------------------------
		 		Iterator(��ȯ��) �ֿ� �޼ҵ�
		 	------------------------------------------------------------
		 		hasNext()	: ���� �������� ����, ������ ���翩�� �Ǵ� (boolean)
		 		next()		: ������ ���
		 	------------------------------------------------------------
		 */
		
		System.out.println("< iterator�� �̿��� ��� >");
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("list �迭�� ������ ���� : " + list.size() + "��");
		list.add("one");
		System.out.println("\"one\" �߰��� ������ ���� : " + list.size() + "��");
		
		System.out.println("1�������� ������ ������ : " + list.get(1));
		list.add(1, "SIX");
		System.out.println("1�������� ������ ������ : " + list.get(1));
		
		if(list.contains("SIX")) {
			System.out.println("\"SIX\" ����");
		}else {
			System.out.println("\"SIX\" ����");
		}
		
		System.out.println(list.remove("SIX")?"��������":"��������");
		
		if(list.contains("SIX")) {
			System.out.println("\"SIX\" ����");
		}else {
			System.out.println("\"SIX\" ����");
		}
		
		System.out.println("0���� ������ : " + list.get(0));
		System.out.println("������ 0���� ������ :" + list.remove(0));
		System.out.println("0���� ������ : " + list.get(0));
		
		System.out.println("������ ���� : " + list.size() + "��");
		list.clear();
		System.out.println("������ ���� : " + list.size() + "��");
		
		if(list.isEmpty()) {
			System.out.println("�迭 �����");
		}
	}

}
