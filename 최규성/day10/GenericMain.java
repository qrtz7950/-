package day10;

import java.util.ArrayList;


/*class MyArrayList <T> {
	private T[] values;				<-�̷������ε� ���������
	MyArrayList (){
		values = new T[10];
	}
}*/

public class GenericMain {

	public static void main(String[] args) {

		ArrayList<String> list2 = new ArrayList<String>();	//<>�� �Ἥ ������ add�� Ÿ���� String���� ����
		list2.add(new String("Hello"));
		// list2.add(new Integer(123));	���ʸ��� ��Ʈ������ ��⶧���� ��Ƽ������ ������
		
		
		
		ArrayList list = new ArrayList();	//
	
		list.add(new String("hello"));	//add�� �迭������ �����Ҽ��ִ�.
		list.add(new Integer(123));		//0�������� ���������� �����
		list.add(new Object());
	
		
		System.out.println((String)list.get(0));
		System.out.println((Integer)list.get(1));
		
		//ex) String val = list.get(0)	=> 0������ ��Ʈ����ü�� ȣ��
		//ex) int size = list.size();     => �迭�� ����� ���� ����
		//ex) list.remove(0);			=> 0������ �����Ͱ� ����, ���� �� 1������ 0������ ��
		//ex) list.remove("123"); 		=>123�� ����� ��� ������ ����
		//ex) boolean b = list.contains("AA")  => AA��� ���� �迭�� �ִ��� ���
		//ex) boolean b = list.Empty() => �迭�� �ƹ��͵� ������ true
		//ex) list.addAll(sub);			=>sub�迭�� list�迭 �ڿ� �߰��� ������ ����(sub�迭�� ����������)
		//ex) list.clear(); 			=>list�迭�� ����
	
	
	}

}
