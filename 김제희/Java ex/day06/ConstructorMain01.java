package kr.co.mlec.day06;

/*
 * �������� Ư¡
 * 1. Ŭ������� ����
 * 2. ��ȯ���� �������� ����
 * 3. JVM�� ����Ʈ������ �ڵ�����(��, Ŭ�������� ����� �����ڰ� �������� �ʴ°��)
 * 4. �����ε� ����
 * 5. ��ü ������� �ʱ�ȭ
 */

class Car {
	String 	name;
	int 	price;
	
	Car() {
		System.out.println("����Ʈ ������ Car() ȣ��...");
	}
	
	Car(int i) {
		System.out.println("������ Car(int) ȣ��...");
	}
	
	Car(String s) {
		System.out.println("������ Car(String) ȣ��...");
	}
	
	Car(String s, double d) {
		System.out.println("������ Car(String, double) ȣ��...");
	}
	
	//�տ� ��ȯ���� ����� �� �̻� �����ڰ� �ƴ϶� �Ϲ� �޼ҵ尡 �ȴ�
	void car() {//������ �̸��� ������ ���� ���� ���� ����̱� ������ �ҹ��ڷ� �޼ҵ� �̸��� ���ش�
		System.out.println("void Car() ȣ��...");
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {
		Car c = new Car();
		c.car();
		Car c2 = new Car(10);
		Car c3 = new Car("ab");
		Car c4 = new Car("abc", 3.45);
		Car c5 = new Car("abcd", 10); //int-<doble ������ ������ ����ȯ
		
		c = new Car("�ҳ�Ÿ",2700);
		c2 = new Car("�׷���",2400);
	}	
}








