package kr.co.mlec.day09.singleton;

public class DogMain {

	public static void main(String[] args) {
//		Dog d = new Dog();
//		Dog d2 = new Dog();
		
		Dog d = Dog.getInstance();
		Dog d2 = Dog.getInstance();
		
		
		System.out.println(d);
		System.out.println(d2);
		//���� �ٸ� ��ü �ٸ� �ּҰ��� ������
		
		//�ϳ��� ��ü���� �����Ͽ� ����ϰ� �ʹٸ� ����ϳ�
		//Dog Ŭ������ �̿��� ��������� ��ü�� ������ �Ѱ��� �ɷ�
		
	}

}
