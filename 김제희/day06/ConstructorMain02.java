package kr.co.mlec.day06;

class Member {
	String name;
	int age;
	String bloodType;
	
	Member() {
		this("�˼�����");
	}
	
	Member(String name) {
		this(name, -1);
	}
	
	Member(String name, int age) {
		//Member(name, age, "�˼�����"); ����!!!!!!!!!!!
		//�� ���� ������ �߻��ϴµ� Ŭ�������� �̿��Ͽ� �����ڸ� ������ new�� ��߸��Ѵ�
		//������ new Member��� ������� ���ο� ��ü�� �����ϰԵȴ� �׷���
		//������ ������ �����ڸ� ȣ���ϱ����ؼ��� this�� �̿��Ѵ�
		//������ ���� �ƴ� �������� this�� ����� �� ����
		this(name, age, "�˼�����");
		//�����ڰ� ��������� ���� ������ �����ϰų� ����ؾ��ϱ⶧����
		//������ ������ �����ڸ� ȣ���ϱ� ���� this�� ù��° ������ ��ġ�ؾ���
		//ex)
		//System.out.println();
		//this(name, age, "�˼�����");
		//���� �ڵ�� ������ ����
		
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("�̸� : " + name 
				+ ", ���� : " + age + ", ������ : " + bloodType);
	}
	
	//Ŭ���� ������ ��������� ������ ���� ���� �ʰ� �����Ӱ� �� �� ������ �򰥸��ϱ� this.name���� ���� ���� �Ϲ����̴�
	//���� ���� name ������� name �Ѵ� ������ ���������Ͱ� ���� �������� name�� ���� �ִ��� ã�ƺ��� ������ ��������� ���� �̿�
		
}

public class ConstructorMain02 {

	public static void main(String[] args) {
		
		Member m = new Member();
		m.info();
		
		Member m2 = new Member("ȫ�浿");
		m2.info();
		
		Member m3 = new Member("���浿", 23);
		m3.info();
		
		Member m4 = new Member("�ֱ浿", 31, "AB");
		m4.info();
	}
}










