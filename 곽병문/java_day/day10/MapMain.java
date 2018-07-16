package kr.co.mlec.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 	Map
 
 	- ���� Ŭ���� : HashMap
				
				TreeMap

		.put(K key, V value)			: ������ �Է�	// ������ ���� ���� ��� ���ο� ������ ��ü�ϰ� ���� �� ��ȯ
		.get(Object Key)				: ������ ����	// Key�� �ش��ϴ� ���� ���� ��� null ��ȯ
		.remove(Object Key)				: ������ ����	// ������ ���� ����, Key�� �ش��ϴ� ���� ���� ��� null ��ȯ
		.containsKey(Object Key)		: Ư��Ű Ȯ��	// Key �� ������ ��� true ��ȯ
		.putAll(Map<K Key, V value>m)	: �ݷ��� �߰�
		.entrySet()						: (key�� value) ���� ǥ���ϴ� Map.Entry ������ ��ȯ
 */

public class MapMain {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		// ���̵� "aaa"�� ȸ���� �н����带 '1234' ����
		Scanner s = new Scanner(System.in);
		System.out.println("�н����� ���漭���Դϴ�");
		System.out.print("���̵� �Է��ϼ��� : ");
		String id = s.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("�Է��Ͻ� ���̴�[" + id + "]�� �������� �ʽ��ϴ�.");
			System.out.println("���񽺸� �����մϴ�");
			System.exit(0);
		}
		
		System.out.print("���� �н����带 �Է��ϼ��� : ");
		String pw = s.nextLine();
		
		if(!map.get(id).equals(pw)) {
			System.out.println("�Է��Ͻ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			System.out.println("���񽺸� �����մϴ�");
			System.exit(0);
		}
		
		System.out.print("������ �н����带 �Է��ϼ��� : ");
		pw = s.nextLine();
		
		map.put(id, pw);
		System.out.print("�н����尡 �����Ǿ����ϴ�.");
		
		System.out.println("< ȸ�� ��� ��� >");
		Set<Entry<String, String>> set = map.entrySet();
		
		Iterator<Entry<String, String>> ite = set.iterator();
		while(ite.hasNext()) {
			Entry<String, String> data = ite.next();
			System.out.println("ID : " + data.getKey() + ", PassWord : " + data.getValue());
		}
		
		for(Entry<String, String> data2 : set) {
			System.out.println("ID : " + data2.getKey() + ", PassWord : " + data2.getValue());			
		}
	}

}
