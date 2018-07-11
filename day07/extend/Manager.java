package kr.co.mlec.day07.extend;

import java.util.Arrays;

public class Manager {
		
	int no;			//�����ȣ
	String name;	//�����
	int salary;		//����
	String grade;	//����
	
	Employee [] empList; //���� ������
	
	Manager(int no, String name, int salary, String grade, Employee[] empList) {
		this.no=no;
		this.name=name;
		this.salary=salary;
		this.grade=grade;
		this.empList=empList;
	}
	
	void info() {
		System.out.print("��ȣ: " + no);
		System.out.print(" �̸�: " + name);
		System.out.print(" ����: " + salary);
		System.out.print(" ����: " + grade + " \n");
		System.out.println("====================================");
		System.out.println("            ������� ����Ʈ                                ");
		System.out.println("====================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("====================================");
	}
}
