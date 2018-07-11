package day06;
/*
 * �������� Ư¡
 * 1. Ŭ������� ����
 * 2. ��ȯ���� ������������
 * 3. JVM�� ����Ʈ�����ڸ� �ڵ���������(��, Ŭ�������� ����� �����ڰ� ���������ʴ� ���)
 * 4. �����ε�����
 * 5. ��ü ������� �ʱ�ȭ
 */
class Car {
	String name;
	int price;
	
	Car() {	//�̰� ��� JVM�� ���� new Car�� �˾Ƽ� ó���ϱ⶧���� ������ ��������
		System.out.println("����Ʈ ������ Car() ȣ��...");
	}
	
	Car(int i){
		System.out.println("������ Car(int) ȣ��...");
	}
	Car (String s){
		System.out.println("������ Car(String) ȣ��...");
	}
	Car(String s, double d) {
		System.out.println("������ Car(String, double)  ȣ��...");
	}
	
	void Car() {	//Ŭ������ ���ϸ��� �������,�ҹ��ڷ� �����ϸ� �޼ҵ� 
		System.out.println("void Car()ȣ��...");
	}
}
public class ConstructorMain01 {

	public static void main(String[] args) {
		Car c = new Car();	//�����ڴ� new���̴� ���� �� ����.
		c.Car();
		Car c2 = new Car(10);
		Car c3 = new Car("ab");
		Car c4 = new Car("abc",3.3);
		Car c5 = new Car("abcd",10);
		System.out.println();
		
		c = new Car();
		c.name = "�ҳ�Ÿ";
		c.price = 2700;
		System.out.println();
		
		
		c= new Car("�ҳ�Ÿ", 2700);
		c2 = new Car("�׷���", 3000);
	}

}
