package day10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.ArrayList;
import java.util.List;

/*
 * List : �ߺ���� ��������
 * ���� Ŭ���� 
 * 	-ArrayList
 * 	-LinkedList
 * �ֿ�޼ҵ�
 *  -add :������ �Է�
 *  -addAll: �ٸ� List�� ��ü �Է�
 *  -get: ������ ����
 *  -remove: ������ ������ ����
 *  -clear: ��ü �����ͻ���
 *  -size: ��ü ������ ����
 *  -contains: ������ �˻�
 *  -isEmpty: �迭�� ����ִ��� üũ
 *  -iterator: ���ͷ����� ��ü�� ��ȯ
 */

public class ListMain {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");
		list.add("FIVE");
		
		System.out.println("< INDEX�� �̿��� ��� >");
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("1.5������ for���� �ƿ��� ���");
		for(String str : list) {
			System.out.println(str);
		}
		
		/*		Iterator(��ȯ��) �ֿ� �޼ҵ�
		 * 		hasNext() : �������� ���翩�θ� �Ǵ�(true, false)
		 * 		next() :    ������ ���
		 */
		System.out.println("< iterator�� �̿��� ��� >");
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("list �迭�� ������ ���� : "+ list.size() +"��");
		list.add("One");
		System.out.println("\"one\" �߰��� ������ ���� :" + list.size() +"��");
		
		System.out.println("1������ ��ġ�� ������: " + list.get(1));
		list.add(1,  "SIX");
		System.out.println("1������ ��ġ�� ������: " + list.get(1));
		
		int[] arr = new int[10];
		for(int i = 0; i<5;i++) {
			arr[i] =i+1;
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 4 ; i >=1; i--) {
			arr[i+1] = arr[i];
		}
		
		System.out.println(list.remove("SIX")? "���� ����" : "��������");
		
		if(list.contains("SIX")) {
			System.out.println(" \"SIX\"���ڿ��� �����մϴ�.");
		} else {
			System.out.println(" \"SIX\"���ڿ��� ���������ʽ��ϴ�.");
		}
		
		System.out.println("0���� ������ : " + list.get(0));
		System.out.println("������ 0���� ������:" + list.remove(0));
		System.out.println("0���� ������ : " + list.get(0));
		
		System.out.println("������ ����: "+ list.size());
		list.clear();
		System.out.println("������ ����: "+ list.size());

		if(list.isEmpty()) {
			System.out.println("�迭�� ����ֽ��ϴ�.");
		} else {
			System.out.println("�迭�� ��������ʽ��ϴ�.");
		}
	}

}
