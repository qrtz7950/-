package kr.co.mlec.day10;

import java.util.ArrayList;

/*
class MyArrayList<T> {

	private T[] values;
	
	public MyArrayList() {
		values = new T[10];
		//�����ڿ��� T�ڸ��� �ڷ�Ÿ���� �Ἥ ����Ʈ�� ������
	}
}
*/


public class GenericMain {

	public static void main(String[] args) {
			
		ArrayList list = new ArrayList();
		
		list.add(new String("hi"));
		list.add(new String("hello"));
		list.add(new Integer(12315));
		list.add(new Object());
		
		System.out.println((String)list.get(0));
		System.out.println((String)list.get(0));
		System.out.println((Integer)list.get(2));
		System.out.println((Object)list.get(3));
		//� ���̴� ���� �� �ִ� ������Ʈ�� ����Ʈ������ ���ٽ� ���� � ������ ����ؾ��ϴ� �������ִ�
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list.add(new String("hi"));
		list.add(new String("hello"));
		//��Ʈ������ ���� �� �ִ� ����Ʈ
		
		
		
	}

}
