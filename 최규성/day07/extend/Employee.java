package day07.extend;

public class Employee {

	int no;			//�����ȣ
	String name;	//�����
	int salary;		//����
	String grade;	//����

	Employee(){	
		//�Ű������� ���� ����Ʈ �����ڸ� �����ؾ� Manager01�����ڿ��� ������ �ȳ���.
	}
	
	Employee(int no, String name, int salary, String grade){
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	void info() {
		System.out.println("��ȣ: " + no);
		System.out.println("�̸�: " + name);
		System.out.println("����: " + salary);
		System.out.println("����: " + grade);
	}

}
