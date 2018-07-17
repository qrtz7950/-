package kr.co.mlec.day10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set : �ߺ�  X , ���� X
 * ���� Ŭ������
 * - HashSet
 * - TreeSet
 * 
 */

public class SetMain {

	public static void main(String[] args) {
		
//	Set<String> set = new HashSet<>(); //1.7�������� �ڿ� �����Ǵ� ��ü�� Ÿ���� �����Ҽ� �ִ�.
	Set<String> set = new TreeSet<>();
	System.out.println("�Է��� �������� �� ����: " + set.size());
	
	boolean bool = set.add("one");
	System.out.println("\"one\"������ �Է� : " + (bool ? "�Է¼���" : "�Է½���"));
	set.add("one");
	set.add("tow");
	set.add("three");
	set.add("four");
	set.add("five");
	
	System.out.println(set.add("one")); //add�޼ҵ�� ����Ÿ���� �Ҹ� �̹� �ߺ��� ���� �ִٸ� false ��ȯ
	bool = set.add("one");
	System.out.println("\"one\"������ �Է� : " + (bool ? "�Է¼���" : "�Է½���"));
	
	System.out.println("�Է��� �������� �� ����: " + set.size());
	
	/*
	 * Set ��� �����͸� ����ϴ� ���
	 * 1.1.5���� for each��
	 * 2.Iterator() �̿�
	 * toArray() �̿�
	 */
	System.out.println("----------------------------------------------------------------");
	//for each
	for(String str : set) {
		System.out.println(str);
	}
	
	System.out.println("----------------------------------------------------------------");
	//Iterator
	Iterator<String> ite = set.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	System.out.println("----------------------------------------------------------------");
	//ToAtrray ������ �迭�� �����ֱ�
	Object [] arr = set.toArray();
	//�迭�� ��������� �迭�� ����ϴ� ��� ��� ��밡��
	//for each
	for(Object obj : arr) {
		System.out.println(obj);
	}
		
	}

}
