package kr.co.mlec.day09.singleton;

public class Dog {
	
	private static Dog instance = null;

	private Dog() {
		//�����ڸ� private���ؼ� �����ڸ� ���Ұ��ϰ���
	}
	
	public static Dog getInstance() {
		//�����ڸ� ����� �� ���� ������ ��ü�� ��ȯ�ϴ� �޼ҵ尡 �ʿ�
		//��ü�� ������ �� ���⶧���� static�޼ҵ�� static ��������� �̿��ؾ��Ѵ�
		if(instance == null) { //���������� �ƴ� ����ƽ ���� ���
			instance = new Dog();
		}
		return instance;
	}
	
	//�̷��� Ŭ������ �ϳ��� ��ü���� ����� ����  ���� �����ڸ� private�� �ٲ���Ѵ�
	//�̰��� singleton �����̶�� �Ѵ�
	//�Ʒ��� ���ٷ� ���� ������� ��డ���ϴ�
	//private static final Dog instance = new Dog();
	//�ڸ�ǰ ���丮 ����
	
}
