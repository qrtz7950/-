package day09.exam;

//�ϳ��� Ŭ������ �ϳ��� ��ü�� ����� ��츦 Singleton �����̶�� �Ѵ�.

public class Dog {

	private static Dog instance = null;
	
/*	private static final Dog instance = new Dog();	
	�̷��� ���� ���� getInstance�� �����ʾƵ��ȴ�.
	���� �̱����� ����Ҷ��� �̷��� ���Եȴ�.
*/	
	private Dog() {
	}
	
	
	
	public static Dog getInstance(){	//Dog�� �����̺��̱� ������ ���� Ŭ�������� �����Ͽ�
		//return new Dog();		//Main���� �����ְ� �Ҽ��ִ�.������ ���ο��� ȣ���Ҽ����⶧���� public static�� ���δ�.
		
		//��ü�� �ѹ��� �����ϱ� ����
		if(instance == null) {
			instance = new Dog();
		}
		return instance;
	}						//�����ϸ� d,d2�� �ϳ��� ��ü �ּҰ��� ����Ų��.
}
