package kr.co.mlec.day06;

/*
 *  �������� Ư¡
 *  1. Ŭ������� ����
 *  2. ��ȯ���� �������� ����
 *  3. HVM�� ����Ʈ������ �ڵ�����(��, Ŭ�������� ����� �����ڰ� �������� �ʴ°��)
 *  4. �����ε� ����
 *  5. ��ü ������� �ʱ�ȭ
 */

class Car{
	String name;
	int price;
	
	Car(int i){
		System.out.println("������ Car(int) ȣ��...");
	}
	
	Car(String name, int price){
		System.out.println("������ Car(str, int) ȣ��...");
		this.name = name;
		this.price = price;
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {
		
		String s = "��";
		int a = 500;
		Car c = new Car(s, a);
		Car c2 = new Car(a);
		
		System.out.println(c.name + " " + c.price);
	}

}
