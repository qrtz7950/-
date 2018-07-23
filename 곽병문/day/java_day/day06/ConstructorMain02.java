package kr.co.mlec.day06;

class Member{
	String name;
	int age;
	String bloodType;
	
	void info() {
		System.out.printf("���̸��� %s, �� ���̴� %d, �� �������� %s, Ž������\n", this.name, this.age, this.bloodType);
	}
	
	Member(){
		this("�˼�����");
	}
	
	Member(String name){
		this(name, -1);
	}
	
	Member(String name, int age){
		this(name, age, "�˼�����");
	}
	
	Member(String name, int age, String blood){
		this.name = name;
		this.age = age;
		this.bloodType = blood;
	}
	
}

public class ConstructorMain02 {

	public static void main(String[] args) {
		
		Member kjh = new Member("������", 24, "A");
		
		kjh.info();
		
		Member cgs = new Member("�ֱԼ�", 25, "AB");
		
		cgs.info();
	}

}
