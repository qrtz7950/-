package kr.co.mlec.day07.extend;

public class Employee {
		
	int no;			//�����ȣ
	String name;	//�����
	int salary;		//����
	String grade;	//����
	
	Employee(){
	}
	
	Employee(int no, String name, int salary, String grade) {
		this.no=no;
		this.name=name;
		this.salary=salary;
		this.grade=grade;
		
	}
	
	void info() {
		System.out.print("��ȣ: " + no);
		System.out.print(" �̸�: " + name);
		System.out.print(" ����: " + salary);
		System.out.print(" ����: " + grade + " \n");
	}
	
}
