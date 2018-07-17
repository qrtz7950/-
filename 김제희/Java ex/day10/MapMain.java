package kr.co.mlec.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
	Map : Key, Value�� �ѽ����� ������ ����   ����X, Ű�ߺ�X
	 ����Ŭ����
	  - HashMap
	  - TreeMap
	 �ֿ�޼ҵ�
	  - put(K, V)		: ������ �Է�
	  - get(K)			: �ش� key�� value ����
	  - remove(K)		: �ش� key�� ������ ����
	  - containsKey(K)	: �ش� key ���翩�� �ľ�
	  - entrySet()		: Map�� ��� �����͸� Map.Entry��ü�������� ��ȯ
	  - keySet()		: Map�� ��� key�� Set��ü�� ��ȯ
*/


public class MapMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		//���̵� "aaa"�� ȸ���� �н����带 "1234" ����
		
		System.out.println("�ٲ�帲");
		System.out.println("�Ƶ��ӿ���ġ��: ");
		String id = sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println(id + "��� ���̵� ���µ�");
			System.out.println("����");
			System.exit(0);
		} else { 
			
		}
			
		System.out.println("���׾Ƶ� ����Է�: ");
		String password = sc.nextLine();
		if(!map.get(id).equals(password)) {
			System.out.println("�Է��Ͻ� �н������ �ùٸ��� �ʽ��ϴ�");
			System.out.println("���񽺸� �����մϴ�");
			System.exit(0);
		}
		
		System.out.println("������ �н����带 �Է� : ");
		String newPassword = sc.nextLine();
		
		map.put(id, newPassword);
		
		System.out.println("�н����尡 �����Ǿ����ϴ�");
		System.out.println("----------------------------------------------------------------");
		System.out.println("ȸ��������");
		//System.out.println(map.entrySet());
		Set<Entry<String, String>> set = map.entrySet();
		
		/*
		Iterator<Entry<String, String>> ite = set.iterator();
		while(ite.hasNext()) {
			Entry<String, String> data = ite.next();
			System.out.println("���̵� : " + data.getKey() + ", �н����� : "  + data.getValue());
		}
		*/
		
		for(Entry<String, String>  data: set) {
			System.out.println("���̵� : " + data.getKey() + ", �н����� : "  + data.getValue());
		}
		
		//key�� �̾Ƴ��� ����ϴ°� keyset
		
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println("���̵�: " + key + ", �н�����: " + map.get(key));
		}	
		
	}

}
