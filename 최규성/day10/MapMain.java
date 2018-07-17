package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;	//Map Ŭ�����ȿ� EntryŬ������ ���ԵǾ��ִ�.
import java.util.Scanner;
import java.util.Set;

/*
 * Map : Key, Value�� �ѽ����� ������ ���� (���� x, Ű�ߺ� x)
 * ����Ŭ����
 * 	-HashMap
 * 	-TreeMap
 * �ֿ�޼ҵ�
 * 	-put(K,V)	:������ �Է�
 * 	-get(k) 	:�ش� key�� value ����
 * 	-remove(K) 	:�ش� key�� ������ ����
 * 	-containsKey(k) 	:�ش� key�� ���翩�� �ľ�
 * 	-entrySet()	 	:Map�� ��� �����͸� Map.Entry��ü�������� ��ȯ
 * 	-keySet() 	:Map�� ���key�� Set��ü�� ��ȯ
 * 
 */
public class MapMain {

	public static void main(String[] args) {

		Map<String, String> map  = new HashMap<>();
		
		map.put("aaa","1111");
		map.put("bbb","2222");
		map.put("ccc","3333");
		map.put("ddd","4444");
		
		//���̵� 'aaa'�� ȸ���� �н����带 '1234'�� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�н����� ���� �����Դϴ�");
		System.out.println("���̵� �Է��ϼ��� : ");
		String id =  sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("�Է��Ͻ� ���̵�[" + id + "] �� ���������ʽ��ϴ�.");
			System.out.println("���񽺸� �����մϴ�");
			System.exit(0);
		}
		
		System.out.println("���� �н����带 �Է��ϼ���: ");
		String password = sc.nextLine();
		
		if(!map.get(id).equals(password)) {
			System.out.println("�Է��Ͻ� �н������ �ùٸ��� �ʽ��ϴ�");
			System.out.println("���񽺸� �����մϴ�.");
			System.exit(0);
		}
		
		System.out.println("������ �н����带 �Է�: ");
		String newPassword = sc.nextLine();
		
		map.put(id, newPassword);
		
		System.out.println("�н����尡 �����Ǿ����ϴ�.");
		
		System.out.println("< ȸ����� ���>");
		
		// 1	(������ �°� �������� �ʴ´�)
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("���̵�: " + key+ ", �н�����: "+ map.get(key));
		}
		//  or 2	(aaa, bbb, ccc, ddd������ ����)
/*
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> ite = set.iterator();
		
		
		while(ite.hasNext()) {
			Entry<String, String> data = ite.next();
			System.out.println("���̵�:" + data.getKey()+ ", �н�����: "+ data.getValue());
		} Ȥ�� ���� for��
		
		
		for(Entry<String, String> data : set) {
			System.out.println("���̵�:" + data.getKey()+ ", �н�����: "+ data.getValue());
		}
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
