package kr.co.mlec.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 	Set : �ߺ�x, ����x
 * 	
 * 	���� Ŭ����
 * 		- HashSet
 * 		- TreeSet
 */

public class SetMain {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet</*String*/>();	// 1.7�������� ��������
//		Set<String> set = new TreeSet</*String*/>();	// ���� �ٸ����� �����ϰ� ��밡��
		
		System.out.println("�Է� �� �������� �Ѱ��� : " + set.size() + "��");
		
		System.out.println("\"one\" ������ �Է� : " + set.add("one"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		System.out.println("\"one\" ������ �Է� : " + set.add("one"));
		
		System.out.println("�Է� �� �������� �Ѱ��� : " + set.size() + "��");
		
		/*
		 	Set ��� ������ ����ϴ� ���
		 	
		 	1. 1.5������ for��
		 	2. iterator() �̿�
		 	3. toArray() �̿�
		 */
		
		System.out.println("< 1.5 for >");
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println("=================================");
		
		System.out.println("< iterator >");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("=================================");
		
		
		System.out.println("< toArray() >");
		Object[] arr = set.toArray();
		for(Object o : arr) {
			String str = (String)o;
			System.out.println(o + ", length : " + str.length());
		}
	}

}
