package day05;

class Car{			//�߻�ȭ�� Ŭ����
	String name;   	//main �޼ҵ���� �������� ���������� �θ���.
	int speed;
}

public class CarMain {

	public static void main(String[] args) {

		Car c = new Car();	//instance ��ü(�߻�ȭŬ������ �̿��ؼ� �����ϴ� ��ü�� ����)
	
		System.out.println("name:" + c.name+ ",speed: "+ c.speed);
		c.name = "�ҳ�Ÿ";
		c.speed = 200;
		System.out.println("name:" + c.name+ ",speed: "+ c.speed);
		
		Car c2 = new Car();
		c2.name = "�׷���";
		c2.speed = 220;
		System.out.println("name:" + c2.name+ ",speed: "+ c2.speed);

		
		System.out.println(c);
		System.out.println(c2);
	}

}
