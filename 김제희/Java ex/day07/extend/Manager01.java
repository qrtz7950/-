package kr.co.mlec.day07.extend;

public class Manager01 extends Employee {
		
	Employee [] empList; //���� ������
	
	Manager01(){
		
	}
	
	Manager01(int no, String name, int salary, String grade, Employee[] empList) {
		super(no,name,salary,grade);
		//���� Ŭ������ �����ڸ� ȣ���� 
		//���� Ŭ������ �Ű������� ���� �����ڰ� ������ super(); ȣ��� ����
		//���÷��̸� ����� �Ŵ����� ��ü�� �����ϸ� ���������δ� ���÷��̿� �Ŵ��� �ΰ��� �ν���Ʈ ��ü�� �����ϱ⶧����
		//���� Ŭ������ �����ڸ� ȣ���� ���÷����� ������ ���������Ѵ�
		//this.�� ����ص� �ǳ� ���� ����Ŭ������ ��������� �����ϱ����ؼ��� super.�� ����ؾ���
		//this.no = no;
		//this.name = name; 	// super.name = name;
		//this.salary = salary;
		//this.grade = grade;
		this.empList=empList;
	}
	
	void info() {
		super.info();
		System.out.println("====================================");
		System.out.println("            ������� ����Ʈ                                ");
		System.out.println("====================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("====================================");
	}
}
