package kr.co.mlec.day07.stat;

public class Employee {
		
	static int totalCnt;
	String name;

	Employee() {
		totalCnt++;
	}
	
	Employee(String str) {
		this.name = str;
		System.out.println(name + " ����� �Ի��߽��ϴ�");
		totalCnt++;
	}
	
	static void employeeInfo() {
		System.out.println("�Ի��� �� �����: " + Employee.totalCnt + "��");
	}
	
	void info() {
		System.out.println("�����: " + name);
	}
	
	
}
