package kr.co.mlec.day05;

class Car{
	
	String name;			// �������1
	int speed;				// �������2
	
	void open(){
		System.out.println("Nope!");
	}
	
}

public class CarMain {

	public static void main(String[] args) {
		
		Car slow = new Car();		// Car() -> �޸� �Ҵ�� -> instance object
								// ������ �� ��ü ������� �� �ʱ�ȭ��
		slow.name = "������";
		slow.speed = 10;
		slow.open();
		
		System.out.println("name : " + slow.name + "\nspeed : "+ slow.speed + "km/h");
		
		Car fast = new Car();
		
		fast.name = "������";
		fast.speed = 1000;
		System.out.println("name : " + fast.name + "\nspeed : "+ fast.speed + "km/h");
		
		System.out.println(slow + "\n" + fast);
		
		
		
	}
	
}
