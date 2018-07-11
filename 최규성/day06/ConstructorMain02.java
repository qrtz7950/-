package day06;

//[this�� �����ھȿ����� ����Ѵ�.]
//�����ڴ� ��ü�� ����� ���� �ʱ�ȭ�ؾ��ϱ� ������ ������ ���� ù�ٿ� ����Ѵ�.

class Member {
	String name; // �ڽ��� ������ ����ϱ� ���ؼ��� ���� this.name���� ���������
	int age; // �����ʾƵ� �ڹٰ� �˾Ƽ� ������ ã���ش�.
	String bloodType;

	Member() {
		this("�˼�����", -1 ,"�˼�����");	//this�� ���� ù�ٿ� ����Ѵ�
		name = "�˼�����";
//		age = -1;
//		bloodType = "�˼�����";
	}
	Member(String name) {
		this(name, -1);
	}
	Member(String name, int age) {
		this(name, age, "��"); 
//		this.name = name;
//		this.age = age;
//		this.bloodType = "�˼�����";
	}
	Member(String name, int age, String bloodType) { //��ü�� �ʱ�ȭ�ϱ� ������ ����� ������ �̸��� ���ߴ°� ����.
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	void info() {
		System.out.println("�̸�: " + this.name + " ����: " + age + " ������: " + bloodType);
	}
}

public class ConstructorMain02 {

	public static void main(String[] args) {

		Member m = new Member();
		m.info();

		Member m2 = new Member("ȫ�浿");
		m2.info();
		
		Member m3 = new Member("���浿" ,23);
		m3.info();
		
		Member m4 = new Member("�ֱ浿", 31, "AB");
		m4.info();
	}

}
