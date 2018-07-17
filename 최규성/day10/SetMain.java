package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set : �ߺ� x, ���� x
 * 	���� Ŭ����
 * 		-HashSet
 * 		-TreeSet
 */
public class SetMain {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();	//1.7���ʹ� �������� ���ʸ� ���� Ÿ���� �����Ҽ��ִ�.
	
		System.out.println("�Է��� ������ ����: "+ set.size());
		
		boolean bool = set.add("ONE");
		System.out.println("\"ONE\" ������ �Է�: " + (bool ? "�Է¼���" : "�Է½���"));
		set.add("ONE");
		set.add("TWO");
		set.add("THREE");
		set.add("FOUR");
		set.add("FIVE");
		
		bool = set.add("ONE"); //�ߺ��� ������� �ʾ� �ȵ�
		System.out.println("\"ONE\" ������ �Է�: " + (bool ? "�Է¼���" : "�Է½���"));
		
		System.out.println("�Է��� ������ ����: "+ set.size());
		
		/*
		 * Set�� ��� �����͸� ����ϴ� ���
		 * 1. 1.5������ for��
		 * 2. Iterator() �� �̿��� ���
		 * 3. toArray()�� �̿��� ��� 
		 */
	
		System.out.println("<1.5���� for��>");
		for(String data : set) {
			System.out.println(data);
		}
	
		System.out.println("<iterator()�� �̿�>");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("<toArray()�� �̿�>");
		set.toArray();	//����̴� object �迭��
		Object[] arr = set.toArray();
		for(Object obj : arr) {
			String str = (String)obj;
			System.out.println(obj + ",length: "+ str.length());
		}
	
	}

}
